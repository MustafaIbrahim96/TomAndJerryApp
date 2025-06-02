package com.mustafa.tomandjerrytask.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.TomCharacter
import com.mustafa.tomandjerrytask.tomList
import com.mustafa.tomandjerrytask.ui.theme.ButtonCheeseColor
import com.mustafa.tomandjerrytask.ui.theme.DarkBlue
import com.mustafa.tomandjerrytask.ui.theme.DarkGray
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.SearchIconColor

@Composable
fun CheapTomCard(tomCharacter: TomCharacter) {
    Box(modifier = Modifier.background(Color.Transparent)) {

        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(horizontal = 4.dp, vertical = 14.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .padding(top = 92.dp)
                .fillMaxSize()
        ) {

            Column(
                modifier = Modifier.padding(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = tomCharacter.title,
                    fontFamily = IBMPlexSansArabic,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W600,
                    color = DarkGray
                )
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = tomCharacter.description,
                    fontFamily = IBMPlexSansArabic,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    color = SearchIconColor,
                    textAlign = TextAlign.Center,
                    minLines = 3
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding( top = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Card(
                        modifier = Modifier
                            .padding(end = 4.dp)
                            .weight(106f)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        colors = CardDefaults.cardColors(ButtonCheeseColor),
                        onClick = {},
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                modifier = Modifier.padding(
                                    start = 10.dp,
                                    top = 8.dp,
                                    bottom = 8.dp,
                                    end = 4.dp
                                ).size(16.dp),
                                painter = painterResource(R.drawable.ic_money_bag),
                                contentDescription = "money bag icon",
                                tint = DarkBlue
                            )
                            if (tomCharacter.hasDiscount) {
                                Text(
                                    modifier = Modifier.padding(end = 4.dp),
                                    text = tomCharacter.price.toString(),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = IBMPlexSansArabic,
                                    color = DarkBlue,
                                    textDecoration = TextDecoration.LineThrough
                                )
                                Text(
                                    text = "${tomCharacter.discountPrice} Cheeses",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.W500,
                                    fontFamily = IBMPlexSansArabic,
                                    color = DarkBlue,
                                )
                            } else {
                                Text(
                                    modifier = Modifier.padding(start = 4.dp),
                                    text = "${tomCharacter.price} Cheeses",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.W500,

                                    fontFamily = IBMPlexSansArabic,
                                    color = DarkBlue,
                                )
                            }
                        }
                    }

                    Card(
                        modifier = Modifier
                            .padding(start = 4.dp)
                            .weight(30f),
                        colors = CardDefaults.cardColors(Color.Transparent),
                        border = BorderStroke(1.dp, DarkBlue),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Icon(
                            modifier = Modifier
                                .padding(all = 8.dp)
                                .align(Alignment.CenterHorizontally),
                            painter = painterResource(R.drawable.ic_buskt),
                            contentDescription = "money bag icon",
                            tint = DarkBlue
                        )
                    }
                }
            }
        }

        Box(modifier = Modifier.align(Alignment.TopCenter)) {
            Image(
                modifier = Modifier.height(100.dp),
                painter = painterResource(tomCharacter.image),
                contentDescription = "tom banner",
            )
        }
    }
}

@Preview
@Composable
fun PreviewCheapeTomCard() {
    CheapTomCard(tomList.get(1))
}