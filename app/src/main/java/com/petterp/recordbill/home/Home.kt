package com.petterp.recordbill.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.google.accompanist.insets.statusBarsPadding
import com.petterp.recordbill.base.BillDrawer
import com.petterp.recordbill.ui.ColorPallet
import com.petterp.recordbill.ui.RecordBillTheme
import com.petterp.recordbill.ui.appBarColor
import com.petterp.recordbill.ui.assets
import kotlinx.coroutines.launch

/**
 * home页
 * @author petterp
 */
@ExperimentalMaterialApi
@Composable
fun NavHostController.Home() {
//    val systemUiController = rememberSystemUiController()
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.statusBarsPadding(),
        drawerContent = { BillDrawer() },
        topBar = {
            RecordAppBar {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }
        }
    ) {
    }
}

@Composable
fun RecordAppBar(openDrawer: () -> Unit) {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.appBarColor,
        title = {
            Row {
                Text(text = "Bill")
            }
        },
        navigationIcon = {
            IconButton(
                onClick = {
                    openDrawer.invoke()
                },
                modifier = Modifier
                    .padding(start = 5.dp)
                    .size(50.dp)
                    .padding(10.dp)
            ) {
                Image(
                    painterResource(id = MaterialTheme.assets.appBarMenu),
                    "菜单",
                    contentScale = ContentScale.Crop
                )
            }
        }
    )
}

@Composable
@Preview
fun RecordAppBarPreview() {
    RecordBillTheme(ColorPallet.GREEN_LIGHT) {
        RecordAppBar() {}
    }
}

@Composable
@Preview
fun RecordAppBarPreviewDark() {
    RecordBillTheme(ColorPallet.GREEN_DARK) {
        RecordAppBar() {}
    }
}
