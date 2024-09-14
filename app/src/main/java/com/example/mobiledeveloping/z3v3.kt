package com.example.mobiledeveloping

fun z3v3() {
    var sum = 0

    for (i in 10 downTo 1) {
        val number = i * i
        val x =  i.toString().repeat(i)
        print("$x")
        sum += number
    }


    println("Сумма всех чисел: $sum")
}