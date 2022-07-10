package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 *@author guoxuqiang
 *@date 2022 07 2022/7/10 11:54
 */
data class PlaceResponse(val status:String,val places:List<Place>)

data class Place(val name:String,val location:Location, @SerializedName("formatted_address") val address:String)

data class Location(val lng:String,val lat:String)
