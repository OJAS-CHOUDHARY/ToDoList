package com.ojasx.todoapp

import androidx.compose.runtime.mutableStateOf
import java.time.Instant
import java.util.Date

object TodoManager {
    private val todolist = mutableListOf<ToDo>()
    fun getAllTodo() : List<ToDo>{
        return todolist
    }
    fun addTodo(title : String){
        todolist.add(ToDo(System.currentTimeMillis().toInt(), title ,
            Date.from(Instant.now())))
    }
    fun deleteTodo(id : Int){
        todolist.removeIf {
            it.id == id
        }
    }
}