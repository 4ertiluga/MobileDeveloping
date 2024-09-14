package com.example.mobiledeveloping

fun main() {
    mainnn()
    println()
    z1v3()
    println()
    z1v7()
    println()
    z2v3()
    println()
    z2v4()
    println()
    z3v3()
    println()
    z3v22()
    z4v3()
    println()
    z4v9()
    println()
    println()

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