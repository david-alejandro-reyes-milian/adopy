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

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.Route
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.puppies
import com.example.androiddevchallenge.ui.components.AdopyScaffold
import com.example.androiddevchallenge.ui.components.PuppyCardItem
import com.example.androiddevchallenge.ui.theme.AdopyTheme

@Composable
fun HomeScreen(navController: NavHostController) {
    AdopyScaffold(
        topBar = {
            TopAppBar(
                title = { Text("Puppies") },
                backgroundColor = AdopyTheme.colors.uiFloated,
            )
        },
        content = {
            PuppyList(puppies) {
                navController.currentBackStackEntry?.arguments?.putParcelable("puppy", it)
                navController.navigate(Route.LIST)
            }
        }
    )
}

@Composable
fun PuppyList(puppies: List<Puppy>, onClick: (Puppy) -> Unit) {
    LazyColumn {
        itemsIndexed(puppies) { _, puppy ->
            PuppyCardItem(puppy = puppy, onClick = { onClick(puppy) })
        }
    }
}
