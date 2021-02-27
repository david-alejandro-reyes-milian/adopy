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
package com.example.androiddevchallenge.model

import com.thedeanda.lorem.Lorem
import com.thedeanda.lorem.LoremIpsum
import java.util.Random

val pics = listOf(
    "https://cdn.shibe.online/shibes/80ec360a89ec0f4b8db1a5f199d64e2c88a74d8a.jpg",
    "https://cdn.shibe.online/shibes/45ac78716acde97a79cbd2d9d4b4aab0c0429256.jpg",
    "https://cdn.shibe.online/shibes/d8168c2771f1bb7d3665b2a3f43cb2ab16507dfc.jpg",
    "https://cdn.shibe.online/shibes/d8450676888d4b607c6040fae5c04635bcce35c4.jpg",
    "https://cdn.shibe.online/shibes/98034b02a9212472bfcf3ede561a9346c6d074e8.jpg",
    "https://cdn.shibe.online/shibes/cdf1c47b3c642cb699fba20e1a45ea476f8ff6e6.jpg",
    "https://cdn.shibe.online/shibes/d35f0c594103893490659affb68bbf3a591bea31.jpg",
    "https://cdn.shibe.online/shibes/a409e60e214eb27f93b3b073f4a212dc5d3d260f.jpg",
    "https://cdn.shibe.online/shibes/a8f2d56e3d2ba627e8121010f8f37102d032ea71.jpg",
    "https://cdn.shibe.online/shibes/a93ea6974844bdfc078cac4a192cef6fa47f285b.jpg",
    "https://cdn.shibe.online/shibes/455aa0390825f9e09421c3ae9ccb9b2abbb69885.jpg",
    "https://cdn.shibe.online/shibes/bdac24a29cef2b7a3e720a1d36f43e326e40fb4d.jpg",
    "https://cdn.shibe.online/shibes/829d81dec706b043d2f12c9fc10120b8fba5a0ad.jpg",
    "https://cdn.shibe.online/shibes/354374c35df71000ea7888bfc46bf70bc1602684.jpg",
    "https://cdn.shibe.online/shibes/f0c07a7205d95577861eee382b4c8899ac620351.jpg",
    "https://cdn.shibe.online/shibes/3743f59af254a14c1ffe90228a288ef925a873ca.jpg",
    "https://cdn.shibe.online/shibes/0dc0b7a6584429cb769653f1fa4e4f0ef8098bf1.jpg",
    "https://cdn.shibe.online/shibes/16a07a698cf56f2eea8245b63f34432298a79a49.jpg",
    "https://cdn.shibe.online/shibes/79aa94c0f2913fb403f46fbf6cecc3d58a040a17.jpg",
    "https://cdn.shibe.online/shibes/00871f0ad9d85a6ba6f2a5504ac05ec3c1ac0f25.jpg",
    "https://cdn.shibe.online/shibes/e54625c0e225c473f863ccd7b9ba68d30d92cef8.jpg",
    "https://cdn.shibe.online/shibes/1ead29b02501e1dd293355199a9ffcbd3ef08cfc.jpg",
    "https://cdn.shibe.online/shibes/148182629abd620c88a5efe1e030aa67a5bf4efd.jpg",
    "https://cdn.shibe.online/shibes/a2d9fef9c70b6a508f7cc6c451a735de9d9ce79c.jpg",
    "https://cdn.shibe.online/shibes/24497a630be6912b165e9708f082e00048133086.jpg",
    "https://cdn.shibe.online/shibes/3d19522ee3026d7659ba348ec9e619a5ffe7f153.jpg",
    "https://cdn.shibe.online/shibes/54757c3328448a50625632817aadfa4263fc47d9.jpg",
    "https://cdn.shibe.online/shibes/f7727de8a47c7efff28dada163ad7ec150539d83.jpg",
    "https://cdn.shibe.online/shibes/a476529f8b47aa1d9a60885e7531d91a7c6ad07f.jpg",
    "https://cdn.shibe.online/shibes/b52c64ea3d9cf9f56c7dfcea4f618343da74bb02.jpg",
    "https://cdn.shibe.online/shibes/7ecc0293cba1ce86369e8f26102ecc70235e68d3.jpg",
    "https://cdn.shibe.online/shibes/6032a75b89b01d0d9f14a14a5813b095ab15ed3e.jpg",
    "https://cdn.shibe.online/shibes/efaeee89b99c74cdd150f7edd755fbe21338ee4d.jpg",
    "https://cdn.shibe.online/shibes/f5005b9fdd733f6fb7233eee9dfd4c4c2c42e59c.jpg",
    "https://cdn.shibe.online/shibes/a5e335ccf0b9cca0ea3ed5eb61180902670e762c.jpg",
    "https://cdn.shibe.online/shibes/5e1c9523851b3d99ca16b07b9750b6781876fb41.jpg",
    "https://cdn.shibe.online/shibes/722c5c77d7837fde41f70b4d727327d15a8e4546.jpg",
    "https://cdn.shibe.online/shibes/a1f6c1175ddb92de0ea54af8f028e856cbe722d6.jpg",
    "https://cdn.shibe.online/shibes/45861677217a38e7495dd8a8a3f97b76860171b3.jpg",
    "https://cdn.shibe.online/shibes/b5a7640aa6130a3e13040ae82016e8b75fa99e59.jpg",
    "https://cdn.shibe.online/shibes/9f065d054f843d976871be86157e6abc22e33a90.jpg",
    "https://cdn.shibe.online/shibes/1fd83c4261fd1c2325e3232912f238f1c222e0b4.jpg",
    "https://cdn.shibe.online/shibes/b746bd1c6cd3de3de0ea56dfb2d379d3fe299c55.jpg",
    "https://cdn.shibe.online/shibes/582d0872bdb0c0b03bf2740a603d34ab01a917d1.jpg",
    "https://cdn.shibe.online/shibes/8d5ca097fceff79e8c36e3b4bcd1126a1c11fd6e.jpg",
    "https://cdn.shibe.online/shibes/37d76e8c93e6e53c0117b590ebaa50bc24aa99ed.jpg",
    "https://cdn.shibe.online/shibes/37d2bdb288a4bed46373454ae94ae280e6215e81.jpg",
    "https://cdn.shibe.online/shibes/0dc0b7a6584429cb769653f1fa4e4f0ef8098bf1.jpg",
    "https://cdn.shibe.online/shibes/f36e20a8470c93d0ccba0ae16be43e2b5b67998b.jpg",
    "https://cdn.shibe.online/shibes/bd6acd02680ab24ac620286943aca2044cf85035.jpg",
    "https://cdn.shibe.online/shibes/f3f2db5ea03b222f3debabf17e04fcd5039ae886.jpg",
    "https://cdn.shibe.online/shibes/43f3a1dbc7c810ca69e7d3dddcae8a94a2be4086.jpg",
    "https://cdn.shibe.online/shibes/3caa36bf323b78420e8e44163bfa98d94812aeee.jpg",
    "https://cdn.shibe.online/shibes/cbccd83413aa0ebf74e543363b4deb924948cfc2.jpg",
    "https://cdn.shibe.online/shibes/e258d84c076c75183b1891044308c0f5e36cba8a.jpg",
    "https://cdn.shibe.online/shibes/9b79a8263b1963b70f2fa63be7f10e5e339851f3.jpg",
    "https://cdn.shibe.online/shibes/a13feecdbcb3e0fee9204f607dce4c445ea5251c.jpg",
    "https://cdn.shibe.online/shibes/e4a90fa2c4f2493172d9e85a7e93c2a47eede3a5.jpg",
    "https://cdn.shibe.online/shibes/ad6a9f0428f234d37196618f21710a5a40938a6b.jpg",
    "https://cdn.shibe.online/shibes/9fe20f105c0a333579ef655280370228a61821a1.jpg",
    "https://cdn.shibe.online/shibes/5d0d58c50f26a3570cf6e28bc92c75d195123327.jpg",
    "https://cdn.shibe.online/shibes/a298701b088beb8f53fa5ab80a6a0360d5fd3dc5.jpg",
    "https://cdn.shibe.online/shibes/dd449e43b80edc02325705fc099e4cda40bac36e.jpg",
    "https://cdn.shibe.online/shibes/3e46611c0268ae25ec824b7b0025f6c925bf080f.jpg",
    "https://cdn.shibe.online/shibes/6a1ef70a21d06e9716d0e73ad2faaa70db798394.jpg",
    "https://cdn.shibe.online/shibes/7548014cf82335ccc3e8a2917607b218e40e1cce.jpg",
    "https://cdn.shibe.online/shibes/be39c685dcc2f6d1f7f22160790a7c701956fb02.jpg",
    "https://cdn.shibe.online/shibes/23efb1e47e0c860724a333aba56aaca24be97b9f.jpg",
    "https://cdn.shibe.online/shibes/b6f62932e01214b641521e4e7836bcd05ed7ea58.jpg",
    "https://cdn.shibe.online/shibes/df667ae70c8d76774385fab69457a76840945bd1.jpg",
    "https://cdn.shibe.online/shibes/881f6952db0ba4dbe9d9673845cf77c5aec30570.jpg",
    "https://cdn.shibe.online/shibes/7a1c4ae96c59567af680719fc9deac1c98c2e542.jpg",
    "https://cdn.shibe.online/shibes/887b8462e026424e13fc6dff789dab9fae966905.jpg",
    "https://cdn.shibe.online/shibes/6b8ce198dd302a0af09d2c6a183dbdf7f726899e.jpg",
    "https://cdn.shibe.online/shibes/f6f26c406e417fc2205ec982fdd2de147b46296e.jpg",
    "https://cdn.shibe.online/shibes/3e62183126fc10450f301984d6de8c204e2c7f59.jpg",
    "https://cdn.shibe.online/shibes/1a02b49ce2e487f7f4b20f02e0e004f10c7a46f2.jpg",
    "https://cdn.shibe.online/shibes/be06093e6b6a65f86a6bd49553f1e3228a39b11a.jpg",
    "https://cdn.shibe.online/shibes/7c5fe6a8328b5c5b003dd9177f041d77025294af.jpg",
    "https://cdn.shibe.online/shibes/c324267dbde96a9922dca9adf79f5e9021ec4a5f.jpg",
    "https://cdn.shibe.online/shibes/15ba9e8e067aa1b4e0b9c7f95f36643bf22ba6cc.jpg",
    "https://cdn.shibe.online/shibes/8458e76194e2d2210a9c952c748655b08823eb52.jpg",
    "https://cdn.shibe.online/shibes/76d64e95f942fb9408e908412ce748c56437d8b2.jpg",
    "https://cdn.shibe.online/shibes/bc1c0accd8288f6cb6dc8746213f9ab63da38461.jpg",
    "https://cdn.shibe.online/shibes/6032a75b89b01d0d9f14a14a5813b095ab15ed3e.jpg",
    "https://cdn.shibe.online/shibes/659de901fc4ceca90afb4bcd7f973a1a4dac7849.jpg",
    "https://cdn.shibe.online/shibes/57fdfdbd6803c302909e1889ed9279f35a248d12.jpg",
    "https://cdn.shibe.online/shibes/2616df5efde79c521d28020e10cc90942dc249af.jpg",
    "https://cdn.shibe.online/shibes/12b45a2884e230f62ee5d96f1173fab04f4d6086.jpg",
    "https://cdn.shibe.online/shibes/edf0e8752ef9eec666a88b350d02d65608e7b38c.jpg",
    "https://cdn.shibe.online/shibes/200e6d9ae89479c2b3ade3f47d24920a9ac0ab9b.jpg",
    "https://cdn.shibe.online/shibes/bf8a77d387b59c61e764877200f7b4e728c9cab2.jpg",
    "https://cdn.shibe.online/shibes/a48f82c781d8498e8d135800a86a4d6ac0b9d553.jpg",
    "https://cdn.shibe.online/shibes/fd66d5289408f1afa063360ac48a91fe67f98365.jpg",
    "https://cdn.shibe.online/shibes/1a1ad1e70f546b4c706eb4896e29a57df1001d7c.jpg",
    "https://cdn.shibe.online/shibes/e71fb7d5156057dc0a6eb2857217b20ac3489073.jpg",
    "https://cdn.shibe.online/shibes/a82c956d10f3f26135f3ff15ead4601a9e43c42c.jpg",
    "https://cdn.shibe.online/shibes/b377304a4a81eae5ca8222000535da058ceef266.jpg",
    "https://cdn.shibe.online/shibes/6cb6d542d1f5b923a551914084d3afde6138c6af.jpg",
    "https://cdn.shibe.online/shibes/c861818169c185f3ea75d75a8f23239e6a5575f1.jpg"
)

val names = listOf(
    "Max",
    "Buddy",
    "Charlie",
    "Jack",
    "Cooper",
    "Rocky",
    "Toby",
    "Tucker",
    "Jake",
    "Bear",
    "Duke",
    "Teddy",
    "Oliver",
    "Riley",
    "Bailey",
    "Bentley",
    "Milo",
    "Buster",
    "Cody",
    "Dexter",
    "Winston",
    "Murphy",
    "Leo",
    "Lucky",
    "Oscar",
    "Louie",
    "Zeus",
    "Henry",
    "Sam",
    "Harley",
    "Baxter",
    "Gus",
    "Sammy",
    "Jackson",
    "Bruno",
    "Diesel",
    "Jax",
    "Gizmo",
    "Bandit",
    "Rusty",
    "Marley",
    "Jasper",
    "Brody",
    "Roscoe",
    "Hank",
    "Otis",
    "Bo",
    "Joey",
    "Beau",
    "Ollie",
    "Tank",
    "Shadow",
    "Peanut",
    "Hunter",
    "Scout"
)

var lorem: Lorem = LoremIpsum.getInstance()
val puppies = getPuppies(200)
fun getPuppies(count: Int): List<Puppy> {
    val list = mutableListOf<Puppy>()
    for (i in 0..count) {
        val puppy = Puppy(
            id = i,
            imageUrl = pics.random(),
            name = names.random(),
            ageInMonths = Random().nextInt(20),
            sex = Sex.values().random(),
            breed = Breed.values().random(),
            price = Random().nextLong(),
            description = lorem.getParagraphs(2, 5)
        )
        list.add(puppy)
    }
    return list.toList()
}
