package com.mustafa.tomandjerrytask.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.ui.theme.DarkBlue
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.LightBlue

@Composable
fun BuyTomBanner() {
    Box(
        modifier = Modifier
            .background(Color.Transparent)
            .padding(horizontal = 4.dp)
            .padding(top = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(DarkBlue, LightBlue)
                    )
                )
                .align(Alignment.BottomCenter),
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
            ) {
                Text(
                    text = stringResource(R.string.buy_1_tom_and_get_2_for_free),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W600,
                    fontFamily = IBMPlexSansArabic,
                    color = Color.White
                )
                Text(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .width(177.dp),
                    text = "Adopt Tom! (Free Fail-Free Guarantee)",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    fontFamily = IBMPlexSansArabic,
                    minLines = 2,
                    color = Color.White
                )

            }
        }
        Box(modifier = Modifier
            .align(Alignment.CenterEnd)
            .height(120.dp)) {
            Image(
                modifier = Modifier.fillMaxHeight(),
                painter = painterResource(R.drawable.img_tom_banner),
                contentDescription = "tom banner",
                contentScale = ContentScale.FillHeight
            )
        }
    }
}

@Preview
@Composable
fun PreviewBuyTomBanner() {
    BuyTomBanner()
}