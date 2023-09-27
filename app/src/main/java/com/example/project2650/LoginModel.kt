package com.example.project2650

class LoginModel {
    //variabel
    var username = ""
    var password = ""
    //method/fc
    fun loginCheck():Boolean{
        if(username.equals("pamela") && password.equals("amikom")) {
            return true
        }else{
            return false
        }
    }

}