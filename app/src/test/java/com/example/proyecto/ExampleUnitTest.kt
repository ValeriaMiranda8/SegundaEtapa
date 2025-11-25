package com.example.proyecto

import org.junit.Assert.*
import org.junit.Test

class ExampleUnitTest {

    // 1️PRUEBA UNITARIA 1: Verifica que el modelo Animal almacena los datos correctamente
    @Test
    fun animalModel_isCreatedCorrectly() {
        val animal = Animal(
            name = "Firulais",
            description = "Un perro amistoso en busca de hogar",
            image = "perro1"
        )

        assertEquals("Firulais", animal.name)
        assertEquals("Un perro amistoso en busca de hogar", animal.description)
        assertEquals("perro1", animal.image)
    }

    // 2PRUEBA UNITARIA 2: Verifica que la función de comparación funciona correctamente
    @Test
    fun animals_areDifferent() {
        val animal1 = Animal("Luna", "Gato juguetón", "gato1")
        val animal2 = Animal("Max", "Perro cariñoso", "perro2")

        // Asegura que no son el mismo objeto ni tienen el mismo nombre
        assertNotEquals(animal1.name, animal2.name)
        assertNotEquals(animal1.image, animal2.image)
    }
}
 

