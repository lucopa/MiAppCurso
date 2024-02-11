package com.example.miappcurso.SharedPreferences

import android.content.Context

class Prefs(val context: Context) {

    val SHARED_NAME ="Mydtb"
    val SHARED_USERNAME = "username"
    val SHARED_TERMS= "terms"

    val storage = context.getSharedPreferences(SHARED_NAME, 0)

    fun saveName(name:String){
        storage.edit().putString(SHARED_USERNAME, name).apply()
    }

    fun saveTERMS(terms:Boolean){
        storage.edit().putBoolean(SHARED_TERMS, terms).apply()
    }

    fun getName():String{
       return storage.getString(SHARED_USERNAME, "")!!
    }

    fun getTERMS():Boolean{
        return storage.getBoolean(SHARED_TERMS,false)
    }

    fun restaurar(){
        storage.edit().clear().apply()
    }

}