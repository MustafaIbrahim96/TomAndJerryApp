package com.mustafa.tomandjerrytask.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.ui.theme.ButtonAddToCardColor
import com.mustafa.tomandjerrytask.ui.theme.ButtonCheeseTomKitchenColor
import com.mustafa.tomandjerrytask.ui.theme.ColorIconDescription
import com.mustafa.tomandjerrytask.ui.theme.DarkBlue
import com.mustafa.tomandjerrytask.ui.theme.DescriptionCardTitleTomKitchenColor
import com.mustafa.tomandjerrytask.ui.theme.DescriptionTomKitchenColor
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.ScreenBackGround
import com.mustafa.tomandjerrytask.ui.theme.SpacerColor
import com.mustafa.tomandjerrytask.ui.theme.TitleTomKitchenColor
import com.mustafa.tomandjerrytask.ui.theme.TomKitchenColorBg
import com.mustafa.tomandjerrytask.ui.theme.WhiteColor38A
import com.mustafa.tomandjerrytask.ui.theme.WhiteColor87A

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
                        modifier = Modifier.size(24.dp),
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
                        fontWeight = FontWeight.W500,
                        letterSpacing = 0.5.sp,
                        lineHeight = 16.sp
                    )
                }
                Row(
                    modifier = Modifier.padding(top = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
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
                        fontWeight = FontWeight.W500,
                        letterSpacing = 0.5.sp,
                        lineHeight = 16.sp
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
                            color = TitleTomKitchenColor,
                            lineHeight = 16.sp,
                            letterSpacing = 0.5.sp
                        )
                        Box(
                            modifier = Modifier
                                .padding(top = 12.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(ButtonCheeseTomKitchenColor)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .padding(
                                            start = 10.dp, top = 8.dp, bottom = 8.dp, end = 4.dp
                                        )
                                        .size(16.dp),
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
                DetailsScroll(modifier = Modifier.weight(1f))

                Box(modifier = Modifier.background(Color.White)) {
                    Spacer(
                        modifier = Modifier
                            .height(1.dp)
                            .fillMaxWidth()
                            .background(SpacerColor)
                    )
                    Button(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(ButtonAddToCardColor)

                    ) {
                        Row {
                            Text(
                                text = "Add to cart",
                                color = WhiteColor87A,
                                fontSize = 16.sp,
                                fontFamily = IBMPlexSansArabic,
                                fontWeight = FontWeight.W500,
                                letterSpacing = 0.5.sp,
                            )
                        }
                        Spacer(
                            modifier = Modifier
                                .padding(start = 8.dp, end = 8.dp)
                                .width(5.dp)
                                .height(5.dp)
                                .clip(CircleShape)
                                .background(WhiteColor38A)

                        )
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                text = "3 cheeses",
                                fontWeight = FontWeight.W500,
                                fontFamily = IBMPlexSansArabic,
                                fontSize = 14.sp,
                                color = Color.White,
                                letterSpacing = 0.5.sp,
                                lineHeight = 16.sp
                            )
                            Text(
                                text = "5 cheeses",
                                fontWeight = FontWeight.W500,
                                fontFamily = IBMPlexSansArabic,
                                fontSize = 12.sp,
                                color = Color.White,
                                letterSpacing = 0.5.sp,
                                lineHeight = 16.sp,
                                textDecoration = TextDecoration.LineThrough,
                            )
                        }
                    }
                }
            }

        }
        Box(
            modifier = Modifier
                .padding(top = 18.dp, end = 24.dp)
                .align(Alignment.TopEnd)
        ) {
            Image(
                painter = painterResource(R.drawable.img_electric_tom_pasta),
                contentDescription = "image electric tom pasta"
            )
        }
    }
}

@Composable
fun DetailsScroll(modifier: Modifier) {
    Column(
        modifier = modifier
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
            .verticalScroll(rememberScrollState()),

        ) {

        Text(
            text = stringResource(R.string.electirc_top_pasta_description),
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle(
                color = DescriptionTomKitchenColor,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontWeight = FontWeight.W500,
                fontFamily = IBMPlexSansArabic,
                letterSpacing = 0.5.sp
            )

        )

        Text(
            modifier = Modifier.padding(top = 24.dp),
            text = "Details",
            fontSize = 18.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.W500,
            fontFamily = IBMPlexSansArabic,
            letterSpacing = 0.5.sp,
            textAlign = TextAlign.Center,
            color = TitleTomKitchenColor
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            CardDetails(
                modifier = Modifier
                    .padding(end = 4.dp)
                    .weight(1f),
                icon = painterResource(R.drawable.ic_temperature),
                title = "1000 V",
                subTitle = "Temperature"
            )
            CardDetails(
                modifier = Modifier
                    .padding(start = 4.dp, end = 4.dp)
                    .weight(1f),
                icon = painterResource(R.drawable.ic_timer),
                title = "3 sparks",
                subTitle = "Time"
            )
            CardDetails(
                modifier = Modifier
                    .padding(start = 4.dp)
                    .weight(1f),
                icon = painterResource(R.drawable.ic_devil),
                title = "1M 12K",
                subTitle = "No. of deaths"
            )

        }
        Text(
            modifier = Modifier.padding(top = 24.dp),
            text = "Preparation method",
            fontSize = 18.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.W500,
            fontFamily = IBMPlexSansArabic,
            letterSpacing = 0.5.sp,
            textAlign = TextAlign.Center,
            color = TitleTomKitchenColor
        )
        Column(modifier = Modifier.padding(top = 8.dp)) {
            CardPreparationMethod(
                title = "Put the pasta in a toaster.", numberOfPreparation = "1"
            )
            Spacer(modifier = Modifier.height(8.dp))
            CardPreparationMethod(
                title = "Pour battery juice over it.", numberOfPreparation = "2"
            )
            Spacer(modifier = Modifier.height(8.dp))
            CardPreparationMethod(
                title = "Wait for the spark to ignite.", numberOfPreparation = "3"
            )
            Spacer(modifier = Modifier.height(8.dp))
            CardPreparationMethod(
                title = "Serve with an insulating glove.", numberOfPreparation = "4"
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun CardPreparationMethod(title: String, numberOfPreparation: String) {
    Box() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 2.dp)
                .padding(start = 20.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(color = Color.White)
        ) {
            Text(
                modifier = Modifier
                    .padding(start = 26.dp, top = 8.dp, bottom = 8.dp)
                    .align(Alignment.CenterStart),
                text = title,
                color = DescriptionTomKitchenColor,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp,
                lineHeight = 16.sp,
                fontFamily = IBMPlexSansArabic,
                letterSpacing = 0.5.sp,
            )
        }
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
                .border(
                    width = 0.8.dp, color = ButtonCheeseTomKitchenColor, shape = CircleShape
                )
                .background(Color.White)

        ) {
            Text(
                text = numberOfPreparation,
                textAlign = TextAlign.Center,
                color = ColorIconDescription,
                fontWeight = FontWeight.W500,
                fontSize = 12.sp,
                letterSpacing = 0.5.sp,
                fontFamily = IBMPlexSansArabic,
                modifier = Modifier
                    .padding(vertical = 10.dp, horizontal = 16.dp)
            )
        }

    }
}

@Composable
fun CardDetails(modifier: Modifier, icon: Painter, title: String, subTitle: String) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(ButtonCheeseTomKitchenColor)
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                modifier = Modifier
                    .height(32.dp)
                    .width(32.dp),
                painter = icon,
                contentDescription = null,
                tint = ColorIconDescription
            )
            Text(
                modifier = Modifier.padding(top = 12.dp),
                text = title,
                fontSize = 14.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W500,
                fontFamily = IBMPlexSansArabic,
                letterSpacing = 0.5.sp,
                textAlign = TextAlign.Center,
                color = DescriptionTomKitchenColor
            )
            Text(
                modifier = Modifier.padding(top = 4.dp),
                text = subTitle,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.W500,
                fontFamily = IBMPlexSansArabic,
                letterSpacing = 0.5.sp,
                textAlign = TextAlign.Center,
                color = DescriptionCardTitleTomKitchenColor
            )
        }
    }
}

@Preview
@Composable
fun PreviewTomKitchenScreen() {
    TomKitchenScreen()
}