package com.curso.kotlin.youtube.acessores

class Retangulo(val altura: Int, val largura: Int){

    // O "get" é um assessor customizado
    val isQuadrado
        get() = altura == largura

    /**
     val isQuadrado: Boolean
        get(){
            return altura == largura
        }
     */
}

fun main() {
    val retangulo: Retangulo = Retangulo(11,10)
    println(retangulo.isQuadrado)
}