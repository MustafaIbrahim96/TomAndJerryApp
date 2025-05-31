package com.mustafa.tomandjerrytask.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.ui.theme.DarkBlue
import com.mustafa.tomandjerrytask.ui.theme.DarkGray
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic

@Composable
fun ViewAllToms() {
    Row(
        modifier = Modifier
            .padding(top = 24.dp)
            .padding(horizontal = 4.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = stringResource(R.string.cheap_tom_section),
            fontSize = 20.sp,
            fontWeight = FontWeight.W600,
            fontFamily = IBMPlexSansArabic,
            color = DarkGray
        )

        Card(
            colors = CardDefaults.cardColors(Color.Transparent),
        ) {
            Row {
                Text(
                    text = "View all",
                    color = DarkBlue,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W500,
                    fontFamily = IBMPlexSansArabic
                )
                Icon(
                    painter = painterResource(R.drawable.ic_view_all),
                    contentDescription = "view all icon",
                    tint = DarkBlue,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(4.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewViewAllToms() {
    ViewAllToms()
}