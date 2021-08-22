package com.petterp.recordbill

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.core.view.WindowCompat
import com.google.accompanist.insets.ProvideWindowInsets
import com.petterp.recordbill.ui.RecordBillTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            ProvideWindowInsets {
                RecordBillTheme {
                    ComposeNavigation()
                }
            }
        }
    }
}
