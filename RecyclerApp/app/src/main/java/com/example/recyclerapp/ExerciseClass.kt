package com.example.recyclerapp

class User(name: String) {
    constructor(name: String, age:Int) : this(name){
        println("name: ${name}, age: ${age} call... ")
    }
}
fun main(){
    val user = User("Park")
    val user2 = User("Park", 26)
}