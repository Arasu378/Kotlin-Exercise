package com.arasu.excercise

fun main() {
    println("Pow!")
    var x = 3
    val name = "Landu"
    x *= 10
    println(" x is $x.")

    while (x > 20) {
        x-=1
        println("x is now $x.")
    }

    for (i in 1..10) {
        x+=1
        println(" x is again now $x.")
    }

    if (x == 20) {
        println(" x must be 20.")
    } else {
        println("x is not 20.")
    }
    if (name.equals("Landu")) {
        println("$name Strike")
    }

    var t =1
    println("Before the loop. t = $t.")
    while (t < 4) {
        println("In the loop. t = $t")
        t+=1
    }
    println("After the loop. t = $t.")

    val a = 3
    val b = 1
    println(if (a > b) "a is greater than b" else "a is not greater than b")
    println("This line runs no matter what")
    testScenarios()

}

fun testScenarios() {
    var x = 1
    while (x < 10) {
        if (x > 3) {
            println("big x")
        } else {
            println("not big x")
        }
    }
}