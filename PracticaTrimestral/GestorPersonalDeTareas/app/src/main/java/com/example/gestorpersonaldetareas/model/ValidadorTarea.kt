package com.example.gestorpersonaldetareas.model

enum class ErrorTitulo{
    VACIO,
    MUY_CORTO,
}
object ValidadorTarea {
    fun validarTitulo(titulo: String): ErrorTitulo?{    // ? = nullable = puede ser nulo
        val tituloLimpio = titulo.trim()

        return when{
            /**
             * En un when, la flecha -> separa la condición de la rama que se ejecuta
             */
            tituloLimpio.isEmpty() -> ErrorTitulo.VACIO
            tituloLimpio.length < 3 -> ErrorTitulo.MUY_CORTO
            else -> null
        }
    }
}