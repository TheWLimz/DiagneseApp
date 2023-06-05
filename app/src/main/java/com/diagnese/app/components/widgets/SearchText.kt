package com.diagnese.app.components.widgets

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import com.diagnese.app.utils.Constants

@Composable
fun SearchTextField(
    modifier : Modifier = Modifier,
    label : String,
    value : String = "",
    onValueChange : (TextFieldValue) -> Unit = {}
){

    TextField(
        value = TextFieldValue(value),
        onValueChange = onValueChange,
        label = { Text(text = label, fontFamily = Constants.FONT_FAMILY_MEDIUM)},
        modifier = modifier.fillMaxWidth(),
        shape = Constants.BUTTON_CORNER_RADIUS
    )

}