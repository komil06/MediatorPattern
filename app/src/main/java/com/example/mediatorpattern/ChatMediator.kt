package com.example.mediatorpattern

interface ChatMediator {
    fun sendMessage(msg: String?, user: User?)

    fun addUser(user: User?)
}