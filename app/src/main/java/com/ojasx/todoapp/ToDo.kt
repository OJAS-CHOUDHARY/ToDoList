package com.ojasx.todoapp

import android.provider.ContactsContract
import java.time.Instant
import java.util.Date

data class ToDo(
    var id : Int,
    var title : String,
    var createdAt : Date
)

fun getFakeTodo() : List<ToDo> {
    return listOf(
        ToDo(1,"First Todo" , Date.from(Instant.now())),
        ToDo(1,"Second Todo" , Date.from(Instant.now())),
        ToDo(1,"Third Todo" , Date.from(Instant.now())),
        ToDo(1,"Fourth Todo" , Date.from(Instant.now()))
    )
}