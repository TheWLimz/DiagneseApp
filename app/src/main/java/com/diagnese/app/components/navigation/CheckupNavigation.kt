package com.diagnese.app.components.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.diagnese.app.pages.checkup.CheckupScreen
import com.diagnese.app.pages.checkup.CheckupViewModel
import com.diagnese.app.pages.checkup.screens.CheckOnceScreen
import com.diagnese.app.pages.checkup.screens.GetStartedScreen
import com.diagnese.app.pages.checkup.screens.SelectSymptomScreen

@Composable
fun CheckupNavigation(
    navHostController: NavHostController,
    viewModel: CheckupViewModel
){
   NavHost(
       navController = navHostController,
       startDestination = CheckupScreen.GetStarted.route,
   ){
       composable(CheckupScreen.GetStarted.route){
           GetStartedScreen(
              navHostController = navHostController
           )
       }

       composable(CheckupScreen.SelectSymptoms.route){
           SelectSymptomScreen(navHostController = navHostController, viewModel = viewModel)
       }


       composable(CheckupScreen.CheckOnceMore.route){
          CheckOnceScreen(navHostController = navHostController)
       }

       composable(CheckupScreen.CheckupResult.route){

       }


   }
}