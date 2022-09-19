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

val LocalFractalColors = staticCompositionLocalOf<FractalColors> { FractalLightColors() }

interface FractalColors {
    val accent: MutableState<Color>
    val accentActive: MutableState<Color>
    val accentDisabled: MutableState<Color>
    val accentHover: MutableState<Color>
    val backgroundPrimary: MutableState<Color>
    val backgroundSecondary: MutableState<Color>
    val badgeBlue: MutableState<Color>
    val onBadgeBlue: MutableState<Color>
    val badgeGray: MutableState<Color>
    val onBadgeGray: MutableState<Color>
    val badgeGreen: MutableState<Color>
    val onBadgeGreen: MutableState<Color>
    val badgeRed: MutableState<Color>
    val onBadgeRed: MutableState<Color>
    val badgeYellow: MutableState<Color>
    val onBadgeYellow: MutableState<Color>
    val borderError: MutableState<Color>
    val borderErrorActive: MutableState<Color>
    val borderErrorDisabled: MutableState<Color>
    val borderErrorHover: MutableState<Color>
    val borderPrimary: MutableState<Color>
    val borderPrimaryActive: MutableState<Color>
    val borderPrimaryDisabled: MutableState<Color>
    val borderPrimaryHover: MutableState<Color>
    val borderSecondary: MutableState<Color>
    val borderSuccess: MutableState<Color>
    val borderWarning: MutableState<Color>
    val brandPink: MutableState<Color>
    val errorPrimary: MutableState<Color>
    val errorPrimaryActive: MutableState<Color>
    val errorPrimaryDisabled: MutableState<Color>
    val errorPrimaryHover: MutableState<Color>
    val errorSecondary: MutableState<Color>
    val errorSecondaryActive: MutableState<Color>
    val errorSecondaryDisabled: MutableState<Color>
    val errorSecondaryHover: MutableState<Color>
    val onErrorDisabled: MutableState<Color>
    val onErrorPrimary: MutableState<Color>
    val onErrorSecondary: MutableState<Color>
    val onBackground: MutableState<Color>
    val onBackgroundError: MutableState<Color>
    val onBackgroundPrimaryDisabled: MutableState<Color>
    val onBackgroundSecondaryDisabled: MutableState<Color>
    val onBackgroundSuccess: MutableState<Color>
    val onBackgroundVariant1: MutableState<Color>
    val onBackgroundVariant2: MutableState<Color>
    val onBackgroundWarning: MutableState<Color>
    val onPrimary: MutableState<Color>
    val onPrimaryDisabled: MutableState<Color>
    val onSecondary: MutableState<Color>
    val onSecondaryDisabled: MutableState<Color>
    val onSurface: MutableState<Color>
    val onSurfaceDisabled: MutableState<Color>
    val onSurfaceError: MutableState<Color>
    val onSurfaceSuccess: MutableState<Color>
    val onSurfaceVariant1: MutableState<Color>
    val onSurfaceVariant2: MutableState<Color>
    val onSurfaceWarning: MutableState<Color>
    val outlinePrimary: MutableState<Color>
    val outlineQuaternary: MutableState<Color>
    val outlineSecondary: MutableState<Color>
    val outlineTertiary: MutableState<Color>
    val primary: MutableState<Color>
    val primaryActive: MutableState<Color>
    val primaryDisabled: MutableState<Color>
    val primaryHover: MutableState<Color>
    val secondary: MutableState<Color>
    val secondaryActive: MutableState<Color>
    val secondaryDisabled: MutableState<Color>
    val secondaryHover: MutableState<Color>
    val onSuccessPrimary: MutableState<Color>
    val successPrimary: MutableState<Color>
    val surface: MutableState<Color>
    val surfaceActive: MutableState<Color>
    val surfaceHover: MutableState<Color>
    val onWarningPrimary: MutableState<Color>
    val warningPrimary: MutableState<Color>
}

@Stable
class FractalLightColors : FractalColors {
    override val accent = mutableStateOf(Color(0xff187af0))
    override val accentActive = mutableStateOf(Color(0xff1157aa))
    override val accentDisabled = mutableStateOf(Color(0xff9ec2f8))
    override val accentHover = mutableStateOf(Color(0xff166fda))
    override val backgroundPrimary = mutableStateOf(Color(0xffffffff))
    override val backgroundSecondary = mutableStateOf(Color(0xfff6f6f6))
    override val badgeBlue = mutableStateOf(Color(0xffb7d6fa))
    override val onBadgeBlue = mutableStateOf(Color(0xff0d4384))
    override val badgeGray = mutableStateOf(Color(0xffe2e2e2))
    override val onBadgeGray = mutableStateOf(Color(0xff000000))
    override val badgeGreen = mutableStateOf(Color(0xffb5e2d3))
    override val onBadgeGreen = mutableStateOf(Color(0xff09593e))
    override val badgeRed = mutableStateOf(Color(0xfff3bfbc))
    override val onBadgeRed = mutableStateOf(Color(0xff771b15))
    override val badgeYellow = mutableStateOf(Color(0xffffebb7))
    override val onBadgeYellow = mutableStateOf(Color(0xff8c690d))
    override val borderError = mutableStateOf(Color(0xffd93127))
    override val borderErrorActive = mutableStateOf(Color(0xffc52d23))
    override val borderErrorDisabled = mutableStateOf(Color(0xfff3bfbc))
    override val borderErrorHover = mutableStateOf(Color(0xff9a231c))
    override val borderPrimary = mutableStateOf(Color(0xffd4d4d4))
    override val borderPrimaryActive = mutableStateOf(Color(0xff187af0))
    override val borderPrimaryDisabled = mutableStateOf(Color(0xffe2e2e2))
    override val borderPrimaryHover = mutableStateOf(Color(0xff707070))
    override val borderSecondary = mutableStateOf(Color(0xff000000))
    override val borderSuccess = mutableStateOf(Color(0xff10a171))
    override val borderWarning = mutableStateOf(Color(0xffffbe17))
    override val brandPink = mutableStateOf(Color(0xfffba2b4))
    override val errorPrimary = mutableStateOf(Color(0xffd93127))
    override val errorPrimaryActive = mutableStateOf(Color(0xffc52d23))
    override val errorPrimaryDisabled = mutableStateOf(Color(0xfffbeae9))
    override val errorPrimaryHover = mutableStateOf(Color(0xffe15a52))
    override val errorSecondary = mutableStateOf(Color(0x00ffffff))
    override val errorSecondaryActive = mutableStateOf(Color(0xfff3bfbc))
    override val errorSecondaryDisabled = mutableStateOf(Color(0x00ffffff))
    override val errorSecondaryHover = mutableStateOf(Color(0xfffbeae9))
    override val onErrorDisabled = mutableStateOf(Color(0xfff3bfbc))
    override val onErrorPrimary = mutableStateOf(Color(0xffffffff))
    override val onErrorSecondary = mutableStateOf(Color(0xffd93127))
    override val onBackground = mutableStateOf(Color(0xff000000))
    override val onBackgroundError = mutableStateOf(Color(0xffc52d23))
    override val onBackgroundPrimaryDisabled = mutableStateOf(Color(0xffd4d4d4))
    override val onBackgroundSecondaryDisabled = mutableStateOf(Color(0xffa9a9a9))
    override val onBackgroundSuccess = mutableStateOf(Color(0xff0f9367))
    override val onBackgroundVariant1 = mutableStateOf(Color(0xff444444))
    override val onBackgroundVariant2 = mutableStateOf(Color(0xff707070))
    override val onBackgroundWarning = mutableStateOf(Color(0xff8c690d))
    override val onPrimary = mutableStateOf(Color(0xffffffff))
    override val onPrimaryDisabled = mutableStateOf(Color(0xffa9a9a9))
    override val onSecondary = mutableStateOf(Color(0xff000000))
    override val onSecondaryDisabled = mutableStateOf(Color(0xffc6c6c6))
    override val onSurface = mutableStateOf(Color(0xff000000))
    override val onSurfaceDisabled = mutableStateOf(Color(0xffd4d4d4))
    override val onSurfaceError = mutableStateOf(Color(0xffc52d23))
    override val onSurfaceSuccess = mutableStateOf(Color(0xff0f9367))
    override val onSurfaceVariant1 = mutableStateOf(Color(0xff444444))
    override val onSurfaceVariant2 = mutableStateOf(Color(0xff707070))
    override val onSurfaceWarning = mutableStateOf(Color(0xff8c690d))
    override val outlinePrimary = mutableStateOf(Color(0xff000000))
    override val outlineQuaternary = mutableStateOf(Color(0xfff3bfbc))
    override val outlineSecondary = mutableStateOf(Color(0xffffffff))
    override val outlineTertiary = mutableStateOf(Color(0xffb7d6fa))
    override val primary = mutableStateOf(Color(0xff000000))
    override val primaryActive = mutableStateOf(Color(0xff161616))
    override val primaryDisabled = mutableStateOf(Color(0xffe2e2e2))
    override val primaryHover = mutableStateOf(Color(0xff2d2d2d))
    override val secondary = mutableStateOf(Color(0x00ffffff))
    override val secondaryActive = mutableStateOf(Color(0xffd4d4d4))
    override val secondaryDisabled = mutableStateOf(Color(0x00000000))
    override val secondaryHover = mutableStateOf(Color(0xffe2e2e2))
    override val onSuccessPrimary = mutableStateOf(Color(0xffffffff))
    override val successPrimary = mutableStateOf(Color(0xff10a171))
    override val surface = mutableStateOf(Color(0xffffffff))
    override val surfaceActive = mutableStateOf(Color(0xffe2e2e2))
    override val surfaceHover = mutableStateOf(Color(0xfff6f6f6))
    override val onWarningPrimary = mutableStateOf(Color(0xff000000))
    override val warningPrimary = mutableStateOf(Color(0xffffbe17))

}

@Stable
class FractalDarkColors : FractalColors {
    override val accent = mutableStateOf(Color(0xff83b8f7))
    override val accentActive = mutableStateOf(Color(0xffaacef9))
    override val accentDisabled = mutableStateOf(Color(0xff4088dd))
    override val accentHover = mutableStateOf(Color(0xff6baaf5))
    override val backgroundPrimary = mutableStateOf(Color(0xff161616))
    override val backgroundSecondary = mutableStateOf(Color(0xff212121))
    override val badgeBlue = mutableStateOf(Color(0xff326aad))
    override val onBadgeBlue = mutableStateOf(Color(0xffedf4fe))
    override val badgeGray = mutableStateOf(Color(0xff404040))
    override val onBadgeGray = mutableStateOf(Color(0xffffffff))
    override val badgeGreen = mutableStateOf(Color(0xff2d8064))
    override val onBadgeGreen = mutableStateOf(Color(0xffecf8f4))
    override val badgeRed = mutableStateOf(Color(0xffa0403a))
    override val onBadgeRed = mutableStateOf(Color(0xfffcefee))
    override val badgeYellow = mutableStateOf(Color(0xffb59031))
    override val onBadgeYellow = mutableStateOf(Color(0xfffffaec))
    override val borderError = mutableStateOf(Color(0xffeb908b))
    override val borderErrorActive = mutableStateOf(Color(0xffeb908b))
    override val borderErrorDisabled = mutableStateOf(Color(0xff7c322d))
    override val borderErrorHover = mutableStateOf(Color(0xffe77b75))
    override val borderPrimary = mutableStateOf(Color(0xff404040))
    override val borderPrimaryActive = mutableStateOf(Color(0xff83b8f7))
    override val borderPrimaryDisabled = mutableStateOf(Color(0xff404040))
    override val borderPrimaryHover = mutableStateOf(Color(0xffadadad))
    override val borderSecondary = mutableStateOf(Color(0xffffffff))
    override val borderSuccess = mutableStateOf(Color(0xff7fcdb3))
    override val borderWarning = mutableStateOf(Color(0xffffdc82))
    override val brandPink = mutableStateOf(Color(0xfffdcdd7))
    override val errorPrimary = mutableStateOf(Color(0xffeb908b))
    override val errorPrimaryActive = mutableStateOf(Color(0xfff1b3af))
    override val errorPrimaryDisabled = mutableStateOf(Color(0xff7c322d))
    override val errorPrimaryHover = mutableStateOf(Color(0xffe77b75))
    override val errorSecondary = mutableStateOf(Color(0x00161616))
    override val errorSecondaryActive = mutableStateOf(Color(0xffa0403a))
    override val errorSecondaryDisabled = mutableStateOf(Color(0x00161616))
    override val errorSecondaryHover = mutableStateOf(Color(0xff7c322d))
    override val onErrorDisabled = mutableStateOf(Color(0xffa0403a))
    override val onErrorPrimary = mutableStateOf(Color(0xff161616))
    override val onErrorSecondary = mutableStateOf(Color(0xffeb908b))
    override val onBackground = mutableStateOf(Color(0xffffffff))
    override val onBackgroundError = mutableStateOf(Color(0xfff1b3af))
    override val onBackgroundPrimaryDisabled = mutableStateOf(Color(0xff525252))
    override val onBackgroundSecondaryDisabled = mutableStateOf(Color(0xff525252))
    override val onBackgroundSuccess = mutableStateOf(Color(0xffa7ddcb))
    override val onBackgroundVariant1 = mutableStateOf(Color(0xffd9d9d9))
    override val onBackgroundVariant2 = mutableStateOf(Color(0xffadadad))
    override val onBackgroundWarning = mutableStateOf(Color(0xfffffaec))
    override val onPrimary = mutableStateOf(Color(0xff161616))
    override val onPrimaryDisabled = mutableStateOf(Color(0xff787878))
    override val onSecondary = mutableStateOf(Color(0xffffffff))
    override val onSecondaryDisabled = mutableStateOf(Color(0xff616161))
    override val onSurface = mutableStateOf(Color(0xffffffff))
    override val onSurfaceDisabled = mutableStateOf(Color(0xff525252))
    override val onSurfaceError = mutableStateOf(Color(0xfff1b3af))
    override val onSurfaceSuccess = mutableStateOf(Color(0xffa7ddcb))
    override val onSurfaceVariant1 = mutableStateOf(Color(0xffd9d9d9))
    override val onSurfaceVariant2 = mutableStateOf(Color(0xffadadad))
    override val onSurfaceWarning = mutableStateOf(Color(0xfffffaec))
    override val outlinePrimary = mutableStateOf(Color(0xffffffff))
    override val outlineQuaternary = mutableStateOf(Color(0xffa0403a))
    override val outlineSecondary = mutableStateOf(Color(0xff161616))
    override val outlineTertiary = mutableStateOf(Color(0xff326aad))
    override val primary = mutableStateOf(Color(0xffffffff))
    override val primaryActive = mutableStateOf(Color(0xfff7f7f7))
    override val primaryDisabled = mutableStateOf(Color(0xff404040))
    override val primaryHover = mutableStateOf(Color(0xffe8e8e8))
    override val secondary = mutableStateOf(Color(0x00000000))
    override val secondaryActive = mutableStateOf(Color(0xff525252))
    override val secondaryDisabled = mutableStateOf(Color(0x00161616))
    override val secondaryHover = mutableStateOf(Color(0xff404040))
    override val onSuccessPrimary = mutableStateOf(Color(0xff161616))
    override val successPrimary = mutableStateOf(Color(0xff7fcdb3))
    override val surface = mutableStateOf(Color(0xff161616))
    override val surfaceActive = mutableStateOf(Color(0xff404040))
    override val surfaceHover = mutableStateOf(Color(0xff212121))
    override val onWarningPrimary = mutableStateOf(Color(0xff000000))
    override val warningPrimary = mutableStateOf(Color(0xffffdc82))
}
