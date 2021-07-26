package com.curso.kotlin.youtube.lacos

// readLine -> le um valor passado no console
fun main() {
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while (temperatura != 999){
        println("Digite uma temperatura ou 999 para sair: ")
        temperatura = readLine()!!.toInt()

        if (temperatura != 999) {
            somatorio += temperatura
            quantidade++
        }
    }

    println("A media das temperaturas é = ${somatorio/quantidade}")
}