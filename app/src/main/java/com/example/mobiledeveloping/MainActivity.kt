package com.example.mobiledeveloping

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.mobiledeveloping.screens.MainCard
import com.example.mobiledeveloping.screens.TabLayout
import com.example.mobiledeveloping.ui.theme.MobileDevelopingTheme
import org.json.JSONObject

const val API_KEY = "7f6eebb6101546f29f2122941242210"
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileDevelopingTheme {
                getData("London", this)
                Image(
                    painter = painterResource(id = R.drawable.weather_bg),
                    contentDescription = "im1",
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.7f),
                    contentScale = ContentScale.Crop
                )
                Column {
                    MainCard()
                    TabLayout()
                }


            }
        }
    }
}






//@Composable
//fun Greeting(name: String, context: Context) {
//    val state = remember{
//        mutableStateOf("Unknown")
//    }
//    Column(modifier = Modifier.fillMaxSize()) {
//        Box(modifier = Modifier.fillMaxHeight(0.5f)
//            .fillMaxWidth(),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(text = "Temp in $name = ${state.value} °C")
//        }
//        Box(modifier = Modifier.fillMaxHeight()
//            .fillMaxWidth(),
//            contentAlignment = Alignment.BottomCenter
//        ) {
//            Button(onClick = {
//                getData(name, state, context)
//            }, modifier = Modifier.padding(5.dp)
//                .fillMaxWidth()
//            ) {
//                Text(text = "Refresh")
//            }
//        }
//
//    }
//
//}

private fun getData(city: String, context: Context){
    val url = "https://api.weatherapi.com/v1/forecast.json?key=$API_KEY" +
            "&q=$city"+
            "&days=" +
            "3" +
            "&aqi=no&alerts=no\n"
    val queue = Volley.newRequestQueue(context)
    val sRequest = StringRequest(
            Request.Method.GET,
            url,
        {
            response ->
            Log.d("MyLog", "Response : $response" )
        },
        {
            Log.d("MyLog", "VolleyError $it")
        }
            )
    queue.add(sRequest)
}

