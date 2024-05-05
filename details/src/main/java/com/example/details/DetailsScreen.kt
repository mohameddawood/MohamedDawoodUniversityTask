package com.example.details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.network.network.UniversityItem


@Composable
fun DetailsScreen(item: UniversityItem){
    Column(Modifier.padding(12.dp)) {
        Text(text = item.name, fontSize = 24.sp)
        Text(text = item.`state-province`)
        Text(text = item.country, modifier = Modifier.fillMaxWidth())
        Row {
            Text(text = item.domains.first())
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                imageVector = Icons.Default.MailOutline,
                contentDescription = "Greater Than Symbol"
            )
            Text(text = item.alphaTwoCode)
        }
    }
}
@Composable
fun DismissOnClickOutsideDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    content: @Composable () -> Unit
) {
    if (showDialog) {
        Dialog(onDismissRequest = onDismiss) {
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                contentAlignment = Alignment.Center,

            ) {
                Card(
                    shape = RoundedCornerShape(8.dp),
                    elevation  = CardDefaults.cardElevation(
                        defaultElevation = 12.dp
                    ),
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        content()
                    }
                }
            }
        }
    }
}