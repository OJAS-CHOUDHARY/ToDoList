package com.ojasx.todoapp

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.MutableLiveData


class ToDoViewModel : ViewModel() {
    private val _todolist = MutableLiveData<List<ToDo>>()
    val todolist: LiveData<List<ToDo>> = _todolist


    fun getAllTodo(){
        _todolist.value = TodoManager.getAllTodo().reversed()
    }
    fun addTodo(title : String){
        TodoManager.addTodo(title)
        getAllTodo()
    }
    fun deleteTodo(id : Int){
        TodoManager.deleteTodo(id)
        getAllTodo()
    }
}