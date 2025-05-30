package com.mustafa.tomandjerrytask.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mustafa.tomandjerrytask.R
import com.mustafa.tomandjerrytask.ui.theme.IBMPlexSansArabic
import com.mustafa.tomandjerrytask.ui.theme.darkBlue
import com.mustafa.tomandjerrytask.ui.theme.notificationBackGround

@Composable
fun NotificationBellIcon(notificationCount: Int) {
    Box(
        modifier = Modifier.padding(8.dp)
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 0.4.dp,
                    color = notificationBackGround,
                    shape = RoundedCornerShape(12.dp)
                )
                .clip(RoundedCornerShape(12.dp))
                .padding(8.dp)
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.ic_notification),
                contentDescription = "Notifications",
                modifier = Modifier.size(24.dp)
            )
        }

        if (notificationCount > 0) {
            Box(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .offset(x = 4.dp, y = (-4).dp)
                    .size(14.dp)
                    .clip(CircleShape)
                    .background(darkBlue),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = notificationCount.toString(),
                    color = Color.White,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.W500,
                    fontFamily = IBMPlexSansArabic,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNotificationBellIcon() {
    NotificationBellIcon(notificationCount = 3)
}