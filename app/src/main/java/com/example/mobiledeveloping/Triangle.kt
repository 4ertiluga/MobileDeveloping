package com.example.mobiledeveloping

class Triangle(
    color: String,
    filled: Boolean,
    private val sideA: Double,
    private val sideB: Double,
    private val sideC: Double
) : Shape(color, filled) {


    override fun getArea(): Double {
        val s = (sideA + sideB + sideC) / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }


    override fun getPerimeter(): Double {
        return sideA + sideB + sideC
    }


    override fun toString(): String {
        return "Triangle(color='$color', filled=$filled, sideA=$sideA, sideB=$sideB, sideC=$sideC)"
    }
}