package com.curso.kotlin.youtube.blocosramificacoes

import com.curso.kotlin.youtube.smartcast.Expressao
import com.curso.kotlin.youtube.smartcast.Numero
import com.curso.kotlin.youtube.smartcast.Soma
import java.lang.IllegalArgumentException

fun avaliacao(expressao: Expressao): Int =
    when(expressao) {
        is Numero -> {
            println("Expressão com número: ${expressao.valor}")
            expressao.valor
        }
        is Soma -> {
            avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
        }
        else -> throw IllegalArgumentException("Expressão é desconhecida!")
    }

fun main() {
    val result = avaliacao(Soma(Soma(Numero(1), Numero(4)), Numero(5)))
    println(result)
}