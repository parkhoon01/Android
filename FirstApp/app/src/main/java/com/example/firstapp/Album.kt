package com.example.firstapp

open class Album(var id:Int, var title:String){ // open => 상속 가능한 클래스 default는 final
    var price = 0
    init{   // 생성자 함수 내용인데 추가로 실행됨
        price = 12000
    }
    open fun changePrice(discount:Int){  // 메소드
        price -= discount
    }
}
// =>
//class Album {
//    var id:Int = 0;
//    var title:String = ""
//    constructor(id:Int, title:String){
//        this.id = id;
//        this.title = title;
//    }
//}
class SubAlbum : Album{ // : => 상속
    var playtime:Int = 100
    constructor(id:Int, title:String) : super(id, title){   // 보조 생성자
        playtime = 2400
    }
    override fun changePrice(discount:Int){ // 오버라이딩이 아니라 따로 하나 생성된것으로 처리됨 오버라이딩하려면 앞에 override를 써준다
        price += discount
    }
}

fun main(){
    val album = SubAlbum(1, "Song1")
    println(album.title)
    album.title = "Song2"
    println(album.title)

    // list
    val intlist: List<Int> = listOf(1,2,3,4,5)  // Read-only List!! 추가 변경 불가
    val albums = mutableListOf<String>()        // 변경 가능한 List
    println("IntList: ${intlist[0]}")
    for(number in intlist) println(number)

    albums.add("Song4")
    albums.add("Song5")
    println("albums: ${albums}")
}