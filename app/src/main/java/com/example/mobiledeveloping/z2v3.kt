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
        in 2..5 + 10 -> println("от 2 до 5")
        in 7..40 - 100 -> println("от 7 до 40")
        !in 0..3000 *3 -> println("меньше 0 и больше 3000")
        else -> Number1 = 0
    }
    println("Результат IF:" + Number)
    println("Результат When" + Number1)


}