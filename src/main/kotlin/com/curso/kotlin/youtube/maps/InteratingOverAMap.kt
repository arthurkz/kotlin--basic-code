package com.curso.kotlin.youtube.maps

import java.util.*

fun main() {
    val binaryRepresetation = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryRepresetation[c] = binary
    }

    for ((letter, binary) in binaryRepresetation){
        println("$letter - $binary")
    }
}