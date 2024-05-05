package com.example.university

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.details.DetailsScreen
import com.example.details.DismissOnClickOutsideDialog
import com.example.list.universities.presentation.UniversityViewModel
import com.example.list.universities.presentation.ui.screens.UniversityScreenItem
import com.example.list.universities.presentation.ui.theme.MohamedDawoodTaskTheme
import com.example.network.network.UniversityItem
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<UniversityViewModel>()

    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var itemDetails:UniversityItem? =null
        setContent {
            LaunchedEffect(key1 = true) {
                viewModel.loadItems()
            }
            MohamedDawoodTaskTheme {
                val items = viewModel.universities
                var showDialog  =  remember {
                    mutableStateOf(false)
                }
                LazyColumn {
                    items(items) { item ->
                        UniversityScreenItem(item = item) {
                            itemDetails = item
                           showDialog.value = !showDialog.value
                        }
                    }
                }
                if (showDialog.value){
                    itemDetails?.let {
                        DismissOnClickOutsideDialog(showDialog.value, onDismiss = {showDialog.value = false}){
                            DetailsScreen(item = itemDetails!!)
                        }
                    }

                }
            }
        }
    }
}
