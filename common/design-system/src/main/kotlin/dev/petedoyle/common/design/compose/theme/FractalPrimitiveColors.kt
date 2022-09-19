/*
 * Copyright (C) 2022 Pete Doyle
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.petedoyle.common.design.compose.theme

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

// /////////////////////////////////////////////////////////////////////////
// GENERATED. Do not edit by hand.
// /////////////////////////////////////////////////////////////////////////

val LocalFractalPrimitiveColors = staticCompositionLocalOf<FractalPrimitiveColors> { FractalLightPrimitiveColors() }

interface FractalPrimitiveColors {
    val blue050: MutableState<Color>
    val blue100: MutableState<Color>
    val blue200: MutableState<Color>
    val blue300: MutableState<Color>
    val blue400: MutableState<Color>
    val blue500: MutableState<Color>
    val blue600: MutableState<Color>
    val blue700: MutableState<Color>
    val blue800: MutableState<Color>
    val gray0: MutableState<Color>
    val gray050: MutableState<Color>
    val gray100: MutableState<Color>
    val gray1000: MutableState<Color>
    val gray150: MutableState<Color>
    val gray200: MutableState<Color>
    val gray300: MutableState<Color>
    val gray400: MutableState<Color>
    val gray500: MutableState<Color>
    val gray600: MutableState<Color>
    val gray700: MutableState<Color>
    val gray800: MutableState<Color>
    val gray900: MutableState<Color>
    val green050: MutableState<Color>
    val green100: MutableState<Color>
    val green200: MutableState<Color>
    val green300: MutableState<Color>
    val green400: MutableState<Color>
    val green500: MutableState<Color>
    val green600: MutableState<Color>
    val green700: MutableState<Color>
    val green800: MutableState<Color>
    val pink050: MutableState<Color>
    val pink100: MutableState<Color>
    val pink200: MutableState<Color>
    val pink300: MutableState<Color>
    val pink400: MutableState<Color>
    val pink500: MutableState<Color>
    val pink600: MutableState<Color>
    val pink700: MutableState<Color>
    val pink800: MutableState<Color>
    val red050: MutableState<Color>
    val red100: MutableState<Color>
    val red200: MutableState<Color>
    val red300: MutableState<Color>
    val red400: MutableState<Color>
    val red500: MutableState<Color>
    val red600: MutableState<Color>
    val red700: MutableState<Color>
    val red800: MutableState<Color>
    val yellow050: MutableState<Color>
    val yellow100: MutableState<Color>
    val yellow200: MutableState<Color>
    val yellow300: MutableState<Color>
    val yellow400: MutableState<Color>
    val yellow500: MutableState<Color>
    val yellow600: MutableState<Color>
    val yellow700: MutableState<Color>
    val yellow800: MutableState<Color>
}

@Stable
class FractalLightPrimitiveColors : FractalPrimitiveColors {
    override val blue050 = mutableStateOf(Color(0xffe8f2fe))
    override val blue100 = mutableStateOf(Color(0xffb7d6fa))
    override val blue200 = mutableStateOf(Color(0xff9ec2f8))
    override val blue300 = mutableStateOf(Color(0xff64a6f5))
    override val blue400 = mutableStateOf(Color(0xff4695f3))
    override val blue500 = mutableStateOf(Color(0xff187af0))
    override val blue600 = mutableStateOf(Color(0xff166fda))
    override val blue700 = mutableStateOf(Color(0xff1157aa))
    override val blue800 = mutableStateOf(Color(0xff0d4384))
    override val gray0 = mutableStateOf(Color(0xffffffff))
    override val gray050 = mutableStateOf(Color(0xfff6f6f6))
    override val gray100 = mutableStateOf(Color(0xffe2e2e2))
    override val gray1000 = mutableStateOf(Color(0xff000000))
    override val gray150 = mutableStateOf(Color(0xffd4d4d4))
    override val gray200 = mutableStateOf(Color(0xffc6c6c6))
    override val gray300 = mutableStateOf(Color(0xffa9a9a9))
    override val gray400 = mutableStateOf(Color(0xff8d8d8d))
    override val gray500 = mutableStateOf(Color(0xff707070))
    override val gray600 = mutableStateOf(Color(0xff5a5a5a))
    override val gray700 = mutableStateOf(Color(0xff444444))
    override val gray800 = mutableStateOf(Color(0xff2d2d2d))
    override val gray900 = mutableStateOf(Color(0xff161616))
    override val green050 = mutableStateOf(Color(0xffe7f6f1))
    override val green100 = mutableStateOf(Color(0xffb5e2d3))
    override val green200 = mutableStateOf(Color(0xff91d4be))
    override val green300 = mutableStateOf(Color(0xff5fc0a0))
    override val green400 = mutableStateOf(Color(0xff40b48d))
    override val green500 = mutableStateOf(Color(0xff10a171))
    override val green600 = mutableStateOf(Color(0xff0f9367))
    override val green700 = mutableStateOf(Color(0xff0b7250))
    override val green800 = mutableStateOf(Color(0xff09593e))
    override val pink050 = mutableStateOf(Color(0xfffff6f8))
    override val pink100 = mutableStateOf(Color(0xfffee2e8))
    override val pink200 = mutableStateOf(Color(0xfffdd4dd))
    override val pink300 = mutableStateOf(Color(0xfffcc1cd))
    override val pink400 = mutableStateOf(Color(0xfffcb5c3))
    override val pink500 = mutableStateOf(Color(0xfffba2b4))
    override val pink600 = mutableStateOf(Color(0xffe493a4))
    override val pink700 = mutableStateOf(Color(0xffb27380))
    override val pink800 = mutableStateOf(Color(0xff8a5963))
    override val red050 = mutableStateOf(Color(0xfffbeae9))
    override val red100 = mutableStateOf(Color(0xfff3bfbc))
    override val red200 = mutableStateOf(Color(0xffeea09c))
    override val red300 = mutableStateOf(Color(0xffe6756e))
    override val red400 = mutableStateOf(Color(0xffe15a52))
    override val red500 = mutableStateOf(Color(0xffd93127))
    override val red600 = mutableStateOf(Color(0xffc52d23))
    override val red700 = mutableStateOf(Color(0xff9a231c))
    override val red800 = mutableStateOf(Color(0xff771b15))
    override val yellow050 = mutableStateOf(Color(0xfffff9e8))
    override val yellow100 = mutableStateOf(Color(0xffffebb7))
    override val yellow200 = mutableStateOf(Color(0xffffe194))
    override val yellow300 = mutableStateOf(Color(0xffffd364))
    override val yellow400 = mutableStateOf(Color(0xffffcb45))
    override val yellow500 = mutableStateOf(Color(0xffffbe17))
    override val yellow600 = mutableStateOf(Color(0xffe8ad15))
    override val yellow700 = mutableStateOf(Color(0xffb58710))
    override val yellow800 = mutableStateOf(Color(0xff8c690d))
}

@Stable
class FractalDarkPrimitiveColors : FractalPrimitiveColors {
    override val blue050 = mutableStateOf(Color(0xff275286))
    override val blue100 = mutableStateOf(Color(0xff326aad))
    override val blue200 = mutableStateOf(Color(0xff4088dd))
    override val blue300 = mutableStateOf(Color(0xff4695f3))
    override val blue400 = mutableStateOf(Color(0xff6baaf5))
    override val blue500 = mutableStateOf(Color(0xff83b8f7))
    override val blue600 = mutableStateOf(Color(0xffaacef9))
    override val blue700 = mutableStateOf(Color(0xffc6defb))
    override val blue800 = mutableStateOf(Color(0xffedf4fe))
    override val gray0 = mutableStateOf(Color(0xff161616))
    override val gray050 = mutableStateOf(Color(0xff212121))
    override val gray100 = mutableStateOf(Color(0xff404040))
    override val gray1000 = mutableStateOf(Color(0xffffffff))
    override val gray150 = mutableStateOf(Color(0xff525252))
    override val gray200 = mutableStateOf(Color(0xff616161))
    override val gray300 = mutableStateOf(Color(0xff787878))
    override val gray400 = mutableStateOf(Color(0xff949494))
    override val gray500 = mutableStateOf(Color(0xffadadad))
    override val gray600 = mutableStateOf(Color(0xffcccccc))
    override val gray700 = mutableStateOf(Color(0xffd9d9d9))
    override val gray800 = mutableStateOf(Color(0xffe8e8e8))
    override val gray900 = mutableStateOf(Color(0xfff7f7f7))
    override val green050 = mutableStateOf(Color(0xff23634e))
    override val green100 = mutableStateOf(Color(0xff2d8064))
    override val green200 = mutableStateOf(Color(0xff3aa480))
    override val green300 = mutableStateOf(Color(0xff40b48d))
    override val green400 = mutableStateOf(Color(0xff66c3a4))
    override val green500 = mutableStateOf(Color(0xff7fcdb3))
    override val green600 = mutableStateOf(Color(0xffa7ddcb))
    override val green700 = mutableStateOf(Color(0xffc4e8dc))
    override val green800 = mutableStateOf(Color(0xffecf8f4))
    override val pink050 = mutableStateOf(Color(0xff8b646b))
    override val pink100 = mutableStateOf(Color(0xffb3818a))
    override val pink200 = mutableStateOf(Color(0xffe5a5b1))
    override val pink300 = mutableStateOf(Color(0xfffcb5c3))
    override val pink400 = mutableStateOf(Color(0xfffdc4cf))
    override val pink500 = mutableStateOf(Color(0xfffdcdd7))
    override val pink600 = mutableStateOf(Color(0xfffedde3))
    override val pink700 = mutableStateOf(Color(0xfffee8ec))
    override val pink800 = mutableStateOf(Color(0xfffff8f9))
    override val red050 = mutableStateOf(Color(0xff7c322d))
    override val red100 = mutableStateOf(Color(0xffa0403a))
    override val red200 = mutableStateOf(Color(0xffcd524b))
    override val red300 = mutableStateOf(Color(0xffe15a52))
    override val red400 = mutableStateOf(Color(0xffe77b75))
    override val red500 = mutableStateOf(Color(0xffeb908b))
    override val red600 = mutableStateOf(Color(0xfff1b3af))
    override val red700 = mutableStateOf(Color(0xfff6ccc9))
    override val red800 = mutableStateOf(Color(0xfffcefee))
    override val yellow050 = mutableStateOf(Color(0xff8c7026))
    override val yellow100 = mutableStateOf(Color(0xffb59031))
    override val yellow200 = mutableStateOf(Color(0xffe8b93f))
    override val yellow300 = mutableStateOf(Color(0xffffcb45))
    override val yellow400 = mutableStateOf(Color(0xffffd56a))
    override val yellow500 = mutableStateOf(Color(0xffffdc82))
    override val yellow600 = mutableStateOf(Color(0xffffe7a9))
    override val yellow700 = mutableStateOf(Color(0xffffefc5))
    override val yellow800 = mutableStateOf(Color(0xfffffaec))
}
