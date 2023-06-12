package com.diagnese.app.pages.settings


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.diagnese.app.components.widgets.CenterAppBar
import com.diagnese.app.components.widgets.SettingComponent
import com.diagnese.app.model.Data
import com.diagnese.app.model.SettingsMenuItem


@OptIn(ExperimentalMaterial3Api::class)
class SettingsMenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply { 
            setContent { 
                SettingsMenu()
            }
        }
    }

}

@ExperimentalMaterial3Api
@Composable
fun SettingsMenu(
    modifier : Modifier = Modifier
){
    val context = LocalContext.current
    Scaffold( 
        topBar = {
            CenterAppBar(context = context, title = "Settings")
        }
    ) { paddingValues ->  
        LazyColumn(modifier = modifier.padding(paddingValues), verticalArrangement = Arrangement.spacedBy(12.dp)) {
           items(Data.settingsMenuItem, key = { it.title }){ menuItem ->
               SettingComponent(
                   leading = menuItem.leadingIcon,
                   title = menuItem.title,
                   trailing = menuItem.trailingIcon,

               )
               Divider(color = Color.LightGray)
           }

           item {
               val settingItem = SettingsMenuItem(
                   leadingIcon = Icons.Default.Logout,
                   title = "Log Out",
               )

               SettingComponent(
                   leading = settingItem.leadingIcon,
                   title = settingItem.title,
                   trailing = settingItem.trailingIcon,
                   textColor = Color.Red,
                   iconColor = Color.Red
               )
           }
        }
    }
    
}



