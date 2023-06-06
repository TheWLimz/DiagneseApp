package com.diagnese.app.pages.glosary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.diagnese.app.components.widgets.CenterAppBar
import com.diagnese.app.components.widgets.DiseaseHeader
import com.diagnese.app.components.widgets.SearchTextField
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GlosaryActivity : AppCompatActivity() {

    private val glosaryViewModel by viewModels<GlosaryViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
           GlosaryPage(viewModel = glosaryViewModel)
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GlosaryPage(
    modifier : Modifier = Modifier,
    viewModel: GlosaryViewModel
){
    val context = LocalContext.current
    val disease = viewModel.diseaseData.observeAsState()
    val diseaseData = disease.value?.data

    val sortByAlphabet = diseaseData?.sortedBy { it.prognosis }?.groupBy { it.prognosis[0] }

    Scaffold(
        topBar = {
            CenterAppBar(context = context, title = "List of Disease" )
        }
    ) {   paddingValues ->
       Column(modifier = modifier
           .padding(paddingValues)
           .fillMaxSize()) {

           SearchTextField(label = "Search for Glosary...")

           LazyColumn(modifier = Modifier.padding(10.dp)){
               sortByAlphabet?.forEach { (initial, diseaseData) ->
                 stickyHeader {
                     DiseaseHeader(header = initial)
                 }
                   items(diseaseData, key = { it.prognosis}){ item ->
                       Text(text = item.prognosis)
                       Divider(color = Color.LightGray)
                   }
               }


           }


       }
    }
}