package com.diagnese.app.pages.checkup.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.diagnese.app.R
import com.diagnese.app.components.widgets.ButtonComponent
import com.diagnese.app.components.widgets.CheckupStepSection
import com.diagnese.app.components.widgets.Loading
import com.diagnese.app.components.widgets.SearchTextField
import com.diagnese.app.components.widgets.SelectBox
import com.diagnese.app.pages.checkup.CheckupViewModel
import com.diagnese.app.utils.Constants
import kotlin.reflect.full.memberProperties

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectSymptomScreen(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    viewModel : CheckupViewModel
){
    val symptomsState = viewModel.symptomsData.observeAsState()

    val symptoms = symptomsState.value!!.data::class.memberProperties

   var isExpanded by remember { mutableStateOf(false ) }


    val dropdownMenuList = listOf("Head", "Torso","Hand", "Feet", "Body")
    var selectedText by remember {
        mutableStateOf("Select the body part")
    }
    

    Scaffold {


        LazyColumn(verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier
                .padding(it)
                .fillMaxSize()
                .background(color = colorResource(id = R.color.blue_400)),) {

                item{
                    CheckupStepSection(text = "Step 2", onButtonClick = {
                        navHostController.navigate("get-started")
                    })
                }

                item {
                    Text(
                        text = "Which part of the body that bothering you ?",
                        color = Color.White,
                        fontSize = Constants.XXL_FONT_SIZE.sp,
                        fontFamily = Constants.FONT_FAMILY_BOLD,
                        modifier = Modifier.padding(15.dp)
                    )
                }

                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(15.dp)
                    ){
                        ExposedDropdownMenuBox(expanded = isExpanded, onExpandedChange = {
                            isExpanded = !isExpanded
                        }) {
                            TextField(
                                value = selectedText,
                                readOnly = true,
                                onValueChange = {},
                                textStyle = TextStyle(
                                    fontFamily = Constants.FONT_FAMILY_BOLD,
                                    fontSize = Constants.MEDIUM_FONT_SIZE.sp
                                ) ,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .menuAnchor(),
                            )

                            ExposedDropdownMenu(expanded = isExpanded, onDismissRequest = { isExpanded = false }) {
                                dropdownMenuList.forEach{ item ->
                                    DropdownMenuItem(
                                        text = {
                                            Text(
                                                text = item,
                                                fontSize = Constants.MEDIUM_FONT_SIZE.sp,
                                                fontFamily = Constants.FONT_FAMILY_BOLD,
                                            )

                                               },
                                        onClick = {
                                            selectedText = item
                                            isExpanded = false
                                        }
                                    )
                                }
                            }

                        }
                    }

                }

                item {
                    SearchTextField(
                        label = "Search for disease",
                        modifier = Modifier.padding(15.dp)
                    )

                }

                item {
                    Card(modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                        .height(300.dp), colors = CardDefaults.cardColors(Color.White)) {
 
                        LazyColumn(modifier = Modifier.padding(10.dp)){
                            item {
                                if(symptomsState.value == null){
                                    Loading()
                                } else {
                                    symptoms.forEach { property ->
                                        SelectBox(text = property.name.replaceFirstChar { i -> i.uppercase() })
                                        Spacer(modifier = Modifier.height(8.dp))
                                    }
                                }
                            }
                        }
                    }
                }

                item {
                    ButtonComponent(buttonMenu = stringResource(id = R.string.next), modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp), onClick = {
                        navHostController.navigate("check")
                    })
                }
            }

        }
    }

