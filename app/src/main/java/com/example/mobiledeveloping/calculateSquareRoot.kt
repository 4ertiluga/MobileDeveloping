package com.example.myapplication

import kotlin.math.sqrt

fun calculateSquareRoot(number: Double?): Double {
    val nonNullNumber = number!!
    return sqrt(nonNullNumber)
}
