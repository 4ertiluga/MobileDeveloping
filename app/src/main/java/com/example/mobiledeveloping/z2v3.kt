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
        in 2..5 -> {
            val res = Number1 + 10
            println("Результат When" + res)
        }
        in 7..40 -> {
            val res = Number1 - 100
            println("Результат When" + res)
        }
        !in 0..3000 -> {
            val res = Number1 * 3
            println("Результат When" + res)
        }
        else -> {
            val res = 0
            println("Результат When" + res)
        }

    }

    println("Результат IF:" + Number)



}