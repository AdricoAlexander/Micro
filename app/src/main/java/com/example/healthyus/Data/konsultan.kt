package com.example.healthyus.Data

data class konsultan (
    val id: Int,
    val name :String,
    val desc :String,
    val time :String,
    val spec :String,
    val docPicId :Int = 0,
    val rate : Double,
    val review : Int
)