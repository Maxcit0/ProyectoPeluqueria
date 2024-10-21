package com.acl.Peluqueria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.acl.Peluqueria.domain.Tarea;

/**
 * Clase de prueba unitaria para la entidad Tarea.
 * Garantiza que la lógica de Tarea sea correcta.
 */
public class TareaTest {

    @Test
    void crearTarea_CuandoDescripcionEsValida_DeberiaCrearTarea() {
        Tarea tarea = new Tarea("Lavar el piso");
        assertNotNull(tarea);
        assertEquals("Lavar el piso", tarea.getDescripcion());
        assertFalse(tarea.isCompletada());
    }

    @Test
    void crearTarea_CuandoDescripcionEsInvalida_DeberiaLanzarExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Tarea(""));
        assertEquals("La descripción no puede estar vacía", exception.getMessage());
    }

    @Test
    void marcarTareaComoCompletada_DeberiaCambiarEstado() {
        Tarea tarea = new Tarea("Lavar el piso");
        tarea.marcarComoCompletada();
        assertTrue(tarea.isCompletada());
    }
}
