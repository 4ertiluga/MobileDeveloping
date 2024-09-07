package com.example.mobiledeveloping

fun z2v3() {
    println("Введите любое число")
    var Number = readln().toInt()
    if (Number >= 2 && Number <= 5)
        {
        Number += 10
    }
    else if (Number >7 && Number <40){
        Number -=100
    }
    else if (Number < 0 || Number>3000){
        Number *= 3
    }
    else {
        Number = 0
    }
    println(Number)
}