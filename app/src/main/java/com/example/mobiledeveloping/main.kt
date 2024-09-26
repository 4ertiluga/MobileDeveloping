package com.example.mobiledeveloping

fun main() {
    mainnn()
    println()
    z1v3() //Бирюков
    println()
    z1v7() //Сидаш
    println()
    z2v3() //Бирюков
    println()
    z2v4() //Сидаш
    println()
    z3v3() //Бирюков
    println()
    //задание3
    println("Введите свое число: ")
    val number = readln().toInt()
    if (z3v22(number)) {
        println("$number - простое число")
    } else {
        println("$number - не простое число")
    }
     //Сидаш
    println()
    z4v3() //Бирюков
    println()
    z4v9() //Сидаш
    println()
    println()

    //Общее задание #5
    val circle = Circle("Red", true, 5.0)
    val rectangle = Rectangle("Blue", false, 4.0, 6.0)
    val triangle = Triangle("Green", true, 3.0, 4.0, 5.0)

    val shapes = listOf(circle, rectangle, triangle)

    for (shape in shapes) {
        println(shape.toString())
        println("Area: ${shape.getArea()}")
        println("Perimeter: ${shape.getPerimeter()}")
        println()
    }
    println()

    println(l2z1v3(4)) //Бирюков
    println()
    val result1 = l2z2v3(150)
    println(result1)
    println()
    println(l2z1v2(22))
    println()
    val resslt1 = l2z2v2(4)
    println("Результат для 4: $result1")

}
