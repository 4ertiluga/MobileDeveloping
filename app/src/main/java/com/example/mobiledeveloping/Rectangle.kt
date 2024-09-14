package com.example.mobiledeveloping

class Rectangle(
    color: String,
    filled: Boolean,
    private val width: Double,
    private val height: Double
) : Shape(color, filled) {


    override fun getArea(): Double {
        return width * height
    }


    override fun getPerimeter(): Double {
        return 2 * (width + height)
    }


    override fun toString(): String {
        return "Rectangle(color='$color', filled=$filled, width=$width, height=$height)"
    }
}