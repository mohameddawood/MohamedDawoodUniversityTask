package com.example.list.universities.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.network.network.UniversityItem

@Composable
fun UniversityScreenItem(item: UniversityItem, onItemClick:  () -> Unit) {
    Surface(
        modifier = Modifier.run {
            fillMaxWidth()
                .clickable(onClick = onItemClick)
                .padding(16.dp)
        },
        shape = RoundedCornerShape(8.dp),
        color = Color.White,
    ) {
        Row(horizontalArrangement = Arrangement.End) {

            Column(
                modifier = Modifier.padding(16.dp).fillMaxWidth().weight(1f)
            ) {
                BasicText(
                    text = item.name,
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                BasicText(
                    text = item.`state-province`,
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(modifier = Modifier.height(8.dp))

            }
            Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "",   modifier = Modifier.size(24.dp))

        }

    }
}