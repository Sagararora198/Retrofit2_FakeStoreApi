package com.example.retrofit.model

data class FakeStore(val id:Int,
                     val title:String,
                     val price:Double,
                     val description:String,
                     val category:String,
                     val image:String,
                     val rating:RatingItems)

data class RatingItems(val rate:Double,
                       val count:Int )