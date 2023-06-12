package com.diagnese.app.pages.checkup

sealed class CheckupScreen(val route : String){
    object GetStarted : CheckupScreen("get-started")
    object SelectSymptoms : CheckupScreen("symptoms")
    object CheckOnceMore : CheckupScreen("check")
    object CheckupResult : CheckupScreen("result")
}
