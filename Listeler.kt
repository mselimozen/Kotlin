package com.example.kotlinlearning

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 25
        var y = 75
        var z = y / x
        println(z)
        //var ile yazılanlar değişkendir. val ile yzılanlar ise sabittir.
        val zax = 52
        //bu şekilde tanımlarsam birdaha değiştirilemez.
        //Değişkende tanımlıyabiliriz.
        val myint : Int
        myint = 43
        var double = 15.5
        val float = 15.555f
        //double ile float arasıdna boyut gibi farklar olsada float tanımlarken sonuna f koyuyoruz.
        println(double + float)

        //String
        val myString = "Selim ozen"
        //stringler bir sınıftır. Biz o sınıftan az önce bir obje tanımladık.
        val myName = "Selim"
        val sirName = "Ozen"
        val fullName = myName + sirName
        println(fullName )

        println("------arrays------")

        val myArray = arrayOf("Selim", "Mustafa", "Ozen")
        println(myArray[0])
        //Bu şekilde indexini alabiliyoruz.
        myArray.set(1, "OwlAndroid")
        println(myArray[1])
        //Arraylerde birşey ilk oluşumundan sonra size'ı belirlenmiş olur ve birdaha değiştirilemez.

        //Listeler ise yine bir array(dizi) olarak geçsede, daha esnek kullanıma sahiplerdir.
        val myList = arrayListOf<String>()
        myList.add("IronMan1")
        println(myList[0])
        //karışık listeler oluşturulabilinir.
        val mixedArray = ArrayList<Any>()
        mixedArray.add("Mark13")
        mixedArray.add(13)
        mixedArray.add(true)
        println(mixedArray[0])
        println(mixedArray[1])
        println(mixedArray[2])
        //Hata: True'nun T'si küçük olacak.

    }
}
