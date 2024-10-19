package com.example.myapplication

fun main() {
    //Задание 1
    task1()
    println()
    //Задание 2
    println(getFullName(null, "Богдан"))
    println()
    //Задание 3
    try {
        val result = calculateSquareRoot(16.0)
        println("Квадратный корень: $result")
    } catch (e: NullPointerException) {
        println("Передано значение null")
    }

    try {
        val result = calculateSquareRoot(null)
        println("Квадратный корень: $result")
    } catch (e: NullPointerException) {
        println("Передано значение null")
    }
    println()
    //Задание 4
    println("Введите сообщение")
    val soob = readln()
    println(getStringLength(soob))
}