package com.acl.Peluqueria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class InventarioServiceTest {

    @Autowired
    private InventarioService inventarioService;

    @Test
    void agregarProducto_CuandoNombreEsValido_DeberiaAgregarProducto() {
        String nombre = "Shampoo";
        int cantidad = 10;
        String resultado = inventarioService.agregarProducto(nombre, cantidad);
        assertEquals("Producto Shampoo agregado con éxito", resultado);
    }

    @Test
    void agregarProducto_CuandoNombreEsInvalido_DeberiaLanzarExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            inventarioService.agregarProducto("", 10);
        });
        assertEquals("El nombre del producto no puede estar vacío", exception.getMessage());
    }
}
package com.acl.Peluqueria;

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
     * Prueba para agregar un producto cuando el nombre es válido.
     * Verifica que el producto sea agregado con éxito.
     */
    @Test
    void agregarProducto_CuandoNombreEsValido_DeberiaAgregarProducto() {
        String nombre = "Shampoo";
        int cantidad = 10;
        String resultado = inventarioService.agregarProducto(nombre, cantidad);
        assertEquals("Producto Shampoo agregado con éxito", resultado);
    }

    /**
     * Prueba para agregar un producto cuando el nombre es inválido.
     * Verifica que se lance una excepción adecuada.
     */
    @Test
    void agregarProducto_CuandoNombreEsInvalido_DeberiaLanzarExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            inventarioService.agregarProducto("", 10);
        });
        assertEquals("El nombre del producto no puede estar vacío", exception.getMessage());
    }
}