package com.example.mobiledeveloping

fun z1v7() {
    println("Введите цену 1кг конфет")
    val Candy = readln().toInt()

    println("Введите цену 1кг печенья")
    val Cookie = readln().toInt()


    val FirstBuy = (Candy * 0.3) + (Cookie * 0.4)
    val SecondBuy = ((Cookie * 2) + (Candy * 1.8)) * 3

    println(FirstBuy)
    println(SecondBuy)
}