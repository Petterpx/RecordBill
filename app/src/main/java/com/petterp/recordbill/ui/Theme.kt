package com.petterp.recordbill.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

private val DarkBlueColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val DarkGreenColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightBlueColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
)
private val LightGreenColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200
)

@Composable
fun RecordBillTheme(
    pallet: ColorPallet = ColorsManager.pallet,
    content: @Composable () -> Unit
) {
    ColorsManager.pallet = pallet
    /* 提供一个值,这个值正是我们提前定义的LocalBillAssets,即自定义的资源包
    * 这样我们就可以在全局调用到这个assets
    *  */
    CompositionLocalProvider(
        LocalBillAssets provides if (pallet == ColorPallet.GREEN_LIGHT) BillAssets.LightBlueBillAssets else BillAssets.LightGreenBillAssets
    ) {
        val colors = when (pallet) {
            ColorPallet.GREEN_DARK -> LightBlueColorPalette
            ColorPallet.GREEN_LIGHT -> LightGreenColorPalette
        }
        MaterialTheme(
            colors = colors,
            typography = Typography,
            shapes = Shapes,
            content = content
        )
    }
}
