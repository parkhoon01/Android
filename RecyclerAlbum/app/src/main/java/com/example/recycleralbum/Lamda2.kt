package com.example.recycleralbum

// data class
data class Circle1(var r: Int)

// comapnion class
class Song1{
    companion object{
        var title: String =""
        fun show() = println(title)
    }
}

fun main(){
    val c1: Circle = Circle(4)
    val c2 = Circle(4)
    println(c1.equals(c2))

    // object class
    var rect1 = object {
        var w: Int = 0
        var h: Int = 0
        fun size() = w*h
    }

    rect1.w = 5; rect1.h = 10; println(rect1.size())

    Song1.title = "Good day"; Song1.show()

    // Lamda function
    var sq_sum1: (Int, Int) -> Int = {x:Int, y:Int -> x*x + y*y}
    var sq_sum2 = {x:Int, y:Int -> x*x + y*y}
    println("sq_sum1: ${sq_sum1(5,5)}, sq_sum2: ${sq_sum2(5,5)}")
}