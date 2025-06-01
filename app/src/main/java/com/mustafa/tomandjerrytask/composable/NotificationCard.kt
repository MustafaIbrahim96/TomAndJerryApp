package com.mustafa.tomandjerrytask.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.DarkBlue
import com.mustafa.tomandjerrytask.ui.theme.NotificationBackGround

@Composable
fun NotificationCard(notificationCount: Int) {
    Box(modifier = Modifier.padding()) {
        Box(
            modifier = Modifier
                .padding(top = 4.dp, end = 1.dp)
                .border(
                    width = 0.8.dp,
                    color = NotificationBackGround,
                    shape = RoundedCornerShape(12.dp)
                )
                .clip(RoundedCornerShape(12.dp))
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.ic_notification),
                contentDescription = "Notifications",
                modifier = Modifier.padding(all = 8.dp)
            )
        }

        if (notificationCount > 0) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(color = DarkBlue)
                        .size(14.dp)
                        .align(Alignment.TopEnd)
                ) {
                    Text(
                        text = notificationCount.toString(),
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.W600,
                            fontFamily = IBMPlexSansArabic
                        ),
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNotificationCard() {
    NotificationCard(notificationCount = 3)
}