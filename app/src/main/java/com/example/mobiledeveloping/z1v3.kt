package com.example.mobiledeveloping

import java.time.LocalDate


fun z1v3() {
    val currentDate = LocalDate.now()
    val dayOfWeek = currentDate.dayOfWeek
    val month = currentDate.month
    val name = "Sergey"
    println(dayOfWeek)
    println(month)
    println(name)

}