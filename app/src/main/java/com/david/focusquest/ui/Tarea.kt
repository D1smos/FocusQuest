package com.david.focusquest.ui

data class Tarea(
    val nombre: String,
    val experiencia: Int,
    val completada: Boolean = false
)

val listaTareas = listOf(
    Tarea("Estudiar Kotlin", 30),
    Tarea("Entrenar", 20),
    Tarea("Leer 30 minutos", 15)
)