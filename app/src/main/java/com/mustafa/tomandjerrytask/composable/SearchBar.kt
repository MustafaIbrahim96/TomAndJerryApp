package com.mustafa.tomandjerrytask.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.SearchIconColor

@Composable
fun SearchBar(modifier: Modifier){
    Row(
        modifier = modifier
            .padding(end = 8.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .background(Color.White)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier
                .background(Color.White)
                .padding()
                .clipToBounds(),
            painter = painterResource(R.drawable.ic_search),
            contentDescription = "search icon",
            tint = SearchIconColor,
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = "Search about tom ...",
            fontWeight = FontWeight.W400,
            fontSize = 14.sp,
            fontFamily = IBMPlexSansArabic,
            color = SearchIconColor
        )
    }
}

@Preview
@Composable
fun PreviewSearchBar(){
    SearchBar(modifier = Modifier)
}