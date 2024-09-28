package com.example.mobiledeveloping

fun l2z5() {
    println("Задание 5")
    val exampleFunction1: (Int, Int, String) -> Unit = { a, b, c ->
        println("a = $a, b = $b, c = $c")
    }

    exampleFunction1(1, 2, "тест")

    val exampleFunction2: () -> String = {
        "Это строка, возвращаемая функцией exampleFunction2"
    }

    println(exampleFunction2())
    val exampleFunction3: (() -> Unit) -> Unit = { anotherFunction ->
        println("Выполнение переданной функции:")
        anotherFunction()
    }

    exampleFunction3 { println("Переданная функция вызвана") }
}

