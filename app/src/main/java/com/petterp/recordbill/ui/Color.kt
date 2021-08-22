package com.petterp.recordbill.ui

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

/** 业务颜色数组,每增添一个颜色都要将其TAG添加到这里,以此用来便于使用 */
enum class ColorTag {
    BTN_COLOR, BTN_LOGIN_COLOR, APP_BAR_COLOR
}

/** 将业务颜色通过扩展函数的方式提供 */
val Colors.btnCardBackColor: Color
    get() = getColor(ColorTag.BTN_COLOR) ?: Teal200

val Colors.btnLogin: Color
    get() = getColor(ColorTag.BTN_LOGIN_COLOR) ?: Teal200

val Colors.appBarColor: Color
    get() = getColor(ColorTag.APP_BAR_COLOR) ?: Teal200

/* 自定义的业务颜色组 */
val lightGreenColors = mapOf(
    ColorTag.BTN_COLOR to Purple700,
    ColorTag.APP_BAR_COLOR to Color.White
)

val darkGreenColors = mapOf(
    ColorTag.BTN_COLOR to Teal200,
    ColorTag.APP_BAR_COLOR to Purple700
)

val MaterialTheme.manager
    @Composable
    get() = LocalBillAssets.current

/** 主题状态管理 */
object ColorsManager {
    /** 使用一个变量维护当前主题 */
    var pallet by mutableStateOf(ColorPallet.GREEN_LIGHT)
}

enum class ColorPallet {
    GREEN_DARK, GREEN_LIGHT
}

/** 获取tag指定的颜色组 */
private fun getColor(tag: ColorTag): Color? {
    return when (ColorsManager.pallet) {
        ColorPallet.GREEN_LIGHT -> lightGreenColors[tag]
        ColorPallet.GREEN_DARK -> darkGreenColors[tag]
    }
}
