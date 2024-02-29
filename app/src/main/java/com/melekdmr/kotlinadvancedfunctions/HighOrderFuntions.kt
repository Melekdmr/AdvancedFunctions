package com.melekdmr.kotlinadvancedfunctions

fun main(){

    /*val myNumList= listOf<Int>(1,3,5,7,9,11,13,15)
       val smallNumberList=myNumList.filter { num-> num<6 }
       for (num in smallNumberList){
           println(num)
       }*/


    val myNumList= listOf<Int>(1,3,5,7,9,11,13,15)
    val smallNumberList=myNumList.filter {it -> it < 6   // ilk it'i silebiliriz
    }
    for (num in smallNumberList){
        println(num)
    }

      //map

      val squaredNumber= myNumList.map { num-> num*num }
    for (num in squaredNumber){
        println(num)
    }

    println(" ")
    println(" ")
    println(" ")

    val dizi=myNumList.filter { sayi-> sayi<6 }.map { sayi-> sayi*sayi }
    for(sayi in dizi){
        println(sayi)
    }
    println(" ")
    println(" ")
    println(" ")

     val musicians= listOf<Musician>(
         Musician("James",60,"Guitar"),
         Musician("Lars",55,"Drum"),
         Musician("Kirk",50,"Guitar")
     )

    val filteredMusicians=musicians.filter {it.age<60 }.map { it.instrument }
    for (element in filteredMusicians){
        println(element)
    }

 }

    data class Musician(val name:String,val age:Int,val instrument:String)




