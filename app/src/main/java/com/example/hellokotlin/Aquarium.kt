package com.example.hellokotlin

class Aquarium {
    var width: Int = 20
    var height: Int = 60
    var length: Int = 100

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
    }
}