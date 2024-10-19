package com.example.myapplication

fun getFullName(firstName: String?, lastName: String?): String {
    val first = firstName ?: "Unknown"
    val last = lastName ?: "Unknown"
    return "$first $last"
}
