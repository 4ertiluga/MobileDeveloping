package com.example.mobiledeveloping

fun z2v4() {
    println("Введите номер месяца")
    var NumberOf = readln().toInt()
    var NumberOf1 = NumberOf

     if(NumberOf > 12 || NumberOf < 1)
    {
        println("Такого месяца нет")
    }


    if (NumberOf >= 3 && NumberOf <= 5){
        println("Весна")
    }
    else if (NumberOf == 12 || NumberOf == 1 || NumberOf == 2)
    {
        println("Зима")
    }
    else if (NumberOf >= 6 && NumberOf <= 8){
        println("Лето")
    }
    else if (NumberOf >= 9 && NumberOf <= 11){
        println("Осень")
    }


    when(NumberOf1){
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        !in 3..11 -> println("Зима")

    }
}