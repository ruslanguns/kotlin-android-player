package com.ruso.myplayer

fun add(x: Int, y: Int ): Int = x + y


abstract class Person(name: String, val age: Int) {
    var name = name
        get() = "Name: $field"
        set(value) {
            field = value
        }
}

class Developer(name: String) : Person(name, 20)

fun test() {
    val d = Developer("Ruslan")
    val name = d.name // Name: Tom
}
