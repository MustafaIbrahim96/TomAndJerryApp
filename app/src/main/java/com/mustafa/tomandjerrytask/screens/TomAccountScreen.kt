package com.mustafa.tomandjerrytask.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.ui.theme.ButtonAddToCardColor
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.ScreenBackGround
import com.mustafa.tomandjerrytask.ui.theme.WhiteColor12A
import com.mustafa.tomandjerrytask.ui.theme.WhiteColor80A

@Composable
fun TomAccountScreen() {
    Box(modifier = Modifier.fillMaxSize().background(ButtonAddToCardColor)) {
        Box(modifier = Modifier) {
            Image(
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth(),
                painter = painterResource(R.drawable.ic_background_tom_account),
                contentDescription = "tom account bg",
                contentScale = ContentScale.Crop
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 16.dp)
                .align(Alignment.TopCenter)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    modifier = Modifier.size(64.dp),
                    painter = painterResource(R.drawable.img_tom_profile),
                    contentDescription = "tom account"
                )
                Text(
                    modifier = Modifier.padding(top = 4.dp),
                    text = "Tom",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W500,
                    lineHeight = 21.6.sp,

                    fontFamily = IBMPlexSansArabic,
                    color = Color.White
                )
                Text(
                    modifier = Modifier.padding(top = 4.dp),
                    text = "specializes in failure!",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    lineHeight = 21.6.sp,
                    fontFamily = IBMPlexSansArabic,
                    color = WhiteColor80A
                )
                Box(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .clip(RoundedCornerShape(40.dp))
                        .background(WhiteColor12A)
                ) {
                    Text(
                        modifier = Modifier.padding(vertical = 6.dp, horizontal = 12.dp),
                        text = "Edit foolishness",
                        fontSize = 10.sp,
                        fontWeight = FontWeight.W500,
                        lineHeight = 13.sp,
                        fontFamily = IBMPlexSansArabic,
                        color = Color.White
                    )
                }
                Box(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(ScreenBackGround)
                        .fillMaxSize()
                ) {

                }
            }
        }

    }
}

@Preview
@Composable
fun PreviewTomAccountScreen() {
    TomAccountScreen()
}