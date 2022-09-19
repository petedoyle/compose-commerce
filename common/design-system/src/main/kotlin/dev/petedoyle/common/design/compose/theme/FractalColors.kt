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

val LocalFractalColors = staticCompositionLocalOf<FractalColors> { FractalLightColors() }

interface FractalColors {
    val accent_accent: MutableState<Color>
    val accent_accentactive: MutableState<Color>
    val accent_accentdisabled: MutableState<Color>
    val accent_accenthover: MutableState<Color>
    val background_backgroundprimary: MutableState<Color>
    val background_backgroundsecondary: MutableState<Color>
    val badges_blue_badgeblue: MutableState<Color>
    val badges_blue_onbadgeblue: MutableState<Color>
    val badges_gray_badgegray: MutableState<Color>
    val badges_gray_onbadgegray: MutableState<Color>
    val badges_green_badgegreen: MutableState<Color>
    val badges_green_onbadgegreen: MutableState<Color>
    val badges_red_badgered: MutableState<Color>
    val badges_red_onbadgered: MutableState<Color>
    val badges_yellow_badgeyellow: MutableState<Color>
    val badges_yellow_onbadgeyellow: MutableState<Color>
    val border_error_bordererror: MutableState<Color>
    val border_error_bordererroractive: MutableState<Color>
    val border_error_bordererrordisabled: MutableState<Color>
    val border_error_bordererrorhover: MutableState<Color>
    val border_primary_borderprimary: MutableState<Color>
    val border_primary_borderprimaryactive: MutableState<Color>
    val border_primary_borderprimarydisabled: MutableState<Color>
    val border_primary_borderprimaryhover: MutableState<Color>
    val border_secondary_bordersecondary: MutableState<Color>
    val border_success_bordersuccess: MutableState<Color>
    val border_warning_borderwarning: MutableState<Color>
    val brand_brandpink: MutableState<Color>
    val error_error_errorprimary: MutableState<Color>
    val error_error_errorprimaryactive: MutableState<Color>
    val error_error_errorprimarydisabled: MutableState<Color>
    val error_error_errorprimaryhover: MutableState<Color>
    val error_error_errorsecondary: MutableState<Color>
    val error_error_errorsecondaryactive: MutableState<Color>
    val error_error_errorsecondarydisabled: MutableState<Color>
    val error_error_errorsecondaryhover: MutableState<Color>
    val error_onerror_onerrordisabled: MutableState<Color>
    val error_onerror_onerrorprimary: MutableState<Color>
    val error_onerror_onerrorsecondary: MutableState<Color>
    val onbackground_onbackground: MutableState<Color>
    val onbackground_onbackgrounderror: MutableState<Color>
    val onbackground_onbackgroundprimarydisabled: MutableState<Color>
    val onbackground_onbackgroundsecondarydisabled: MutableState<Color>
    val onbackground_onbackgroundsuccess: MutableState<Color>
    val onbackground_onbackgroundvariant1: MutableState<Color>
    val onbackground_onbackgroundvariant2: MutableState<Color>
    val onbackground_onbackgroundwarning: MutableState<Color>
    val onprimary_onprimary: MutableState<Color>
    val onprimary_onprimarydisabled: MutableState<Color>
    val onsecondary_onsecondary: MutableState<Color>
    val onsecondary_onsecondarydisabled: MutableState<Color>
    val onsurface_onsurface: MutableState<Color>
    val onsurface_onsurfacedisabled: MutableState<Color>
    val onsurface_onsurfaceerror: MutableState<Color>
    val onsurface_onsurfacesuccess: MutableState<Color>
    val onsurface_onsurfacevariant1: MutableState<Color>
    val onsurface_onsurfacevariant2: MutableState<Color>
    val onsurface_onsurfacewarning: MutableState<Color>
    val outline_outlineprimary: MutableState<Color>
    val outline_outlinequaternary: MutableState<Color>
    val outline_outlinesecondary: MutableState<Color>
    val outline_outlinetertiary: MutableState<Color>
    val primary_primary: MutableState<Color>
    val primary_primaryactive: MutableState<Color>
    val primary_primarydisabled: MutableState<Color>
    val primary_primaryhover: MutableState<Color>
    val primitives_blue_blue050: MutableState<Color>
    val primitives_blue_blue100: MutableState<Color>
    val primitives_blue_blue200: MutableState<Color>
    val primitives_blue_blue300: MutableState<Color>
    val primitives_blue_blue400: MutableState<Color>
    val primitives_blue_blue500: MutableState<Color>
    val primitives_blue_blue600: MutableState<Color>
    val primitives_blue_blue700: MutableState<Color>
    val primitives_blue_blue800: MutableState<Color>
    val primitives_gray_gray0: MutableState<Color>
    val primitives_gray_gray050: MutableState<Color>
    val primitives_gray_gray100: MutableState<Color>
    val primitives_gray_gray1000: MutableState<Color>
    val primitives_gray_gray150: MutableState<Color>
    val primitives_gray_gray200: MutableState<Color>
    val primitives_gray_gray300: MutableState<Color>
    val primitives_gray_gray400: MutableState<Color>
    val primitives_gray_gray500: MutableState<Color>
    val primitives_gray_gray600: MutableState<Color>
    val primitives_gray_gray700: MutableState<Color>
    val primitives_gray_gray800: MutableState<Color>
    val primitives_gray_gray900: MutableState<Color>
    val primitives_green_green050: MutableState<Color>
    val primitives_green_green100: MutableState<Color>
    val primitives_green_green200: MutableState<Color>
    val primitives_green_green300: MutableState<Color>
    val primitives_green_green400: MutableState<Color>
    val primitives_green_green500: MutableState<Color>
    val primitives_green_green600: MutableState<Color>
    val primitives_green_green700: MutableState<Color>
    val primitives_green_green800: MutableState<Color>
    val primitives_pink_pink050: MutableState<Color>
    val primitives_pink_pink100: MutableState<Color>
    val primitives_pink_pink200: MutableState<Color>
    val primitives_pink_pink300: MutableState<Color>
    val primitives_pink_pink400: MutableState<Color>
    val primitives_pink_pink500: MutableState<Color>
    val primitives_pink_pink600: MutableState<Color>
    val primitives_pink_pink700: MutableState<Color>
    val primitives_pink_pink800: MutableState<Color>
    val primitives_red_red050: MutableState<Color>
    val primitives_red_red100: MutableState<Color>
    val primitives_red_red200: MutableState<Color>
    val primitives_red_red300: MutableState<Color>
    val primitives_red_red400: MutableState<Color>
    val primitives_red_red500: MutableState<Color>
    val primitives_red_red600: MutableState<Color>
    val primitives_red_red700: MutableState<Color>
    val primitives_red_red800: MutableState<Color>
    val primitives_yellow_yellow050: MutableState<Color>
    val primitives_yellow_yellow100: MutableState<Color>
    val primitives_yellow_yellow200: MutableState<Color>
    val primitives_yellow_yellow300: MutableState<Color>
    val primitives_yellow_yellow400: MutableState<Color>
    val primitives_yellow_yellow500: MutableState<Color>
    val primitives_yellow_yellow600: MutableState<Color>
    val primitives_yellow_yellow700: MutableState<Color>
    val primitives_yellow_yellow800: MutableState<Color>
    val secondary_secondary: MutableState<Color>
    val secondary_secondaryactive: MutableState<Color>
    val secondary_secondarydisabled: MutableState<Color>
    val secondary_secondaryhover: MutableState<Color>
    val success_onsuccess_onsuccessprimary: MutableState<Color>
    val success_success_successprimary: MutableState<Color>
    val surface_surface: MutableState<Color>
    val surface_surfaceactive: MutableState<Color>
    val surface_surfacehover: MutableState<Color>
    val warning_onwarning_onwarningprimary: MutableState<Color>
    val warning_warning_warningprimary: MutableState<Color>
}

@Stable
class FractalLightColors : FractalColors {
    override val accent_accent = mutableStateOf(Color(0xff187af0))
    override val accent_accentactive = mutableStateOf(Color(0xff1157aa))
    override val accent_accentdisabled = mutableStateOf(Color(0xff9ec2f8))
    override val accent_accenthover = mutableStateOf(Color(0xff166fda))
    override val background_backgroundprimary = mutableStateOf(Color(0xffffffff))
    override val background_backgroundsecondary = mutableStateOf(Color(0xfff6f6f6))
    override val badges_blue_badgeblue = mutableStateOf(Color(0xffb7d6fa))
    override val badges_blue_onbadgeblue = mutableStateOf(Color(0xff0d4384))
    override val badges_gray_badgegray = mutableStateOf(Color(0xffe2e2e2))
    override val badges_gray_onbadgegray = mutableStateOf(Color(0xff000000))
    override val badges_green_badgegreen = mutableStateOf(Color(0xffb5e2d3))
    override val badges_green_onbadgegreen = mutableStateOf(Color(0xff09593e))
    override val badges_red_badgered = mutableStateOf(Color(0xfff3bfbc))
    override val badges_red_onbadgered = mutableStateOf(Color(0xff771b15))
    override val badges_yellow_badgeyellow = mutableStateOf(Color(0xffffebb7))
    override val badges_yellow_onbadgeyellow = mutableStateOf(Color(0xff8c690d))
    override val border_error_bordererror = mutableStateOf(Color(0xffd93127))
    override val border_error_bordererroractive = mutableStateOf(Color(0xffc52d23))
    override val border_error_bordererrordisabled = mutableStateOf(Color(0xfff3bfbc))
    override val border_error_bordererrorhover = mutableStateOf(Color(0xff9a231c))
    override val border_primary_borderprimary = mutableStateOf(Color(0xffd4d4d4))
    override val border_primary_borderprimaryactive = mutableStateOf(Color(0xff187af0))
    override val border_primary_borderprimarydisabled = mutableStateOf(Color(0xffe2e2e2))
    override val border_primary_borderprimaryhover = mutableStateOf(Color(0xff707070))
    override val border_secondary_bordersecondary = mutableStateOf(Color(0xff000000))
    override val border_success_bordersuccess = mutableStateOf(Color(0xff10a171))
    override val border_warning_borderwarning = mutableStateOf(Color(0xffffbe17))
    override val brand_brandpink = mutableStateOf(Color(0xfffba2b4))
    override val error_error_errorprimary = mutableStateOf(Color(0xffd93127))
    override val error_error_errorprimaryactive = mutableStateOf(Color(0xffc52d23))
    override val error_error_errorprimarydisabled = mutableStateOf(Color(0xfffbeae9))
    override val error_error_errorprimaryhover = mutableStateOf(Color(0xffe15a52))
    override val error_error_errorsecondary = mutableStateOf(Color(0x00ffffff))
    override val error_error_errorsecondaryactive = mutableStateOf(Color(0xfff3bfbc))
    override val error_error_errorsecondarydisabled = mutableStateOf(Color(0x00ffffff))
    override val error_error_errorsecondaryhover = mutableStateOf(Color(0xfffbeae9))
    override val error_onerror_onerrordisabled = mutableStateOf(Color(0xfff3bfbc))
    override val error_onerror_onerrorprimary = mutableStateOf(Color(0xffffffff))
    override val error_onerror_onerrorsecondary = mutableStateOf(Color(0xffd93127))
    override val onbackground_onbackground = mutableStateOf(Color(0xff000000))
    override val onbackground_onbackgrounderror = mutableStateOf(Color(0xffc52d23))
    override val onbackground_onbackgroundprimarydisabled = mutableStateOf(Color(0xffd4d4d4))
    override val onbackground_onbackgroundsecondarydisabled = mutableStateOf(Color(0xffa9a9a9))
    override val onbackground_onbackgroundsuccess = mutableStateOf(Color(0xff0f9367))
    override val onbackground_onbackgroundvariant1 = mutableStateOf(Color(0xff444444))
    override val onbackground_onbackgroundvariant2 = mutableStateOf(Color(0xff707070))
    override val onbackground_onbackgroundwarning = mutableStateOf(Color(0xff8c690d))
    override val onprimary_onprimary = mutableStateOf(Color(0xffffffff))
    override val onprimary_onprimarydisabled = mutableStateOf(Color(0xffa9a9a9))
    override val onsecondary_onsecondary = mutableStateOf(Color(0xff000000))
    override val onsecondary_onsecondarydisabled = mutableStateOf(Color(0xffc6c6c6))
    override val onsurface_onsurface = mutableStateOf(Color(0xff000000))
    override val onsurface_onsurfacedisabled = mutableStateOf(Color(0xffd4d4d4))
    override val onsurface_onsurfaceerror = mutableStateOf(Color(0xffc52d23))
    override val onsurface_onsurfacesuccess = mutableStateOf(Color(0xff0f9367))
    override val onsurface_onsurfacevariant1 = mutableStateOf(Color(0xff444444))
    override val onsurface_onsurfacevariant2 = mutableStateOf(Color(0xff707070))
    override val onsurface_onsurfacewarning = mutableStateOf(Color(0xff8c690d))
    override val outline_outlineprimary = mutableStateOf(Color(0xff000000))
    override val outline_outlinequaternary = mutableStateOf(Color(0xfff3bfbc))
    override val outline_outlinesecondary = mutableStateOf(Color(0xffffffff))
    override val outline_outlinetertiary = mutableStateOf(Color(0xffb7d6fa))
    override val primary_primary = mutableStateOf(Color(0xff000000))
    override val primary_primaryactive = mutableStateOf(Color(0xff161616))
    override val primary_primarydisabled = mutableStateOf(Color(0xffe2e2e2))
    override val primary_primaryhover = mutableStateOf(Color(0xff2d2d2d))
    override val primitives_blue_blue050 = mutableStateOf(Color(0xffe8f2fe))
    override val primitives_blue_blue100 = mutableStateOf(Color(0xffb7d6fa))
    override val primitives_blue_blue200 = mutableStateOf(Color(0xff9ec2f8))
    override val primitives_blue_blue300 = mutableStateOf(Color(0xff64a6f5))
    override val primitives_blue_blue400 = mutableStateOf(Color(0xff4695f3))
    override val primitives_blue_blue500 = mutableStateOf(Color(0xff187af0))
    override val primitives_blue_blue600 = mutableStateOf(Color(0xff166fda))
    override val primitives_blue_blue700 = mutableStateOf(Color(0xff1157aa))
    override val primitives_blue_blue800 = mutableStateOf(Color(0xff0d4384))
    override val primitives_gray_gray0 = mutableStateOf(Color(0xffffffff))
    override val primitives_gray_gray050 = mutableStateOf(Color(0xfff6f6f6))
    override val primitives_gray_gray100 = mutableStateOf(Color(0xffe2e2e2))
    override val primitives_gray_gray1000 = mutableStateOf(Color(0xff000000))
    override val primitives_gray_gray150 = mutableStateOf(Color(0xffd4d4d4))
    override val primitives_gray_gray200 = mutableStateOf(Color(0xffc6c6c6))
    override val primitives_gray_gray300 = mutableStateOf(Color(0xffa9a9a9))
    override val primitives_gray_gray400 = mutableStateOf(Color(0xff8d8d8d))
    override val primitives_gray_gray500 = mutableStateOf(Color(0xff707070))
    override val primitives_gray_gray600 = mutableStateOf(Color(0xff5a5a5a))
    override val primitives_gray_gray700 = mutableStateOf(Color(0xff444444))
    override val primitives_gray_gray800 = mutableStateOf(Color(0xff2d2d2d))
    override val primitives_gray_gray900 = mutableStateOf(Color(0xff161616))
    override val primitives_green_green050 = mutableStateOf(Color(0xffe7f6f1))
    override val primitives_green_green100 = mutableStateOf(Color(0xffb5e2d3))
    override val primitives_green_green200 = mutableStateOf(Color(0xff91d4be))
    override val primitives_green_green300 = mutableStateOf(Color(0xff5fc0a0))
    override val primitives_green_green400 = mutableStateOf(Color(0xff40b48d))
    override val primitives_green_green500 = mutableStateOf(Color(0xff10a171))
    override val primitives_green_green600 = mutableStateOf(Color(0xff0f9367))
    override val primitives_green_green700 = mutableStateOf(Color(0xff0b7250))
    override val primitives_green_green800 = mutableStateOf(Color(0xff09593e))
    override val primitives_pink_pink050 = mutableStateOf(Color(0xfffff6f8))
    override val primitives_pink_pink100 = mutableStateOf(Color(0xfffee2e8))
    override val primitives_pink_pink200 = mutableStateOf(Color(0xfffdd4dd))
    override val primitives_pink_pink300 = mutableStateOf(Color(0xfffcc1cd))
    override val primitives_pink_pink400 = mutableStateOf(Color(0xfffcb5c3))
    override val primitives_pink_pink500 = mutableStateOf(Color(0xfffba2b4))
    override val primitives_pink_pink600 = mutableStateOf(Color(0xffe493a4))
    override val primitives_pink_pink700 = mutableStateOf(Color(0xffb27380))
    override val primitives_pink_pink800 = mutableStateOf(Color(0xff8a5963))
    override val primitives_red_red050 = mutableStateOf(Color(0xfffbeae9))
    override val primitives_red_red100 = mutableStateOf(Color(0xfff3bfbc))
    override val primitives_red_red200 = mutableStateOf(Color(0xffeea09c))
    override val primitives_red_red300 = mutableStateOf(Color(0xffe6756e))
    override val primitives_red_red400 = mutableStateOf(Color(0xffe15a52))
    override val primitives_red_red500 = mutableStateOf(Color(0xffd93127))
    override val primitives_red_red600 = mutableStateOf(Color(0xffc52d23))
    override val primitives_red_red700 = mutableStateOf(Color(0xff9a231c))
    override val primitives_red_red800 = mutableStateOf(Color(0xff771b15))
    override val primitives_yellow_yellow050 = mutableStateOf(Color(0xfffff9e8))
    override val primitives_yellow_yellow100 = mutableStateOf(Color(0xffffebb7))
    override val primitives_yellow_yellow200 = mutableStateOf(Color(0xffffe194))
    override val primitives_yellow_yellow300 = mutableStateOf(Color(0xffffd364))
    override val primitives_yellow_yellow400 = mutableStateOf(Color(0xffffcb45))
    override val primitives_yellow_yellow500 = mutableStateOf(Color(0xffffbe17))
    override val primitives_yellow_yellow600 = mutableStateOf(Color(0xffe8ad15))
    override val primitives_yellow_yellow700 = mutableStateOf(Color(0xffb58710))
    override val primitives_yellow_yellow800 = mutableStateOf(Color(0xff8c690d))
    override val secondary_secondary = mutableStateOf(Color(0x00ffffff))
    override val secondary_secondaryactive = mutableStateOf(Color(0xffd4d4d4))
    override val secondary_secondarydisabled = mutableStateOf(Color(0x00000000))
    override val secondary_secondaryhover = mutableStateOf(Color(0xffe2e2e2))
    override val success_onsuccess_onsuccessprimary = mutableStateOf(Color(0xffffffff))
    override val success_success_successprimary = mutableStateOf(Color(0xff10a171))
    override val surface_surface = mutableStateOf(Color(0xffffffff))
    override val surface_surfaceactive = mutableStateOf(Color(0xffe2e2e2))
    override val surface_surfacehover = mutableStateOf(Color(0xfff6f6f6))
    override val warning_onwarning_onwarningprimary = mutableStateOf(Color(0xff000000))
    override val warning_warning_warningprimary = mutableStateOf(Color(0xffffbe17))
}

@Stable
class FractalDarkColors : FractalColors {
    override val accent_accent = mutableStateOf(Color(0xff83b8f7))
    override val accent_accentactive = mutableStateOf(Color(0xffaacef9))
    override val accent_accentdisabled = mutableStateOf(Color(0xff4088dd))
    override val accent_accenthover = mutableStateOf(Color(0xff6baaf5))
    override val background_backgroundprimary = mutableStateOf(Color(0xff161616))
    override val background_backgroundsecondary = mutableStateOf(Color(0xff212121))
    override val badges_blue_badgeblue = mutableStateOf(Color(0xff326aad))
    override val badges_blue_onbadgeblue = mutableStateOf(Color(0xffedf4fe))
    override val badges_gray_badgegray = mutableStateOf(Color(0xff404040))
    override val badges_gray_onbadgegray = mutableStateOf(Color(0xffffffff))
    override val badges_green_badgegreen = mutableStateOf(Color(0xff2d8064))
    override val badges_green_onbadgegreen = mutableStateOf(Color(0xffecf8f4))
    override val badges_red_badgered = mutableStateOf(Color(0xffa0403a))
    override val badges_red_onbadgered = mutableStateOf(Color(0xfffcefee))
    override val badges_yellow_badgeyellow = mutableStateOf(Color(0xffb59031))
    override val badges_yellow_onbadgeyellow = mutableStateOf(Color(0xfffffaec))
    override val border_error_bordererror = mutableStateOf(Color(0xffeb908b))
    override val border_error_bordererroractive = mutableStateOf(Color(0xffeb908b))
    override val border_error_bordererrordisabled = mutableStateOf(Color(0xff7c322d))
    override val border_error_bordererrorhover = mutableStateOf(Color(0xffe77b75))
    override val border_primary_borderprimary = mutableStateOf(Color(0xff404040))
    override val border_primary_borderprimaryactive = mutableStateOf(Color(0xff83b8f7))
    override val border_primary_borderprimarydisabled = mutableStateOf(Color(0xff404040))
    override val border_primary_borderprimaryhover = mutableStateOf(Color(0xffadadad))
    override val border_secondary_bordersecondary = mutableStateOf(Color(0xffffffff))
    override val border_success_bordersuccess = mutableStateOf(Color(0xff7fcdb3))
    override val border_warning_borderwarning = mutableStateOf(Color(0xffffdc82))
    override val brand_brandpink = mutableStateOf(Color(0xfffdcdd7))
    override val error_error_errorprimary = mutableStateOf(Color(0xffeb908b))
    override val error_error_errorprimaryactive = mutableStateOf(Color(0xfff1b3af))
    override val error_error_errorprimarydisabled = mutableStateOf(Color(0xff7c322d))
    override val error_error_errorprimaryhover = mutableStateOf(Color(0xffe77b75))
    override val error_error_errorsecondary = mutableStateOf(Color(0x00161616))
    override val error_error_errorsecondaryactive = mutableStateOf(Color(0xffa0403a))
    override val error_error_errorsecondarydisabled = mutableStateOf(Color(0x00161616))
    override val error_error_errorsecondaryhover = mutableStateOf(Color(0xff7c322d))
    override val error_onerror_onerrordisabled = mutableStateOf(Color(0xffa0403a))
    override val error_onerror_onerrorprimary = mutableStateOf(Color(0xff161616))
    override val error_onerror_onerrorsecondary = mutableStateOf(Color(0xffeb908b))
    override val onbackground_onbackground = mutableStateOf(Color(0xffffffff))
    override val onbackground_onbackgrounderror = mutableStateOf(Color(0xfff1b3af))
    override val onbackground_onbackgroundprimarydisabled = mutableStateOf(Color(0xff525252))
    override val onbackground_onbackgroundsecondarydisabled = mutableStateOf(Color(0xff525252))
    override val onbackground_onbackgroundsuccess = mutableStateOf(Color(0xffa7ddcb))
    override val onbackground_onbackgroundvariant1 = mutableStateOf(Color(0xffd9d9d9))
    override val onbackground_onbackgroundvariant2 = mutableStateOf(Color(0xffadadad))
    override val onbackground_onbackgroundwarning = mutableStateOf(Color(0xfffffaec))
    override val onprimary_onprimary = mutableStateOf(Color(0xff161616))
    override val onprimary_onprimarydisabled = mutableStateOf(Color(0xff787878))
    override val onsecondary_onsecondary = mutableStateOf(Color(0xffffffff))
    override val onsecondary_onsecondarydisabled = mutableStateOf(Color(0xff616161))
    override val onsurface_onsurface = mutableStateOf(Color(0xffffffff))
    override val onsurface_onsurfacedisabled = mutableStateOf(Color(0xff525252))
    override val onsurface_onsurfaceerror = mutableStateOf(Color(0xfff1b3af))
    override val onsurface_onsurfacesuccess = mutableStateOf(Color(0xffa7ddcb))
    override val onsurface_onsurfacevariant1 = mutableStateOf(Color(0xffd9d9d9))
    override val onsurface_onsurfacevariant2 = mutableStateOf(Color(0xffadadad))
    override val onsurface_onsurfacewarning = mutableStateOf(Color(0xfffffaec))
    override val outline_outlineprimary = mutableStateOf(Color(0xffffffff))
    override val outline_outlinequaternary = mutableStateOf(Color(0xffa0403a))
    override val outline_outlinesecondary = mutableStateOf(Color(0xff161616))
    override val outline_outlinetertiary = mutableStateOf(Color(0xff326aad))
    override val primary_primary = mutableStateOf(Color(0xffffffff))
    override val primary_primaryactive = mutableStateOf(Color(0xfff7f7f7))
    override val primary_primarydisabled = mutableStateOf(Color(0xff404040))
    override val primary_primaryhover = mutableStateOf(Color(0xffe8e8e8))
    override val primitives_blue_blue050 = mutableStateOf(Color(0xff275286))
    override val primitives_blue_blue100 = mutableStateOf(Color(0xff326aad))
    override val primitives_blue_blue200 = mutableStateOf(Color(0xff4088dd))
    override val primitives_blue_blue300 = mutableStateOf(Color(0xff4695f3))
    override val primitives_blue_blue400 = mutableStateOf(Color(0xff6baaf5))
    override val primitives_blue_blue500 = mutableStateOf(Color(0xff83b8f7))
    override val primitives_blue_blue600 = mutableStateOf(Color(0xffaacef9))
    override val primitives_blue_blue700 = mutableStateOf(Color(0xffc6defb))
    override val primitives_blue_blue800 = mutableStateOf(Color(0xffedf4fe))
    override val primitives_gray_gray0 = mutableStateOf(Color(0xff161616))
    override val primitives_gray_gray050 = mutableStateOf(Color(0xff212121))
    override val primitives_gray_gray100 = mutableStateOf(Color(0xff404040))
    override val primitives_gray_gray1000 = mutableStateOf(Color(0xffffffff))
    override val primitives_gray_gray150 = mutableStateOf(Color(0xff525252))
    override val primitives_gray_gray200 = mutableStateOf(Color(0xff616161))
    override val primitives_gray_gray300 = mutableStateOf(Color(0xff787878))
    override val primitives_gray_gray400 = mutableStateOf(Color(0xff949494))
    override val primitives_gray_gray500 = mutableStateOf(Color(0xffadadad))
    override val primitives_gray_gray600 = mutableStateOf(Color(0xffcccccc))
    override val primitives_gray_gray700 = mutableStateOf(Color(0xffd9d9d9))
    override val primitives_gray_gray800 = mutableStateOf(Color(0xffe8e8e8))
    override val primitives_gray_gray900 = mutableStateOf(Color(0xfff7f7f7))
    override val primitives_green_green050 = mutableStateOf(Color(0xff23634e))
    override val primitives_green_green100 = mutableStateOf(Color(0xff2d8064))
    override val primitives_green_green200 = mutableStateOf(Color(0xff3aa480))
    override val primitives_green_green300 = mutableStateOf(Color(0xff40b48d))
    override val primitives_green_green400 = mutableStateOf(Color(0xff66c3a4))
    override val primitives_green_green500 = mutableStateOf(Color(0xff7fcdb3))
    override val primitives_green_green600 = mutableStateOf(Color(0xffa7ddcb))
    override val primitives_green_green700 = mutableStateOf(Color(0xffc4e8dc))
    override val primitives_green_green800 = mutableStateOf(Color(0xffecf8f4))
    override val primitives_pink_pink050 = mutableStateOf(Color(0xff8b646b))
    override val primitives_pink_pink100 = mutableStateOf(Color(0xffb3818a))
    override val primitives_pink_pink200 = mutableStateOf(Color(0xffe5a5b1))
    override val primitives_pink_pink300 = mutableStateOf(Color(0xfffcb5c3))
    override val primitives_pink_pink400 = mutableStateOf(Color(0xfffdc4cf))
    override val primitives_pink_pink500 = mutableStateOf(Color(0xfffdcdd7))
    override val primitives_pink_pink600 = mutableStateOf(Color(0xfffedde3))
    override val primitives_pink_pink700 = mutableStateOf(Color(0xfffee8ec))
    override val primitives_pink_pink800 = mutableStateOf(Color(0xfffff8f9))
    override val primitives_red_red050 = mutableStateOf(Color(0xff7c322d))
    override val primitives_red_red100 = mutableStateOf(Color(0xffa0403a))
    override val primitives_red_red200 = mutableStateOf(Color(0xffcd524b))
    override val primitives_red_red300 = mutableStateOf(Color(0xffe15a52))
    override val primitives_red_red400 = mutableStateOf(Color(0xffe77b75))
    override val primitives_red_red500 = mutableStateOf(Color(0xffeb908b))
    override val primitives_red_red600 = mutableStateOf(Color(0xfff1b3af))
    override val primitives_red_red700 = mutableStateOf(Color(0xfff6ccc9))
    override val primitives_red_red800 = mutableStateOf(Color(0xfffcefee))
    override val primitives_yellow_yellow050 = mutableStateOf(Color(0xff8c7026))
    override val primitives_yellow_yellow100 = mutableStateOf(Color(0xffb59031))
    override val primitives_yellow_yellow200 = mutableStateOf(Color(0xffe8b93f))
    override val primitives_yellow_yellow300 = mutableStateOf(Color(0xffffcb45))
    override val primitives_yellow_yellow400 = mutableStateOf(Color(0xffffd56a))
    override val primitives_yellow_yellow500 = mutableStateOf(Color(0xffffdc82))
    override val primitives_yellow_yellow600 = mutableStateOf(Color(0xffffe7a9))
    override val primitives_yellow_yellow700 = mutableStateOf(Color(0xffffefc5))
    override val primitives_yellow_yellow800 = mutableStateOf(Color(0xfffffaec))
    override val secondary_secondary = mutableStateOf(Color(0x00000000))
    override val secondary_secondaryactive = mutableStateOf(Color(0xff525252))
    override val secondary_secondarydisabled = mutableStateOf(Color(0x00161616))
    override val secondary_secondaryhover = mutableStateOf(Color(0xff404040))
    override val success_onsuccess_onsuccessprimary = mutableStateOf(Color(0xff161616))
    override val success_success_successprimary = mutableStateOf(Color(0xff7fcdb3))
    override val surface_surface = mutableStateOf(Color(0xff161616))
    override val surface_surfaceactive = mutableStateOf(Color(0xff404040))
    override val surface_surfacehover = mutableStateOf(Color(0xff212121))
    override val warning_onwarning_onwarningprimary = mutableStateOf(Color(0xff000000))
    override val warning_warning_warningprimary = mutableStateOf(Color(0xffffdc82))
}
