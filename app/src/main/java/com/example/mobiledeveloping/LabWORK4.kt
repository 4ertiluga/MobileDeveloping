package com.example.mobiledeveloping

import android.widget.DatePicker
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import java.time.LocalDate
import java.time.YearMonth
import java.time.format.TextStyle
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController, viewModel: MainViewModel = viewModel()) {
    val scope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("My First App", fontFamily = FontFamily.Monospace) },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.FavoriteBorder,
                            contentDescription = "Menu",
                            Modifier.size(100.dp)
                        )
                    }
                }
            )
        },

        bottomBar = {
            BottomAppBar {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween


                ) {
                    IconButton(onClick = {viewModel.onCalendarClick()}) {
                        Icon(
                            Icons.Filled.DateRange,
                            contentDescription = "Date Icon",
                            Modifier.size(100.dp)
                        )
                    }
                    IconButton(onClick = {viewModel.onHomeClick()}) {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Home Icon",
                            Modifier.size(100.dp)
                        )
                    }
                    IconButton(onClick = {viewModel.onProfileClick()}) {
                        Icon(
                            Icons.Filled.AccountCircle,
                            contentDescription = "Account Icon",
                            Modifier.size(100.dp)
                        )
                    }
                }
            }

        },
    ) { paddingValues ->


        when{
            viewModel.isProfileClicked.value -> Profile(paddingValues)
            viewModel.isHomeClicked.value -> ChatList(paddingValues, navController)
            viewModel.isCalendarClicked.value -> Calendar(paddingValues)
        }
    }
}
@Composable
fun ChatList(paddingValues: PaddingValues, navController: NavController){
        LazyColumn(
            modifier = Modifier.fillMaxSize()

        ) {

            item {
                Text(
                    modifier = Modifier

                        .padding(top = 60.dp, bottom = 20.dp, start = 10.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,

                    text = "Hello! That's your last chats"
                )
            }
            items(100) { index ->
                Row(
                    verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                        .fillMaxWidth()

                        .border(0.1.dp, color = Color.Black)
                        .clickable {
                            navController.navigate(Screens.ChatScreen.screenName)
                        }
                )
                {


                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_foreground),
                        contentDescription = "Simple Image", modifier = Modifier
                            .clip(CircleShape)
                            .background(Color.LightGray)
                            .size(50.dp)


                    )
                    Column {


                        Text(
                            modifier = Modifier

                                .background(

                                    Color.White

                                )

                                .padding(start = 5.dp, top = 5.dp)
                                .fillMaxWidth(),
                            fontWeight = FontWeight.Bold,
                            text = "Chat number $index",
                            fontSize = 14.sp,


                            )
                        Text(
                            modifier = Modifier
                                .background(

                                    Color.White

                                )

                                .padding(start = 5.dp, top = 5.dp)
                                .fillMaxWidth(),
                            text = "That a simple example for chat number $index. I just want to see this text on two lines so that you can try to make a restriction",
                            fontSize = 14.sp,
                        )
                    }
                    }
                }
            }
        }

@Composable
fun Profile(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
            .padding(16.dp),

    ) {

        Text(
            text = "Hello,Dear user.",

            modifier = Modifier.padding(bottom = 8.dp),
            fontSize = 30.sp

        )
        Row{
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground), // Замените на ваш ресурс иконки
            contentDescription = "Simple Image", modifier = Modifier
                .clip(CircleShape)
                .background(Color.LightGray)
                .size(120.dp)
        )




        Column {


        Text(
            text = "Bogdan Sidash",

            modifier = Modifier.padding(bottom = 10.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )


        Text(
            text = "Age: 25",
            fontSize = 20.sp

        )
        }
        }
}
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calendar(paddingValues: PaddingValues) {
    val today = LocalDate.now()
    val yearMonth = YearMonth.from(today)
    val daysInMonth = yearMonth.lengthOfMonth()
    val firstDayOfMonth = yearMonth.atDay(1).dayOfWeek.value

    val daysOfMonth = (1..daysInMonth).toList()
    val daysOfWeek = listOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = yearMonth.month.getDisplayName(TextStyle.FULL, Locale.getDefault()) + " " + yearMonth.year,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(7),
            contentPadding = PaddingValues(4.dp)
        ) {
            items(daysOfWeek) { day ->
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .background(Color.LightGray, shape = MaterialTheme.shapes.small)
                        .padding(4.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = day,
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Black
                    )
                }
            }

            items(daysOfMonth) { day ->
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .background(Color.White, shape = MaterialTheme.shapes.small)
                        .padding(8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = day.toString(),
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Black
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen(paddingValues: PaddingValues, navController: NavController){
    val messages = remember { mutableStateListOf<String>() }
    val (newMessage, setNewMessage) = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Header with back button
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    Icons.Filled.ArrowBack,
                    contentDescription = "Back",
                    modifier = Modifier.size(24.dp)
                )
            }
            Text(
                text = "Chat",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        // Chat messages
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            items(messages) { message ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = message,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }

        // Input field for new message
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextField(
                value = newMessage,
                onValueChange = { setNewMessage(it) },
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 8.dp),
                placeholder = { Text("Type a message...") }
            )
            IconButton(onClick = {
                if (newMessage.isNotBlank()) {
                    messages.add(newMessage)
                    setNewMessage("")
                }
            }) {
                Icon(
                    Icons.Filled.Send,
                    contentDescription = "Send",
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}

@Preview
@Composable

private fun preview() {
    MainScreen(
        rememberNavController()
    )
}