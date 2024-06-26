package com.nhatvm.toptop.data.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun LineColor(height:Dp = 1.dp, color: Color, modifier: Modifier = Modifier){
    Spacer(modifier = modifier
        .fillMaxWidth()
        .height(height)
        .background(color)
    )
}