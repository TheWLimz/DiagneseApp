package com.diagnese.app.components.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.diagnese.app.utils.Constants

@Composable
fun NewsCard(
    modifier : Modifier = Modifier,
    imageUrl : String?,
    title : String,
    onClick : () -> Unit = {}
){
    Card(modifier = modifier
        .padding(10.dp)
        .width(370.dp)
        .height(230.dp)
        .clickable { onClick() },
        border = BorderStroke(1.dp, Color.Gray),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column {
            AsyncImage(model = imageUrl, contentDescription = "news-image", modifier = Modifier
                .fillMaxWidth()
                .height(140.dp))

            Text(
                modifier = Modifier.padding(10.dp),
                text = title,
                fontSize = Constants.MEDIUM_FONT_SIZE.sp,
                fontFamily = Constants.FONT_FAMILY_MEDIUM,
            )
        }
    }

}