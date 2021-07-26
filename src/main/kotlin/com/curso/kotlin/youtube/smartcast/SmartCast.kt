package com.curso.kotlin.youtube.smartcast

/**
 * "is" -> Vem de instanceof para identificar o tipo da sua variável
 * "as" -> Serve para voce realizar o cast de uma variável
 */

interface Expressao
class Numero(val valor: Int): Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int {
    if (expressao is Numero){
        return expressao.valor
    }

    if (expressao is Soma) { // O metodo "is" automaticamente já faz um cast da variável
        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
    }

    throw IllegalArgumentException("Expressão é desconhecida")
}

fun main() {
    // ((4-1) + 2) + 4 = 7
    val result = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(result)
}