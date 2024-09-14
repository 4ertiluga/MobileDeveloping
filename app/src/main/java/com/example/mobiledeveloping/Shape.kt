package com.example.mobiledeveloping

abstract class Shape(
    protected val color: String,
    protected val filled: Boolean
) {

    abstract fun getArea(): Double


    abstract fun getPerimeter(): Double


    override fun toString(): String {
        return "Shape(color='$color', filled=$filled)"
    }
}