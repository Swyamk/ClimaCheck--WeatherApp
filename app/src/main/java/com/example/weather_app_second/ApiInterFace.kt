package com.example.weatherapp

import com.example.weather_app_second.WeatherApp
import retrofit2.Call

import retrofit2.http.GET

import retrofit2.http.Query

interface ApiInterface {


    @GET("weather")

    fun getWeatherData(

        @Query("q") city: String, @Query("appid") appid: String, @Query("units") units: String

    ): Call<WeatherApp>
}