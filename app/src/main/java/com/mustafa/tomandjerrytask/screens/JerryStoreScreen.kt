package com.mustafa.tomandjerrytask.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mustafa.tomandjerrytask.composable.BuyTomBanner
import com.mustafa.tomandjerrytask.composable.HeaderJerryStore
import com.mustafa.tomandjerrytask.composable.SearchAndFilter
import com.mustafa.tomandjerrytask.composable.CheapTomCard
import com.mustafa.tomandjerrytask.composable.ViewAllToms
import com.mustafa.tomandjerrytask.tomList
import com.mustafa.tomandjerrytask.ui.theme.ScreenBackGround

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun JerryStoreScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ScreenBackGround)
            .padding(start = 12.dp, end = 12.dp, top = 6.dp,bottom = 8.dp)
    ) {
        HeaderJerryStore()
        SearchAndFilter()
        BuyTomBanner()
        ViewAllToms()
        LazyVerticalGrid(
            modifier = Modifier.padding(top = 16.dp),
            columns = GridCells.Fixed(2)
        ) {
            items(tomList.size) { index ->
                CheapTomCard(tomList[index])
            }

        }

    }
}

@Preview
@Composable
fun PreviewJerryStoreScreen() {
    JerryStoreScreen()
}