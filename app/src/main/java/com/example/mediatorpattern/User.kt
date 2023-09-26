package com.example.mediatorpattern

abstract class User(protected var mediator: ChatMediator, protected var name: String) {
    abstract fun send(msg: String?)
    abstract fun receive(msg: String?)
}