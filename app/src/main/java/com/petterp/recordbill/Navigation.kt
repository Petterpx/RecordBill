package com.petterp.recordbill

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.petterp.recordbill.home.Home
import com.petterp.recordbill.splash.Splash

/**
 * navigation合集
 * @author petterp
 */

@ExperimentalMaterialApi
@Composable
fun ComposeNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("main") { navController.Home() }
        composable("splash") { Splash(navController) }
    }
}
