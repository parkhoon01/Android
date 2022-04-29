package com.example.firstapp
// global scope  초기화를 한다!!
val x = 8  // => val x:Int = 8
var y = 5.5 // => var y:Double = 5.5
//lateinit var name:String // 초기화는 나중에 할것이다 (String만 가능?)

fun test(a:Int, b:Int){
    //val a = 5
    //var b:Int   //  초기화 안해도 가능(지역변수에서는 타입이 있어야 가능)


    //b = a * 5
    println("${a} * ${b} = ${a * b}")
    println((a..b).random())
}

fun main(){
    // 변수 선언
    var x = 20
    var y:Int

    y = x * 5
    // 출력
    println("Welcome to Kotlin : ${y}")
    test(5, 6)
    // Dice Object
    val myDice:Dice = Dice(6)
    println(myDice.roll())
}

class Dice(val sides:Int){
    //val sides = 6
    fun roll():Int{
        return (1..sides).random()
    }
}