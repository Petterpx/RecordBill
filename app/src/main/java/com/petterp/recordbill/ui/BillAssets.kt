package com.petterp.recordbill.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.petterp.recordbill.R

/**
 *
 * @author petterp
 */
open class BillAssets private constructor(
    var background: Int = R.mipmap.ic_launcher,
    var appBarMenu: Int = R.drawable.ic_menu
) {
    object LightGreenBillAssets : BillAssets()
    object LightBlueBillAssets : BillAssets()
}

internal var LocalBillAssets: ProvidableCompositionLocal<BillAssets> = staticCompositionLocalOf {
    BillAssets.LightGreenBillAssets
}

val MaterialTheme.assets
    @Composable
    @ReadOnlyComposable
    get() = LocalBillAssets.current
