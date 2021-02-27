/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.components.AdopyDivider
import com.example.androiddevchallenge.ui.components.AdopyScaffold
import com.example.androiddevchallenge.ui.components.SnackImage
import com.example.androiddevchallenge.ui.theme.AdopyTheme
import dev.chrisbanes.accompanist.insets.statusBarsPadding

private val TitleHeight = 128.dp
private val HzPadding = Modifier.padding(horizontal = 24.dp)

@Composable
fun PuppyDetailScreen(navController: NavHostController) {
    val puppy = navController.previousBackStackEntry?.arguments?.getParcelable<Puppy>("puppy")
    checkNotNull(puppy)
    AdopyScaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Filled.ArrowBack, "")
                    }
                },
                elevation = 12.dp,
                title = { Text(puppy.name) },
                backgroundColor = AdopyTheme.colors.uiFloated,
            )
        },
        content = {
            Content(puppy)
        }
    )
}

@Composable
private fun Content(puppy: Puppy) {
    Column {
        SnackImage(
            shape = RectangleShape,
            imageUrl = puppy.imageUrl,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
        )
        Header(puppy)
        Text(
            text = puppy.description,
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 24.dp)
        )
    }
}

val puppy = puppies[0]

@Preview
@Composable
fun Preview() {
    Content(puppy)
}

@Composable
private fun Header(puppy: Puppy) {
    val ageLabel = if (puppy.ageInMonths == 1) "1 month" else "${puppy.ageInMonths} months"
    Column(
        modifier = Modifier
            .heightIn(min = TitleHeight)
            .statusBarsPadding()
            .background(color = AdopyTheme.colors.uiBackground)
    ) {
        Spacer(Modifier.height(16.dp))
        Row {
            Column {
                Text(
                    text = puppy.name,
                    style = MaterialTheme.typography.h4,
                    color = AdopyTheme.colors.textSecondary,
                    modifier = HzPadding
                )
                Text(
                    text = puppy.breed.name.replace('_', ' '),
                    style = MaterialTheme.typography.subtitle2,
                    fontSize = 20.sp,
                    color = AdopyTheme.colors.textHelp,
                    modifier = HzPadding
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = ageLabel,
                    style = MaterialTheme.typography.h6,
                    color = AdopyTheme.colors.textPrimary,
                    modifier = HzPadding
                )
            }
        }

        Spacer(Modifier.height(8.dp))
        AdopyDivider()
    }
}
