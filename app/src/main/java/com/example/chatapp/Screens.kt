package com.example.chatapp

sealed class Screens(val route:String){
    object LoginScreen:Screens("loginscreen")
    object SignupScreen:Screens("signupscreen")
    object ChatRoomsScreen:Screens("chatroomscreen")
    object ChatScreen:Screens("chatscreen")
}