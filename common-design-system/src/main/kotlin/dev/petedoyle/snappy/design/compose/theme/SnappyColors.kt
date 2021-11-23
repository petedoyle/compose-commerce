package dev.petedoyle.snappy.design.compose.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

///////////////////////////////////////////////////////////////////////////
// GENERATED. Do not edit by hand.
///////////////////////////////////////////////////////////////////////////

val LocalSnappyColors = staticCompositionLocalOf<SnappyColors> { SnappyLightColors() }

interface SnappyColors {
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
    val elevationoverlay_01: MutableState<Color>
    val elevationoverlay_02: MutableState<Color>
    val elevationoverlay_03: MutableState<Color>
    val error_error_errorprimary: MutableState<Color>
    val error_error_errorsecondary: MutableState<Color>
    val error_onerror_onerrordisabled: MutableState<Color>
    val error_onerror_onerrorprimary: MutableState<Color>
    val error_onerror_onerrorsecondary: MutableState<Color>
    val error_states_errorprimary_errorprimaryactive: MutableState<Color>
    val error_states_errorprimary_errorprimarydisabled: MutableState<Color>
    val error_states_errorprimary_errorprimaryhover: MutableState<Color>
    val error_states_errorsecondary_errorsecondaryactive: MutableState<Color>
    val error_states_errorsecondary_errorsecondarydisabled: MutableState<Color>
    val error_states_errorsecondary_errorsecondaryhover: MutableState<Color>
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
    val onsurface_onsurfacesecondarydisabled: MutableState<Color>
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
    val primitives_blue_blue100: MutableState<Color>
    val primitives_blue_blue200: MutableState<Color>
    val primitives_blue_blue300: MutableState<Color>
    val primitives_blue_blue400: MutableState<Color>
    val primitives_blue_blue50: MutableState<Color>
    val primitives_blue_blue500: MutableState<Color>
    val primitives_blue_blue600: MutableState<Color>
    val primitives_blue_blue700: MutableState<Color>
    val primitives_blue_blue800: MutableState<Color>
    val primitives_gray_gray0: MutableState<Color>
    val primitives_gray_gray100: MutableState<Color>
    val primitives_gray_gray1000: MutableState<Color>
    val primitives_gray_gray150: MutableState<Color>
    val primitives_gray_gray200: MutableState<Color>
    val primitives_gray_gray300: MutableState<Color>
    val primitives_gray_gray400: MutableState<Color>
    val primitives_gray_gray50: MutableState<Color>
    val primitives_gray_gray500: MutableState<Color>
    val primitives_gray_gray600: MutableState<Color>
    val primitives_gray_gray700: MutableState<Color>
    val primitives_gray_gray800: MutableState<Color>
    val primitives_gray_gray900: MutableState<Color>
    val primitives_green_green100: MutableState<Color>
    val primitives_green_green200: MutableState<Color>
    val primitives_green_green300: MutableState<Color>
    val primitives_green_green400: MutableState<Color>
    val primitives_green_green50: MutableState<Color>
    val primitives_green_green500: MutableState<Color>
    val primitives_green_green600: MutableState<Color>
    val primitives_green_green700: MutableState<Color>
    val primitives_green_green800: MutableState<Color>
    val primitives_pink_pink100: MutableState<Color>
    val primitives_pink_pink200: MutableState<Color>
    val primitives_pink_pink300: MutableState<Color>
    val primitives_pink_pink400: MutableState<Color>
    val primitives_pink_pink50: MutableState<Color>
    val primitives_pink_pink500: MutableState<Color>
    val primitives_pink_pink600: MutableState<Color>
    val primitives_pink_pink700: MutableState<Color>
    val primitives_pink_pink800: MutableState<Color>
    val primitives_red_red100: MutableState<Color>
    val primitives_red_red200: MutableState<Color>
    val primitives_red_red300: MutableState<Color>
    val primitives_red_red400: MutableState<Color>
    val primitives_red_red50: MutableState<Color>
    val primitives_red_red500: MutableState<Color>
    val primitives_red_red600: MutableState<Color>
    val primitives_red_red700: MutableState<Color>
    val primitives_red_red800: MutableState<Color>
    val primitives_static_staticblack: MutableState<Color>
    val primitives_static_staticdarkgray: MutableState<Color>
    val primitives_static_staticdimgray: MutableState<Color>
    val primitives_static_staticlightgray: MutableState<Color>
    val primitives_static_staticwhite: MutableState<Color>
    val primitives_yellow_yellow100: MutableState<Color>
    val primitives_yellow_yellow200: MutableState<Color>
    val primitives_yellow_yellow300: MutableState<Color>
    val primitives_yellow_yellow400: MutableState<Color>
    val primitives_yellow_yellow50: MutableState<Color>
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
class SnappyLightColors : SnappyColors {
    override val accent_accent = mutableStateOf(Color(0xff0c6de2))
    override val accent_accentactive = mutableStateOf(Color(0xff0a57b5))
    override val accent_accentdisabled = mutableStateOf(Color(0xff9ec5f3))
    override val accent_accenthover = mutableStateOf(Color(0xff3d8ae8))
    override val background_backgroundprimary = mutableStateOf(Color(0xffffffff))
    override val background_backgroundsecondary = mutableStateOf(Color(0xfff6f6f6))
    override val badges_blue_badgeblue = mutableStateOf(Color(0xffcee2f9))
    override val badges_blue_onbadgeblue = mutableStateOf(Color(0xff052c5a))
    override val badges_gray_badgegray = mutableStateOf(Color(0xffe2e2e2))
    override val badges_gray_onbadgegray = mutableStateOf(Color(0xff000000))
    override val badges_green_badgegreen = mutableStateOf(Color(0xffcee6de))
    override val badges_green_onbadgegreen = mutableStateOf(Color(0xff053525))
    override val badges_red_badgered = mutableStateOf(Color(0xffecb9b6))
    override val badges_red_onbadgered = mutableStateOf(Color(0xff4c0804))
    override val badges_yellow_badgeyellow = mutableStateOf(Color(0xfffff2d9))
    override val badges_yellow_onbadgeyellow = mutableStateOf(Color(0xff9b4e00))
    override val border_error_bordererror = mutableStateOf(Color(0xffbf140a))
    override val border_error_bordererroractive = mutableStateOf(Color(0xff991008))
    override val border_error_bordererrordisabled = mutableStateOf(Color(0xffecb9b6))
    override val border_error_bordererrorhover = mutableStateOf(Color(0xff730c06))
    override val border_primary_borderprimary = mutableStateOf(Color(0xffd4d4d4))
    override val border_primary_borderprimaryactive = mutableStateOf(Color(0xff0c6de2))
    override val border_primary_borderprimarydisabled = mutableStateOf(Color(0xffe2e2e2))
    override val border_primary_borderprimaryhover = mutableStateOf(Color(0xff707070))
    override val border_secondary_bordersecondary = mutableStateOf(Color(0xff000000))
    override val border_success_bordersuccess = mutableStateOf(Color(0xff0c845c))
    override val border_warning_borderwarning = mutableStateOf(Color(0xffffa617))
    override val brand_brandpink = mutableStateOf(Color(0xfff6c5cf))
    override val elevationoverlay_01 = mutableStateOf(Color(0xffffffff))
    override val elevationoverlay_02 = mutableStateOf(Color(0xffffffff))
    override val elevationoverlay_03 = mutableStateOf(Color(0xffffffff))
    override val error_error_errorprimary = mutableStateOf(Color(0xffbf140a))
    override val error_error_errorsecondary = mutableStateOf(Color(0xffffffff))
    override val error_onerror_onerrordisabled = mutableStateOf(Color(0xffecb9b6))
    override val error_onerror_onerrorprimary = mutableStateOf(Color(0xffffffff))
    override val error_onerror_onerrorsecondary = mutableStateOf(Color(0xffbf140a))
    override val error_states_errorprimary_errorprimaryactive = mutableStateOf(Color(0xff991008))
    override val error_states_errorprimary_errorprimarydisabled = mutableStateOf(Color(0xfffff8f7))
    override val error_states_errorprimary_errorprimaryhover = mutableStateOf(Color(0xffcc433b))
    override val error_states_errorsecondary_errorsecondaryactive = mutableStateOf(Color(0xffecb9b6))
    override val error_states_errorsecondary_errorsecondarydisabled = mutableStateOf(Color(0xffffffff))
    override val error_states_errorsecondary_errorsecondaryhover = mutableStateOf(Color(0xfffff8f7))
    override val onbackground_onbackground = mutableStateOf(Color(0xff000000))
    override val onbackground_onbackgrounderror = mutableStateOf(Color(0xff991008))
    override val onbackground_onbackgroundprimarydisabled = mutableStateOf(Color(0xffd4d4d4))
    override val onbackground_onbackgroundsecondarydisabled = mutableStateOf(Color(0xffa9a9a9))
    override val onbackground_onbackgroundsuccess = mutableStateOf(Color(0xff0a6a4a))
    override val onbackground_onbackgroundvariant1 = mutableStateOf(Color(0xff444444))
    override val onbackground_onbackgroundvariant2 = mutableStateOf(Color(0xff707070))
    override val onbackground_onbackgroundwarning = mutableStateOf(Color(0xff9b4e00))
    override val onprimary_onprimary = mutableStateOf(Color(0xffffffff))
    override val onprimary_onprimarydisabled = mutableStateOf(Color(0xffa9a9a9))
    override val onsecondary_onsecondary = mutableStateOf(Color(0xff000000))
    override val onsecondary_onsecondarydisabled = mutableStateOf(Color(0xffc6c6c6))
    override val onsurface_onsurface = mutableStateOf(Color(0xff000000))
    override val onsurface_onsurfacedisabled = mutableStateOf(Color(0xffd4d4d4))
    override val onsurface_onsurfaceerror = mutableStateOf(Color(0xff991008))
    override val onsurface_onsurfacesecondarydisabled = mutableStateOf(Color(0xffa9a9a9))
    override val onsurface_onsurfacesuccess = mutableStateOf(Color(0xff0a6a4a))
    override val onsurface_onsurfacevariant1 = mutableStateOf(Color(0xff444444))
    override val onsurface_onsurfacevariant2 = mutableStateOf(Color(0xff707070))
    override val onsurface_onsurfacewarning = mutableStateOf(Color(0xff9b4e00))
    override val outline_outlineprimary = mutableStateOf(Color(0xff000000))
    override val outline_outlinequaternary = mutableStateOf(Color(0xffecb9b6))
    override val outline_outlinesecondary = mutableStateOf(Color(0xffffffff))
    override val outline_outlinetertiary = mutableStateOf(Color(0xffcee2f9))
    override val primary_primary = mutableStateOf(Color(0xff000000))
    override val primary_primaryactive = mutableStateOf(Color(0xff161616))
    override val primary_primarydisabled = mutableStateOf(Color(0xffe2e2e2))
    override val primary_primaryhover = mutableStateOf(Color(0xff2d2d2d))
    override val primitives_blue_blue100 = mutableStateOf(Color(0xffcee2f9))
    override val primitives_blue_blue200 = mutableStateOf(Color(0xff9ec5f3))
    override val primitives_blue_blue300 = mutableStateOf(Color(0xff6da7ee))
    override val primitives_blue_blue400 = mutableStateOf(Color(0xff3d8ae8))
    override val primitives_blue_blue50 = mutableStateOf(Color(0xffe7f0fc))
    override val primitives_blue_blue500 = mutableStateOf(Color(0xff0c6de2))
    override val primitives_blue_blue600 = mutableStateOf(Color(0xff0a57b5))
    override val primitives_blue_blue700 = mutableStateOf(Color(0xff074188))
    override val primitives_blue_blue800 = mutableStateOf(Color(0xff052c5a))
    override val primitives_gray_gray0 = mutableStateOf(Color(0xffffffff))
    override val primitives_gray_gray100 = mutableStateOf(Color(0xffe2e2e2))
    override val primitives_gray_gray1000 = mutableStateOf(Color(0xff000000))
    override val primitives_gray_gray150 = mutableStateOf(Color(0xffd4d4d4))
    override val primitives_gray_gray200 = mutableStateOf(Color(0xffc6c6c6))
    override val primitives_gray_gray300 = mutableStateOf(Color(0xffa9a9a9))
    override val primitives_gray_gray400 = mutableStateOf(Color(0xff8d8d8d))
    override val primitives_gray_gray50 = mutableStateOf(Color(0xfff6f6f6))
    override val primitives_gray_gray500 = mutableStateOf(Color(0xff707070))
    override val primitives_gray_gray600 = mutableStateOf(Color(0xff5a5a5a))
    override val primitives_gray_gray700 = mutableStateOf(Color(0xff444444))
    override val primitives_gray_gray800 = mutableStateOf(Color(0xff2d2d2d))
    override val primitives_gray_gray900 = mutableStateOf(Color(0xff161616))
    override val primitives_green_green100 = mutableStateOf(Color(0xffcee6de))
    override val primitives_green_green200 = mutableStateOf(Color(0xff9ecebe))
    override val primitives_green_green300 = mutableStateOf(Color(0xff6db59d))
    override val primitives_green_green400 = mutableStateOf(Color(0xff3d9d7d))
    override val primitives_green_green50 = mutableStateOf(Color(0xffebfff1))
    override val primitives_green_green500 = mutableStateOf(Color(0xff0c845c))
    override val primitives_green_green600 = mutableStateOf(Color(0xff0a6a4a))
    override val primitives_green_green700 = mutableStateOf(Color(0xff074f37))
    override val primitives_green_green800 = mutableStateOf(Color(0xff053525))
    override val primitives_pink_pink100 = mutableStateOf(Color(0xfffdf3f5))
    override val primitives_pink_pink200 = mutableStateOf(Color(0xfffbe8ec))
    override val primitives_pink_pink300 = mutableStateOf(Color(0xfffadce2))
    override val primitives_pink_pink400 = mutableStateOf(Color(0xfff8d1d9))
    override val primitives_pink_pink50 = mutableStateOf(Color(0xfffef9fa))
    override val primitives_pink_pink500 = mutableStateOf(Color(0xfff6c5cf))
    override val primitives_pink_pink600 = mutableStateOf(Color(0xfff6b4bf))
    override val primitives_pink_pink700 = mutableStateOf(Color(0xffeda1ae))
    override val primitives_pink_pink800 = mutableStateOf(Color(0xffe38e9c))
    override val primitives_red_red100 = mutableStateOf(Color(0xffecb9b6))
    override val primitives_red_red200 = mutableStateOf(Color(0xffe5a19d))
    override val primitives_red_red300 = mutableStateOf(Color(0xffd9726c))
    override val primitives_red_red400 = mutableStateOf(Color(0xffcc433b))
    override val primitives_red_red50 = mutableStateOf(Color(0xfffff8f7))
    override val primitives_red_red500 = mutableStateOf(Color(0xffbf140a))
    override val primitives_red_red600 = mutableStateOf(Color(0xff991008))
    override val primitives_red_red700 = mutableStateOf(Color(0xff730c06))
    override val primitives_red_red800 = mutableStateOf(Color(0xff4c0804))
    override val primitives_static_staticblack = mutableStateOf(Color(0xff000000))
    override val primitives_static_staticdarkgray = mutableStateOf(Color(0xff707070))
    override val primitives_static_staticdimgray = mutableStateOf(Color(0xff444444))
    override val primitives_static_staticlightgray = mutableStateOf(Color(0xffc6c6c6))
    override val primitives_static_staticwhite = mutableStateOf(Color(0xffffffff))
    override val primitives_yellow_yellow100 = mutableStateOf(Color(0xfffff2d9))
    override val primitives_yellow_yellow200 = mutableStateOf(Color(0xfffee5b5))
    override val primitives_yellow_yellow300 = mutableStateOf(Color(0xffffd582))
    override val primitives_yellow_yellow400 = mutableStateOf(Color(0xffffc759))
    override val primitives_yellow_yellow50 = mutableStateOf(Color(0xfffff8eb))
    override val primitives_yellow_yellow500 = mutableStateOf(Color(0xffffa617))
    override val primitives_yellow_yellow600 = mutableStateOf(Color(0xfff28900))
    override val primitives_yellow_yellow700 = mutableStateOf(Color(0xffba5d00))
    override val primitives_yellow_yellow800 = mutableStateOf(Color(0xff9b4e00))
    override val secondary_secondary = mutableStateOf(Color(0xffffffff))
    override val secondary_secondaryactive = mutableStateOf(Color(0xffd4d4d4))
    override val secondary_secondarydisabled = mutableStateOf(Color(0xff000000))
    override val secondary_secondaryhover = mutableStateOf(Color(0xffe2e2e2))
    override val success_onsuccess_onsuccessprimary = mutableStateOf(Color(0xffffffff))
    override val success_success_successprimary = mutableStateOf(Color(0xff0c845c))
    override val surface_surface = mutableStateOf(Color(0xffffffff))
    override val surface_surfaceactive = mutableStateOf(Color(0xffe2e2e2))
    override val surface_surfacehover = mutableStateOf(Color(0xfff6f6f6))
    override val warning_onwarning_onwarningprimary = mutableStateOf(Color(0xff000000))
    override val warning_warning_warningprimary = mutableStateOf(Color(0xffffa617))
}

@Stable
class SnappyDarkColors : SnappyColors {
    override val accent_accent = mutableStateOf(Color(0xff6da7ee))
    override val accent_accentactive = mutableStateOf(Color(0xffb6ddff))
    override val accent_accentdisabled = mutableStateOf(Color(0xff0a57b5))
    override val accent_accenthover = mutableStateOf(Color(0xff3d8ae8))
    override val background_backgroundprimary = mutableStateOf(Color(0xff161616))
    override val background_backgroundsecondary = mutableStateOf(Color(0xff212121))
    override val badges_blue_badgeblue = mutableStateOf(Color(0xff074188))
    override val badges_blue_onbadgeblue = mutableStateOf(Color(0xffe7f0fc))
    override val badges_gray_badgegray = mutableStateOf(Color(0xff404040))
    override val badges_gray_onbadgegray = mutableStateOf(Color(0xffffffff))
    override val badges_green_badgegreen = mutableStateOf(Color(0xff074f37))
    override val badges_green_onbadgegreen = mutableStateOf(Color(0xffebfff1))
    override val badges_red_badgered = mutableStateOf(Color(0xff660b05))
    override val badges_red_onbadgered = mutableStateOf(Color(0xffffeae7))
    override val badges_yellow_badgeyellow = mutableStateOf(Color(0xffba5d00))
    override val badges_yellow_onbadgeyellow = mutableStateOf(Color(0xfffff8eb))
    override val border_error_bordererror = mutableStateOf(Color(0xffd9726c))
    override val border_error_bordererroractive = mutableStateOf(Color(0xffd9726c))
    override val border_error_bordererrordisabled = mutableStateOf(Color(0xff4c0804))
    override val border_error_bordererrorhover = mutableStateOf(Color(0xffcc433b))
    override val border_primary_borderprimary = mutableStateOf(Color(0xff404040))
    override val border_primary_borderprimaryactive = mutableStateOf(Color(0xff6da7ee))
    override val border_primary_borderprimarydisabled = mutableStateOf(Color(0xff404040))
    override val border_primary_borderprimaryhover = mutableStateOf(Color(0xffadadad))
    override val border_secondary_bordersecondary = mutableStateOf(Color(0xffffffff))
    override val border_success_bordersuccess = mutableStateOf(Color(0xff6db59d))
    override val border_warning_borderwarning = mutableStateOf(Color(0xffffd582))
    override val brand_brandpink = mutableStateOf(Color(0xfffadce2))
    override val elevationoverlay_01 = mutableStateOf(Color(0xff161616))
    override val elevationoverlay_02 = mutableStateOf(Color(0xff161616))
    override val elevationoverlay_03 = mutableStateOf(Color(0xff161616))
    override val error_error_errorprimary = mutableStateOf(Color(0xffd9726c))
    override val error_error_errorsecondary = mutableStateOf(Color(0xff161616))
    override val error_onerror_onerrordisabled = mutableStateOf(Color(0xff660b05))
    override val error_onerror_onerrorprimary = mutableStateOf(Color(0xff161616))
    override val error_onerror_onerrorsecondary = mutableStateOf(Color(0xffd9726c))
    override val error_states_errorprimary_errorprimaryactive = mutableStateOf(Color(0xffe5a19d))
    override val error_states_errorprimary_errorprimarydisabled = mutableStateOf(Color(0xff4c0804))
    override val error_states_errorprimary_errorprimaryhover = mutableStateOf(Color(0xffcc433b))
    override val error_states_errorsecondary_errorsecondaryactive = mutableStateOf(Color(0xff660b05))
    override val error_states_errorsecondary_errorsecondarydisabled = mutableStateOf(Color(0xff161616))
    override val error_states_errorsecondary_errorsecondaryhover = mutableStateOf(Color(0xff4c0804))
    override val onbackground_onbackground = mutableStateOf(Color(0xffffffff))
    override val onbackground_onbackgrounderror = mutableStateOf(Color(0xffe5a19d))
    override val onbackground_onbackgroundprimarydisabled = mutableStateOf(Color(0xff525252))
    override val onbackground_onbackgroundsecondarydisabled = mutableStateOf(Color(0xff525252))
    override val onbackground_onbackgroundsuccess = mutableStateOf(Color(0xff9ecebe))
    override val onbackground_onbackgroundvariant1 = mutableStateOf(Color(0xffd9d9d9))
    override val onbackground_onbackgroundvariant2 = mutableStateOf(Color(0xffadadad))
    override val onbackground_onbackgroundwarning = mutableStateOf(Color(0xfffff8eb))
    override val onprimary_onprimary = mutableStateOf(Color(0xff161616))
    override val onprimary_onprimarydisabled = mutableStateOf(Color(0xff787878))
    override val onsecondary_onsecondary = mutableStateOf(Color(0xffffffff))
    override val onsecondary_onsecondarydisabled = mutableStateOf(Color(0xff616161))
    override val onsurface_onsurface = mutableStateOf(Color(0xffffffff))
    override val onsurface_onsurfacedisabled = mutableStateOf(Color(0xff525252))
    override val onsurface_onsurfaceerror = mutableStateOf(Color(0xffe5a19d))
    override val onsurface_onsurfacesecondarydisabled = mutableStateOf(Color(0xffa9a9a9))
    override val onsurface_onsurfacesuccess = mutableStateOf(Color(0xff9ecebe))
    override val onsurface_onsurfacevariant1 = mutableStateOf(Color(0xffd9d9d9))
    override val onsurface_onsurfacevariant2 = mutableStateOf(Color(0xffadadad))
    override val onsurface_onsurfacewarning = mutableStateOf(Color(0xfffff8eb))
    override val outline_outlineprimary = mutableStateOf(Color(0xffffffff))
    override val outline_outlinequaternary = mutableStateOf(Color(0xff660b05))
    override val outline_outlinesecondary = mutableStateOf(Color(0xff161616))
    override val outline_outlinetertiary = mutableStateOf(Color(0xff074188))
    override val primary_primary = mutableStateOf(Color(0xffffffff))
    override val primary_primaryactive = mutableStateOf(Color(0xfff7f7f7))
    override val primary_primarydisabled = mutableStateOf(Color(0xff404040))
    override val primary_primaryhover = mutableStateOf(Color(0xffe8e8e8))
    override val primitives_blue_blue100 = mutableStateOf(Color(0xff074188))
    override val primitives_blue_blue200 = mutableStateOf(Color(0xff0a57b5))
    override val primitives_blue_blue300 = mutableStateOf(Color(0xff0c6de2))
    override val primitives_blue_blue400 = mutableStateOf(Color(0xff3d8ae8))
    override val primitives_blue_blue50 = mutableStateOf(Color(0xff052c5a))
    override val primitives_blue_blue500 = mutableStateOf(Color(0xff6da7ee))
    override val primitives_blue_blue600 = mutableStateOf(Color(0xffb6ddff))
    override val primitives_blue_blue700 = mutableStateOf(Color(0xffcee2f9))
    override val primitives_blue_blue800 = mutableStateOf(Color(0xffe7f0fc))
    override val primitives_gray_gray0 = mutableStateOf(Color(0xff161616))
    override val primitives_gray_gray100 = mutableStateOf(Color(0xff404040))
    override val primitives_gray_gray1000 = mutableStateOf(Color(0xffffffff))
    override val primitives_gray_gray150 = mutableStateOf(Color(0xff525252))
    override val primitives_gray_gray200 = mutableStateOf(Color(0xff616161))
    override val primitives_gray_gray300 = mutableStateOf(Color(0xff787878))
    override val primitives_gray_gray400 = mutableStateOf(Color(0xff949494))
    override val primitives_gray_gray50 = mutableStateOf(Color(0xff212121))
    override val primitives_gray_gray500 = mutableStateOf(Color(0xffadadad))
    override val primitives_gray_gray600 = mutableStateOf(Color(0xffcccccc))
    override val primitives_gray_gray700 = mutableStateOf(Color(0xffd9d9d9))
    override val primitives_gray_gray800 = mutableStateOf(Color(0xffe8e8e8))
    override val primitives_gray_gray900 = mutableStateOf(Color(0xfff7f7f7))
    override val primitives_green_green100 = mutableStateOf(Color(0xff074f37))
    override val primitives_green_green200 = mutableStateOf(Color(0xff0a6a4a))
    override val primitives_green_green300 = mutableStateOf(Color(0xff0c845c))
    override val primitives_green_green400 = mutableStateOf(Color(0xff3d9d7d))
    override val primitives_green_green50 = mutableStateOf(Color(0xff053525))
    override val primitives_green_green500 = mutableStateOf(Color(0xff6db59d))
    override val primitives_green_green600 = mutableStateOf(Color(0xff9ecebe))
    override val primitives_green_green700 = mutableStateOf(Color(0xffcee6de))
    override val primitives_green_green800 = mutableStateOf(Color(0xffebfff1))
    override val primitives_pink_pink100 = mutableStateOf(Color(0xffeda1ae))
    override val primitives_pink_pink200 = mutableStateOf(Color(0xfff6b4bf))
    override val primitives_pink_pink300 = mutableStateOf(Color(0xfff6c5cf))
    override val primitives_pink_pink400 = mutableStateOf(Color(0xfff8d1d9))
    override val primitives_pink_pink50 = mutableStateOf(Color(0xffe38e9c))
    override val primitives_pink_pink500 = mutableStateOf(Color(0xfffadce2))
    override val primitives_pink_pink600 = mutableStateOf(Color(0xfffbe8ec))
    override val primitives_pink_pink700 = mutableStateOf(Color(0xfffdf3f5))
    override val primitives_pink_pink800 = mutableStateOf(Color(0xfffef9fa))
    override val primitives_red_red100 = mutableStateOf(Color(0xff660b05))
    override val primitives_red_red200 = mutableStateOf(Color(0xff991008))
    override val primitives_red_red300 = mutableStateOf(Color(0xffbf140a))
    override val primitives_red_red400 = mutableStateOf(Color(0xffcc433b))
    override val primitives_red_red50 = mutableStateOf(Color(0xff4c0804))
    override val primitives_red_red500 = mutableStateOf(Color(0xffd9726c))
    override val primitives_red_red600 = mutableStateOf(Color(0xffe5a19d))
    override val primitives_red_red700 = mutableStateOf(Color(0xfff2d0ce))
    override val primitives_red_red800 = mutableStateOf(Color(0xffffeae7))
    override val primitives_static_staticblack = mutableStateOf(Color(0xff000000))
    override val primitives_static_staticdarkgray = mutableStateOf(Color(0xff707070))
    override val primitives_static_staticdimgray = mutableStateOf(Color(0xff444444))
    override val primitives_static_staticlightgray = mutableStateOf(Color(0xffc6c6c6))
    override val primitives_static_staticwhite = mutableStateOf(Color(0xffffffff))
    override val primitives_yellow_yellow100 = mutableStateOf(Color(0xffba5d00))
    override val primitives_yellow_yellow200 = mutableStateOf(Color(0xfff28900))
    override val primitives_yellow_yellow300 = mutableStateOf(Color(0xffffa617))
    override val primitives_yellow_yellow400 = mutableStateOf(Color(0xffffc759))
    override val primitives_yellow_yellow50 = mutableStateOf(Color(0xff964905))
    override val primitives_yellow_yellow500 = mutableStateOf(Color(0xffffd582))
    override val primitives_yellow_yellow600 = mutableStateOf(Color(0xfffee5b5))
    override val primitives_yellow_yellow700 = mutableStateOf(Color(0xfffff2d9))
    override val primitives_yellow_yellow800 = mutableStateOf(Color(0xfffff8eb))
    override val secondary_secondary = mutableStateOf(Color(0xff000000))
    override val secondary_secondaryactive = mutableStateOf(Color(0xff525252))
    override val secondary_secondarydisabled = mutableStateOf(Color(0xff161616))
    override val secondary_secondaryhover = mutableStateOf(Color(0xff404040))
    override val success_onsuccess_onsuccessprimary = mutableStateOf(Color(0xff161616))
    override val success_success_successprimary = mutableStateOf(Color(0xff6db59d))
    override val surface_surface = mutableStateOf(Color(0xff161616))
    override val surface_surfaceactive = mutableStateOf(Color(0xff404040))
    override val surface_surfacehover = mutableStateOf(Color(0xff212121))
    override val warning_onwarning_onwarningprimary = mutableStateOf(Color(0xff000000))
    override val warning_warning_warningprimary = mutableStateOf(Color(0xffffd582))
}
