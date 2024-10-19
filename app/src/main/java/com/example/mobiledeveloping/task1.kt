package com.example.myapplication

fun task1() {
    var nullableVar: Int? = null
    println(nullableVar)
    nullableVar = 42
    val text: String = nullableVar?.toString() ?: "null"
    println(text)
}