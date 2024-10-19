package com.example.myapplication

fun getStringLength(obj: Any?): Int {
    val str = obj as? String
    return str?.length ?: -1
}