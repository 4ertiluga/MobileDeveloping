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
    z3v22() //Сидаш
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
}