package com.example.gestorpersonaldetareas.model

data class Tarea (
    val id: Int = 0,
    val titulo: String,
    val descripcion: String,
    val prioridad: Prioridad,
    val completada: Boolean = false
)