package com.acl.Peluqueria.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Clase que representa una Tarea dentro del sistema de inventario.
 * Esta clase sigue el principio de responsabilidad única, ya que solo modela una tarea y sus atributos.
 */
@Data
@NoArgsConstructor
public class Tarea {

    private Long id; // Identificador único de la tarea
    private String descripcion; // Descripción de la tarea
    private boolean completada; // Estado de la tarea (si está completada o no)

    /**
     * Constructor para crear una tarea con una descripción específica.
     *
     * @param descripcion Descripción de la tarea
     */
    public Tarea(String descripcion) {
        if (descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }
        this.descripcion = descripcion;
        this.completada = false;
    }

    /**
     * Marca la tarea como completada.
     */
    public void marcarComoCompletada() {
        this.completada = true;
    }
}
