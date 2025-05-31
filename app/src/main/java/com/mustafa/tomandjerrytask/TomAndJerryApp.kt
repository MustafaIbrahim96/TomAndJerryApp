package com.mustafa.tomandjerrytask

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.mustafa.tomandjerrytask.screens.JerryStoreScreen
import com.mustafa.tomandjerrytask.ui.theme.TomAndJerryTaskTheme


@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun TomAndJerryApp() {
    TomAndJerryTaskTheme {
        Scaffold (contentWindowInsets = WindowInsets.systemBars){
            JerryStoreScreen()
        }
    }
}