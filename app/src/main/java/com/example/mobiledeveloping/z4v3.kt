package com.example.mobiledeveloping

fun z4v3() {
    val array = arrayOf(7, 2, 3, 4, 6, 5, 9, 8, 1, 10, 11, 15, 22, 45, 66)

    val chet = ArrayList<Int>()

    val nechet = ArrayList<Int>()

    for (element in array)
    {
        if(element % 2 == 0)
        {
            chet.add(element)
        }
        else
        {
            nechet.add(element)
        }

    }
    val sortedEvenNumbers = chet.sorted()
    val sortedOddNumbers = nechet.sorted()
    println("Отсортированные четные числа: ${sortedEvenNumbers.joinToString()}")
    println("Отсортированные нечетные числа: ${sortedOddNumbers.joinToString()}")
}