package com.mustafa.tomandjerrytask.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.GrayColor

@Composable
fun HeaderJerryStore() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier
                    .size(48.dp)
                    .clip(shape = RoundedCornerShape(12.dp)),
                painter = painterResource(R.drawable.img_jerry_profile),
                contentDescription = "Jerry Profile",
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(
                    text = stringResource(R.string.hi_jerry),
                    fontFamily = IBMPlexSansArabic, fontWeight = W500,
                    fontSize = 14.sp,
                    color = Color.Black
                )
                Text(
                    text = stringResource(R.string.which_tom_do_you_want_to_buy),
                    fontFamily = IBMPlexSansArabic, fontWeight = W400,
                    fontSize = 14.sp,
                    color = GrayColor
                )
            }
        }
        NotificationCard(3)
    }
}

@Preview
@Composable
fun PreviewHeaderJerryStore() {
    HeaderJerryStore()
}