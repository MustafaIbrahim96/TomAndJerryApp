package com.mustafa.tomandjerrytask.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.ui.theme.DarkBlue
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.SearchIconColor

@Composable
fun SearchAndFilter() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 12.dp)
            .padding(horizontal = 4.dp),
        verticalAlignment = Alignment.CenterVertically

    ) {
        SearchBar(modifier = Modifier.weight(272f))

        Card(
            modifier = Modifier
                .padding(start = 4.dp)
                .weight(48f)
                .clip(shape = RoundedCornerShape(12.dp)),
            colors = CardDefaults.cardColors(DarkBlue),
        ) {
            Icon(
                modifier = Modifier
                    .padding(12.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(R.drawable.ic_filter),
                tint = Color.White,
                contentDescription = "search icon"
            )
        }
    }
}

@Preview
@Composable
fun PreviewSearchAndFilter() {
    SearchAndFilter()
}