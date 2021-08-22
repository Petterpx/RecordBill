package com.petterp.recordbill.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.petterp.recordbill.R
import com.petterp.recordbill.ui.appBarColor
import com.petterp.recordbill.util.getString

/**
 *
 * @author petterp
 */

@ExperimentalMaterialApi
@Composable
fun Splash(navigator: NavHostController) {
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = MaterialTheme.colors.isLight
    Box(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        systemUiController.setStatusBarColor(MaterialTheme.colors.appBarColor, useDarkIcons)
        Image(
            painter = painterResource(id = R.mipmap.ic_t1),
            contentDescription = getString(R.string.splash_name),
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, end = 30.dp)
                .align(Alignment.Center),
            contentScale = ContentScale.Crop
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 20.dp)
        ) {
            IconButton(
                onClick = {
                    navigator.navigate("main") {
                        popUpTo("splash"){ inclusive = true }
                    }
                },
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .size(60.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_next_step),
                    contentDescription = "下一步"
                )
            }
            Text(text = "点击进入云小记", fontSize = 13.sp)
        }
    }
}
