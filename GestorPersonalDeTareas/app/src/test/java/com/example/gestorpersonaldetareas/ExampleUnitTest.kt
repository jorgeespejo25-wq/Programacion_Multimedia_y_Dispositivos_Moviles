package com.example.gestorpersonaldetareas

import com.example.gestorpersonaldetareas.model.ErrorTitulo
import com.example.gestorpersonaldetareas.model.ValidadorTarea
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun testValidarTitulo(){
        assertEquals(ErrorTitulo.VACIO, ValidadorTarea.validarTitulo(""))
        assertEquals(ErrorTitulo.VACIO, ValidadorTarea.validarTitulo("   "))
        assertEquals(ErrorTitulo.MUY_CORTO, ValidadorTarea.validarTitulo("ab"))
        assertEquals(ErrorTitulo.MUY_CORTO, ValidadorTarea.validarTitulo("  ab"))
        assertEquals(null, ValidadorTarea.validarTitulo("abc"))
        assertEquals(null, ValidadorTarea.validarTitulo(" a b "))
        assertEquals(null, ValidadorTarea.validarTitulo("\n abc \t"))
    }
}