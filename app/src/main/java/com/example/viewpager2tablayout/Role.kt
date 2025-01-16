package com.example.viewpager2tablayout


import java.io.Serializable

class Role (val name: String, val image:Int,val  url:String): Serializable {
    companion object {
        val roles = mutableListOf(
            Role("Новости", R.drawable.novost,"https://ria.ru/"),
            Role("Музыка", R.drawable.music,"https://www.zaycev.fm/"),
            Role("Кино", R.drawable.cinema,"https://www.ivi.ru/"),
            Role("Погода", R.drawable.pogoda, "https://www.gismeteo.ru/") ,
            Role("Часы", R.drawable.ti, "https://www.haroldltd.ru/")
        )

    }
}