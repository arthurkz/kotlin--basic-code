package com.curso.kotlin.youtube.operator.`in`

fun main() {
    println(isLetter('a'))

    println(isNotDigit('5'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'