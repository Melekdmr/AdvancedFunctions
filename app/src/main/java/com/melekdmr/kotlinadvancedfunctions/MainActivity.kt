package com.melekdmr.kotlinadvancedfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    private var  myInt : Int? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(myInt != null) {
            val num = myInt!! +1
        }
        //let
        myInt?.let {
            val num=it+1
        }
        val myNum=myInt?.let{
            it+1
        }?:0 //Elvis operatörü

         //also

         val kids=Person("James",12)
        val human=Person("Alice",30)
        val old=Person("David",65)

        val people= listOf<Person>(kids,human,old)
        people.filter { it.age>18 }.also {
            for (person in it){
                println(person.name)
            }
        }

        //apply
        val intentWithApply=Intent().apply { //intentin kendisini veriyor o yüzden this yazmayya gerek yok
            putExtra("","")
            putExtra("","")
            `package`=""
            action=" "
        }

        //with
        Person("barley",4).apply {
            name="Barley"
        }.also {
            println(it.name)
        }

        val newBarley=Person("bar",4).apply {
            name="Barley"
        }
        println(newBarley)


        // with tek başına bir şey döndürmez
        val anotherBarley= with(Person("arley",4)){
            name="Barley"
        }
     //   println(anotherBarley)  // bir şey döndürmez ya da unit



       val withBarly=Person("arley",4)
        with(withBarly){
            name="Barley"
            age=4
        }
        println("last barley: "+ withBarly.name)

    }
    }

  data class Person(
      var name:String,
      var age:Int)