@file:OptIn(ExperimentalMaterial3Api::class)

package com.al.play.composesdk

import android.os.Bundle
import android.provider.CalendarContract.Colors
//import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.al.play.composesdk.ui.theme.ComposeSDKTheme
import com.moengage.inapp.MoEInAppHelper

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeSDKTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(16.dp)
//                    )
                    scrollBox()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        MoEInAppHelper.getInstance().showInApp(this)
    }
}

@Preview(showBackground = true)
@Composable
private fun scrollBox() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        EditText(
//
//            modifier = Modifier.padding(16.dp),
//            text="",
//            onTextChanged = { },
//            onFocusChanged = {
//            }
//        )
        
        Spacer(modifier = Modifier.fillMaxWidth().height(64.dp))

        TextField(
            value = "",
            onValueChange = {  },
            label = { Text("Label") }
        )

        repeat(30) {
            Card(
                onClick = {},
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()) {
                Text(text = it.toString(),
                    fontSize = 22.sp,
                    )
            }
        }

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeSDKTheme {
        Greeting("Android")
    }
}