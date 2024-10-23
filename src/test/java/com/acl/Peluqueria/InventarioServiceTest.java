package com.acl.Peluqueria;

import com.acl.Peluqueria.domain.InventarioService;
import com.acl.Peluqueria.domain.Tarea;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Clase de prueba para InventarioService.
 * Aplica pruebas unitarias para garantizar que los métodos de InventarioService se comporten como se espera.
 */
@SpringBootTest
public class InventarioServiceTest {

    @Autowired
    private InventarioService inventarioService;

    /**
     * Prueba para agregar una tarea cuando la descripción es válida.
     * Verifica que la tarea sea agregada con éxito.
     */
    @Test
    void agregarTarea_CuandoDescripcionEsValida_DeberiaAgregarTarea() {
        String descripcion = "Limpiar estanterías";
        Tarea tarea = inventarioService.agregarTarea(descripcion);
        assertEquals(descripcion, tarea.getDescripcion());
    }

    /**
     * Prueba para agregar una tarea cuando la descripción es inválida.
     * Verifica que se lance una excepción adecuada.
     */
    @Test
    void agregarTarea_CuandoDescripcionEsInvalida_DeberiaLanzarExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            inventarioService.agregarTarea("");
        });
        assertEquals("La descripción no puede estar vacía", exception.getMessage());
    }
}
