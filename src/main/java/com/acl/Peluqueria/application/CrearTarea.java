package com.acl.Peluqueria.application;

import com.acl.Peluqueria.domain.InventarioService;
import com.acl.Peluqueria.domain.Tarea;

/**
 * Caso de uso para la creación de tareas.
 * Implementa el principio de inversión de dependencias al depender de la abstracción (servicio del dominio).
 */
public class CrearTarea {

    private final InventarioService inventarioService;

    /**
     * Constructor que recibe el servicio del inventario como dependencia.
     *
     * @param inventarioService Servicio del inventario
     */
    public CrearTarea(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    /**
     * Método para crear una nueva tarea.
     *
     * @param descripcion Descripción de la nueva tarea
     * @return La tarea creada
     */
    public Tarea ejecutar(String descripcion) {
        return inventarioService.agregarTarea(descripcion);
    }
}
