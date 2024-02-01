package com.example.chatapp.Data

data class Message(
    val senderFirstName: String = "",
    val senderId:String = "",
    val text: String = "",
    val timestamp: Long = System.currentTimeMillis(),
    val isSentByCurrentUser: Boolean = false

)
