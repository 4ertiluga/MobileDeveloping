package com.example.mobiledeveloping

fun z2v3() {
    println("Введите любое число")
    var Number = readln().toInt()
    var Number1 = Number
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
    when(Number1){
        in 2..5 -> Number1 + 1 100
        !in 0..3000 -> Number1 * 3
        else -> Number1 = 0
    }
    println("Результат IF:" + Number)
    println("Результат When" + Number1)


}