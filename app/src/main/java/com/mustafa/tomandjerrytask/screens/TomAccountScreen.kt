package com.mustafa.tomandjerrytask.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.ui.theme.ButtonCheeseTomKitchenColor
import com.mustafa.tomandjerrytask.ui.theme.CardFourTomAccountColor
import com.mustafa.tomandjerrytask.ui.theme.CardThreeTomAccountColor
import com.mustafa.tomandjerrytask.ui.theme.CardTwoTomAccountColor
import com.mustafa.tomandjerrytask.ui.theme.DarkGray
import com.mustafa.tomandjerrytask.ui.theme.DescriptionCardTitleTomKitchenColor
import com.mustafa.tomandjerrytask.ui.theme.DescriptionTomKitchenColor
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.ScreenBackGround
import com.mustafa.tomandjerrytask.ui.theme.SpacerTomAccountColor
import com.mustafa.tomandjerrytask.ui.theme.TitleTomKitchenColor
import com.mustafa.tomandjerrytask.ui.theme.WhiteColor12A
import com.mustafa.tomandjerrytask.ui.theme.WhiteColor80A

@Composable
fun TomAccountScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier) {
            Image(
                modifier = Modifier
                    .height(195.dp)
                    .fillMaxWidth(),
                painter = painterResource(R.drawable.img_background_tom_account),
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
                    Column(
                        modifier = Modifier
                            .fillMaxSize()

                            .verticalScroll(rememberScrollState()),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Column(
                            modifier = Modifier
                                .padding(
                                    start = 16.dp,
                                    end = 16.dp,
                                    top = 24.dp,
                                )
                        ) {
                            Row(modifier = Modifier.fillMaxWidth()) {
                                CardTomAccount(
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(end = 4.dp),
                                    color = ButtonCheeseTomKitchenColor,
                                    title = "2M 12K",
                                    subTitle = "No. of quarrels",
                                    icon = painterResource(R.drawable.ic_devil_container)
                                )
                                CardTomAccount(
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(start = 4.dp),
                                    color = CardTwoTomAccountColor,
                                    title = "+500 h",
                                    subTitle = "Chase time",
                                    icon = painterResource(R.drawable.ic_run_container)
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 8.dp)
                            ) {
                                CardTomAccount(
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(end = 4.dp),
                                    color = CardThreeTomAccountColor,
                                    title = "2M 12K",
                                    subTitle = "Hunting times",
                                    icon = painterResource(R.drawable.ic_sad_container)
                                )
                                CardTomAccount(
                                    modifier = Modifier
                                        .weight(1f)
                                        .padding(start = 4.dp),
                                    color = CardFourTomAccountColor,
                                    title = "3M 7K",
                                    subTitle = "Heartbroken",
                                    icon = painterResource(R.drawable.ic_broken_heart_container)
                                )
                            }

                            Text(
                                modifier = Modifier.padding(top = 24.dp),
                                text = "Tom settings",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    lineHeight = 20.sp,
                                    fontFamily = IBMPlexSansArabic,
                                    color = TitleTomKitchenColor
                                ),
                            )

                            CardTomSetting(
                                modifier = Modifier.padding(top = 8.dp),
                                icPainter = painterResource(R.drawable.ic_bed),
                                title = "Change sleeping place"
                            )

                            CardTomSetting(
                                modifier = Modifier.padding(top = 12.dp),
                                icPainter = painterResource(R.drawable.ic_cat),
                                title = "Meow settings"
                            )

                            CardTomSetting(
                                modifier = Modifier.padding(top = 12.dp),
                                icPainter = painterResource(R.drawable.ic_fridge),
                                title = "Password to open the fridge"
                            )
                        }
                        Spacer(
                            modifier = Modifier
                                .padding(vertical = 12.dp)
                                .fillMaxWidth()
                                .height(1.dp)
                                .background(SpacerTomAccountColor)
                        )
                        Column(
                            modifier = Modifier
                                .padding(
                                    start = 16.dp,
                                    end = 16.dp
                                )
                        ) {
                            Text(
                                text = "His favorite foods",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.W700,
                                lineHeight = 20.sp,
                                fontFamily = IBMPlexSansArabic,
                                color = TitleTomKitchenColor
                            )

                            CardTomSetting(
                                modifier = Modifier.padding(top = 8.dp),
                                icPainter = painterResource(R.drawable.ic_alert),
                                title = "Mouses"
                            )
                            CardTomSetting(
                                modifier = Modifier.padding(top = 8.dp),
                                icPainter = painterResource(R.drawable.ic_hamburger),
                                title = "Last stolen meal"
                            )
                            CardTomSetting(
                                modifier = Modifier.padding(top = 8.dp),
                                icPainter = painterResource(R.drawable.ic_sleeping),
                                title = "Change sleep mood"
                            )
                        }
                        Text(
                            modifier = Modifier.padding(top = 16.dp),
                            text = "v.TomBeta",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.W400,
                            lineHeight = 12.sp,
                            fontFamily = IBMPlexSansArabic,
                            color = DescriptionTomKitchenColor
                        )
                    }
                }
            }
        }

    }
}

@Composable
fun CardTomSetting(modifier: Modifier, icPainter: Painter, title: String) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color.White)
        ) {
            Icon(
                modifier = Modifier
                    .size(24.dp)
                    .align(Alignment.Center),
                painter = icPainter,
                contentDescription = "arrow left",
                tint = DarkGray
            )
        }
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.W500,
            lineHeight = 16.sp,
            fontFamily = IBMPlexSansArabic,
            color = TitleTomKitchenColor
        )
    }
}

@Composable
fun CardTomAccount(
    modifier: Modifier,
    color: Color,
    title: String,
    subTitle: String,
    icon: Painter
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(color)

    ) {
        Row(
            modifier = Modifier.padding(
                start = 12.dp,
                top = 9.dp,
                bottom = 9.dp,
                end = 10.dp
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(50.dp),
                painter = icon,
                contentDescription = "add to card",
            )
            Column(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp,
                    fontFamily = IBMPlexSansArabic,
                    color = DescriptionTomKitchenColor
                )
                Text(
                    text = subTitle,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W500,
                    lineHeight = 12.sp,
                    fontFamily = IBMPlexSansArabic,
                    letterSpacing = 0.5.sp,
                    color = DescriptionCardTitleTomKitchenColor
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewTomAccountScreen() {
    TomAccountScreen()
}