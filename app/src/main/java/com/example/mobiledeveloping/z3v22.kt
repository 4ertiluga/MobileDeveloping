package com.example.mobiledeveloping

fun z3v22(n:Int):Boolean {


    if (n <= 1) return false
    if (n == 2) return true
    if (n % 2 == 0) return false

    for (i in 3..(n / 2) step 2) {
        if (n % i == 0) return false
    }
    return true

}