package com.acl.Peluqueria.domain;

/**
 * Clase que representa una Tarea dentro del sistema de inventario.
 * Esta clase sigue el principio de responsabilidad única, ya que solo modela una tarea y sus atributos.
 */
public class Tarea {

    private static Long contadorId = 0L; // Contador estático para generar IDs únicos

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
        this.id = generarIdUnico();
        this.descripcion = descripcion;
        this.completada = false;
    }

    /**
     * Genera un ID único para cada instancia de Tarea.
     *
     * @return ID único
     */
    private static synchronized Long generarIdUnico() {
        return ++contadorId;
    }

    // Métodos Getter y Setter para 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Métodos Getter y Setter para 'descripcion'
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Métodos Getter y Setter para 'completada'
    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    /**
     * Marca la tarea como completada.
     */
    public void marcarComoCompletada() {
        this.completada = true;
    }
}
