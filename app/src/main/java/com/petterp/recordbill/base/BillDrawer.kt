package com.petterp.recordbill.base

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.petterp.recordbill.R

/**
 *
 * @author petterp
 */

@Composable
fun BillDrawer(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .padding(start = 24.dp, end = 24.dp)
    ) {
        Image(
            painter = painterResource(id = R.mipmap.ic_t2),
            contentDescription = stringResource(id = R.string.cd_menu)
        )
        LazyColumn {
            val modifier = Modifier
                .padding(top = 20.dp, bottom = 20.dp)
                .paddingFromBaseline(top = 10.dp, bottom = 10.dp)
            (0..7).forEach {
                item {
                    Text(
                        text = "记录-$it",
                        modifier = modifier
                    )
                }
            }
        }
    }
}
