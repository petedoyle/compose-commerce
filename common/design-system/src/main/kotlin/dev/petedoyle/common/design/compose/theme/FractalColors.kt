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

val LocalFractalColors = staticCompositionLocalOf<FractalColors> { FractalLightColors(FractalLightPrimitiveColors()) }

@Stable
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
class FractalLightColors(p: FractalPrimitiveColors) : FractalColors {
    override val accent = p.blue400
    override val accentActive = p.blue500
    override val accentDisabled = p.blue200
    override val accentHover = p.blue600
    override val backgroundPrimary = p.gray0
    override val backgroundSecondary = p.gray050
    override val badgeBlue = p.blue100
    override val onBadgeBlue = p.blue800
    override val badgeGray = p.gray100
    override val onBadgeGray = p.gray1000
    override val badgeGreen = p.green100
    override val onBadgeGreen = p.green800
    override val badgeRed = p.red100
    override val onBadgeRed = p.red800
    override val badgeYellow = p.yellow100
    override val onBadgeYellow = p.yellow800
    override val borderError = p.red500
    override val borderErrorActive = p.red600
    override val borderErrorDisabled = p.red100
    override val borderErrorHover = p.red700
    override val borderPrimary = p.gray150
    override val borderPrimaryActive = p.blue500
    override val borderPrimaryDisabled = p.gray100
    override val borderPrimaryHover = p.gray500
    override val borderSecondary = p.gray1000
    override val borderSuccess = p.green500
    override val borderWarning = p.yellow500
    override val errorPrimary = p.red500
    override val errorPrimaryActive = p.red600
    override val errorPrimaryDisabled = p.red050
    override val errorPrimaryHover = p.red400
    override val errorSecondary = mutableStateOf(Color.Transparent)
    override val errorSecondaryActive = p.red100
    override val errorSecondaryDisabled = mutableStateOf(Color.Transparent)
    override val errorSecondaryHover = p.red050
    override val onErrorDisabled = p.red100
    override val onErrorPrimary = p.gray0
    override val onErrorSecondary = p.red500
    override val onBackground = p.gray1000
    override val onBackgroundError = p.red600
    override val onBackgroundPrimaryDisabled = p.gray150
    override val onBackgroundSecondaryDisabled = p.gray300
    override val onBackgroundSuccess = p.green600
    override val onBackgroundVariant1 = p.gray700
    override val onBackgroundVariant2 = p.gray500
    override val onBackgroundWarning = p.yellow800
    override val onPrimary = p.gray0
    override val onPrimaryDisabled = p.gray300
    override val onSecondary = p.gray1000
    override val onSecondaryDisabled = p.gray200
    override val onSurface = p.gray1000
    override val onSurfaceDisabled = p.gray150
    override val onSurfaceError = p.red600
    override val onSurfaceSuccess = p.green600
    override val onSurfaceVariant1 = p.gray700
    override val onSurfaceVariant2 = p.gray500
    override val onSurfaceWarning = p.yellow800
    override val outlinePrimary = p.gray1000
    override val outlineQuaternary = p.red100
    override val outlineSecondary = p.gray0
    override val outlineTertiary = p.blue100
    override val primary = p.gray1000
    override val primaryActive = p.gray900
    override val primaryDisabled = p.gray100
    override val primaryHover = p.gray800
    override val secondary = mutableStateOf(Color.Transparent)
    override val secondaryActive = p.gray150
    override val secondaryDisabled = mutableStateOf(Color.Transparent)
    override val secondaryHover = p.gray100
    override val onSuccessPrimary = p.gray0
    override val successPrimary = p.green500
    override val surface = p.gray0
    override val surfaceActive = p.gray100
    override val surfaceHover = p.gray050
    override val onWarningPrimary = mutableStateOf(Color.Black) // TODO staticBlack
    override val warningPrimary = p.yellow500
}

@Stable
class FractalDarkColors(p: FractalPrimitiveColors) : FractalColors {
    override val accent = p.blue400
    override val accentActive = p.blue500
    override val accentDisabled = p.blue200
    override val accentHover = p.blue600
    override val backgroundPrimary = p.gray0
    override val backgroundSecondary = p.gray050
    override val badgeBlue = p.blue100
    override val onBadgeBlue = p.blue800
    override val badgeGray = p.gray100
    override val onBadgeGray = p.gray1000
    override val badgeGreen = p.green100
    override val onBadgeGreen = p.green800
    override val badgeRed = p.red100
    override val onBadgeRed = p.red800
    override val badgeYellow = p.yellow100
    override val onBadgeYellow = p.yellow800
    override val borderError = p.red500
    override val borderErrorActive = p.red600
    override val borderErrorDisabled = p.red100
    override val borderErrorHover = p.red700
    override val borderPrimary = p.gray150
    override val borderPrimaryActive = p.blue500
    override val borderPrimaryDisabled = p.gray100
    override val borderPrimaryHover = p.gray500
    override val borderSecondary = p.gray1000
    override val borderSuccess = p.green500
    override val borderWarning = p.yellow500
    override val errorPrimary = p.red500
    override val errorPrimaryActive = p.red600
    override val errorPrimaryDisabled = p.red050
    override val errorPrimaryHover = p.red400
    override val errorSecondary = mutableStateOf(Color.Transparent)
    override val errorSecondaryActive = p.red100
    override val errorSecondaryDisabled = mutableStateOf(Color.Transparent)
    override val errorSecondaryHover = p.red050
    override val onErrorDisabled = p.red100
    override val onErrorPrimary = p.gray0
    override val onErrorSecondary = p.red500
    override val onBackground = p.gray1000
    override val onBackgroundError = p.red600
    override val onBackgroundPrimaryDisabled = p.gray150
    override val onBackgroundSecondaryDisabled = p.gray300
    override val onBackgroundSuccess = p.green600
    override val onBackgroundVariant1 = p.gray700
    override val onBackgroundVariant2 = p.gray500
    override val onBackgroundWarning = p.yellow800
    override val onPrimary = p.gray0
    override val onPrimaryDisabled = p.gray300
    override val onSecondary = p.gray1000
    override val onSecondaryDisabled = p.gray200
    override val onSurface = p.gray1000
    override val onSurfaceDisabled = p.gray300
    override val onSurfaceError = p.red600
    override val onSurfaceSuccess = p.green600
    override val onSurfaceVariant1 = p.gray700
    override val onSurfaceVariant2 = p.gray500
    override val onSurfaceWarning = p.yellow800
    override val outlinePrimary = p.gray1000
    override val outlineQuaternary = p.red100
    override val outlineSecondary = p.gray0
    override val outlineTertiary = p.blue100
    override val primary = p.gray1000
    override val primaryActive = p.gray900
    override val primaryDisabled = p.gray100
    override val primaryHover = p.gray800
    override val secondary = mutableStateOf(Color.Transparent)
    override val secondaryActive = p.gray150
    override val secondaryDisabled = mutableStateOf(Color.Transparent)
    override val secondaryHover = p.gray100
    override val onSuccessPrimary = p.gray0
    override val successPrimary = p.green500
    override val surface = p.gray0
    override val surfaceActive = p.gray100
    override val surfaceHover = p.gray050
    override val onWarningPrimary = mutableStateOf(Color.Black) // TODO staticBlack
    override val warningPrimary = p.yellow500
}
