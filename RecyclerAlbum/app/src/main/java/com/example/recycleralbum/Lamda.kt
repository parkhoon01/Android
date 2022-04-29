package com.example.recycleralbum

// data 클래스
data class Circle(var r:Int)

// 컴패니언 클래스
class Song{
    companion object{
        var title: String = ""
        fun show() = println(title)
    }
}

// Function definition
fun squareSum(x: Int, y: Int) : Int{
    return x*x + y*y
}

// 고차 함수
fun process(processor: (Int, Int) -> Int, a:Int, b:Int) = processor(a,b)

fun main(){

    // Lamda Funtion
    // 1.
    // var sq_sum: (Int, Int) -> Int = {x:Int, y:Int -> x*x + y*y}
    var sq_sum = {x:Int, y:Int -> x*x + y*y}
    println(sq_sum(3,3))

    // 2.
    var x = 7
    val sq: () -> Unit = { println(x*x) }
    sq()

    // 3. 하나일때 사용 가능
    val sq2: (Int) -> Int = { it * it }
    println(sq2(7))

    // 고차 함수
    var x2 = process({x,y -> x*x + y*y}, 4, 4)
    println("x2= ${x2}")
    x2 = process({x,y -> x*x*x + y*y*y}, 4, 4)
    println("x2= ${x2}")


    val c1: Circle = Circle(7)
    val c2 = Circle(7)
    println(c1.equals(c2))
    println(c1)

    // object 클래스
    val rect = object {
        var w: Int = 0
        var h: Int = 0
        fun size() = w*h
    }
    rect.w = 5; rect.h = 8; println(rect.size())

    Song.title = "Happy Song"; Song.show()

    // Null safety
    var name: String? = null    // null 허용 변수
    name = "Happy Music"
    var length = if(name == null) 0 else name.length
    var length2 = name?.length ?: -1
    val length3 = name!!.length


}