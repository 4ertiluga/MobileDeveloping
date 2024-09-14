package com.example.mobiledeveloping

class Circle(
    color: String,
    filled: Boolean,
    private val radius: Double
) : Shape(color, filled) {


    override fun getArea(): Double {
        return Math.PI * radius * radius
    }


    override fun getPerimeter(): Double {
        return 2 * Math.PI * radius
    }


    override fun toString(): String {
        return "Circle(color='$color', filled=$filled, radius=$radius)"
    }
}