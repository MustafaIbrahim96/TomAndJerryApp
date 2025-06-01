package com.mustafa.tomandjerrytask.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.ui.theme.ButtonCheeseColor
import com.mustafa.tomandjerrytask.ui.theme.DarkBlue
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.ScreenBackGround
import com.mustafa.tomandjerrytask.ui.theme.TitleTomKitchenColor
import com.mustafa.tomandjerrytask.ui.theme.TomKitchenColorBg

@Composable
fun TomKitchenScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(TomKitchenColorBg)

    ) {
        Image(
            painter = painterResource(R.drawable.img_tom_kitchen_bg),
            contentDescription = "tom kitchen bg"
        )
        Box(modifier = Modifier.padding(start = 16.dp, top = 40.dp)) {
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_high_tension),
                        contentDescription = "high tension icon",
                        tint = Color.White
                    )
                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = "High tension",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = IBMPlexSansArabic,
                        fontWeight = FontWeight.W500
                    )
                }
                Row(
                    modifier = Modifier.padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_shocking_foods),
                        contentDescription = "Shocking food icons",
                        tint = Color.White
                    )
                    Text(
                        modifier = Modifier.padding(start = 8.dp),
                        text = "Shocking foods",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontFamily = IBMPlexSansArabic,
                        fontWeight = FontWeight.W500
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .padding(top = 162.dp)
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(ScreenBackGround)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 32.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(horizontalAlignment = Alignment.Start) {
                        Text(
                            text = "Electric Tom pasta",
                            fontFamily = IBMPlexSansArabic,
                            fontWeight = FontWeight.W500,
                            fontSize = 20.sp,
                            color = TitleTomKitchenColor
                        )
                        Card(
                            shape = RoundedCornerShape(8.dp),
                            colors = CardDefaults.cardColors(ButtonCheeseColor),
                            onClick = {},
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Icon(
                                    modifier = Modifier.padding(
                                        start = 10.dp,
                                        top = 8.dp,
                                        bottom = 8.dp,
                                        end = 4.dp
                                    ),
                                    painter = painterResource(R.drawable.ic_money_bag),
                                    contentDescription = "money bag icon",
                                    tint = DarkBlue
                                )

                                Text(
                                    modifier = Modifier.padding(start = 4.dp, end = 8.dp),
                                    text = "5 Cheeses",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = IBMPlexSansArabic,
                                    color = DarkBlue,
                                )

                            }
                        }
                    }
                    Icon(
                        painter = painterResource(R.drawable.ic_favorite),
                        contentDescription = "Icon Favorite",
                        tint = DarkBlue
                    )
                }

            }

        }
        Box(modifier = Modifier
            .padding(top = 18.dp, end = 24.dp)
            .align(Alignment.TopEnd)) {
            Image(
                painter = painterResource(R.drawable.img_electric_tom_pasta),
                contentDescription = "image electric tom pasta"
            )
        }
    }
}

@Preview
@Composable
fun PreviewTomKitchenScreen() {
    TomKitchenScreen()
}