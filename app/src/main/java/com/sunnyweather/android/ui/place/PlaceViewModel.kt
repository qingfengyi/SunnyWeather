package com.sunnyweather.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.model.Place
import retrofit2.http.Query

/**
 *@author guoxuqiang
 *@date 2022 07 2022/7/10 12:42
 */
class PlaceViewModel:ViewModel() {
    private val searchLiveData=MutableLiveData<String>()
    val placeList=ArrayList<Place>()
    val placeLiveData=Transformations.switchMap(searchLiveData){
        query->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String){
        searchLiveData.value=query
    }
}