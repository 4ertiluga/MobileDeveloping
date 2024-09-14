package com.example.mobiledeveloping

fun z3v22() {
    println("Введите свое число: ")
    val Number = readln().toInt()

    if(Number == 2)
    {
        println("Ваше число простое")
    }

    if(Number % 2 == 0)
    {
        println("Ваше число не простое")
    }
    else if (Number < 2)
    {
        println("Ваше число не простое")
    }
    else
    {
        println("Ваше число простое")
    }
}