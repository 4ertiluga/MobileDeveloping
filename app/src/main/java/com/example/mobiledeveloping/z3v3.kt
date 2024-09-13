package com.example.mobiledeveloping

fun z3v3() {
    var sum: Long = 0

    for (i in 9 downTo 1) {
        val numberString = i.toString().repeat(i)
        print(numberString)
            sum += numberString.toLong()


    }

    println("Сумма всех чисел: $sum")
}