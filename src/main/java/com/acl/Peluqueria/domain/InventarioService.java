package com.acl.Peluqueria.domain;

import org.springframework.stereotype.Service;  // Importación de la anotación @Service
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio que gestiona las operaciones relacionadas con las tareas.
 * Aplica el principio SRP, ya que su única responsabilidad es gestionar tareas.
 */
@Service
public class InventarioService {

    private static Long contadorId = 0L; // Contador estático para generar IDs únicos

    private List<Tarea> tareas = new ArrayList<>();

    /**
     * Agrega una nueva tarea al inventario.
     *
     * @param descripcion Descripción de la tarea
     * @return La tarea creada
     */
    public Tarea agregarTarea(String descripcion) {
        Tarea nuevaTarea = new Tarea(descripcion);
        nuevaTarea.setId(generarIdUnico());
        tareas.add(nuevaTarea);
        return nuevaTarea;
    }

    /**
     * Genera un ID único para cada tarea.
     *
     * @return ID único
     */
    private synchronized Long generarIdUnico() {
        return ++contadorId;
    }

    /**
     * Asigna una tarea específica a un empleado.
     *
     * @param id Identificador de la tarea
     * @return La tarea asignada
     */
    public Tarea asignarTarea(Long id) {
        Tarea tarea = buscarTareaPorId(id);
        if (tarea != null) {
            // Lógica para asignar la tarea
            return tarea;
        }
        throw new IllegalArgumentException("La tarea con id " + id + " no existe");
    }

    /**
     * Marca una tarea como completada.
     *
     * @param id Identificador de la tarea
     */
    public void marcarTareaComoCompletada(Long id) {
        Tarea tarea = buscarTareaPorId(id);
        if (tarea != null) {
            tarea.marcarComoCompletada();
        } else {
            throw new IllegalArgumentException("La tarea con id " + id + " no existe");
        }
    }

    /**
     * Busca una tarea por su identificador.
     *
     * @param id Identificador de la tarea
     * @return La tarea encontrada o null si no existe
     */
    private Tarea buscarTareaPorId(Long id) {
        return tareas.stream()
                .filter(tarea -> tarea.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
