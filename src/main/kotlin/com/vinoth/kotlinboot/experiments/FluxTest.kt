/*
package com.vinoth.kotlinboot.experiments


import reactor.core.publisher.Flux
import reactor.core.publisher.toFlux

fun main(args: Array<String>) {


    val fluxInt = (1..8).toFlux()

    fluxInt
            .filter { it < 5 }
            .subscribe { println(it) }

    println("-- map--")


    fluxInt
            .map { it * it }
            .subscribe { println(it) }

    println("---- Flat Map ---")

    val nameFlux = arrayListOf<Flux<String>>(
            arrayListOf("Mark", "Steve").toFlux(),
            arrayListOf("Dev").toFlux(),
            arrayListOf("Lead").toFlux()).toFlux()

    nameFlux.
            flatMap { it }
            .subscribe { println(it.toUpperCase()) }

}*/
