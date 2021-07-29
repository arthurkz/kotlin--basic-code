package com.curso.kotlin.youtube.exceptions

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    val porcent = porcentagem(59)
    println(porcent)

//    val porcent2 = porcentagem(101)
//    println(porcent2)

    val idade = lerIdade()
    println(idade)
}

fun porcentagem(numero: Int): String {
    return if (numero in 1..100){
        "$numero"
    } else {
        throw IllegalArgumentException("$numero deve estar entre 1 e 100!")
    }
}

fun lerIdade(): Int? {
    val reader = FileReader(File("src/main/kotlin/ages.txt"))
    val buffer = BufferedReader(reader)

    try {
        val numero = buffer.readLine()
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        buffer.close()
    }
}