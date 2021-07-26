package com.curso.kotlin.youtube.whenmethod

import com.curso.kotlin.youtube.enums.Cor

// Trabalha como se fosse um "switch case"
fun obterMnemonica(cor: Cor) =
    when(cor) {
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Além é"
        Cor.LARANJA -> "Legal"
    }

fun obterTemperatura(cor: Cor): String{
    return when(cor){
        Cor.VERMELHO, Cor.LARANJA, Cor.AMARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio"
    }
}


fun main() {
    val mnemonica = obterMnemonica(Cor.VERMELHO)
    println(mnemonica)

    val temperatura = obterTemperatura(Cor.AZUL)
    println(temperatura)
}