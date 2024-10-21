package com.acl.Peluqueria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Clase principal para la aplicación de inventario de peluquería.
 * Configura y ejecuta la aplicación Spring Boot.
 */
@SpringBootApplication
public class InventarioPeluqueriaApplication extends SpringBootServletInitializer {

	/**
	 * Método principal para ejecutar la aplicación.
	 * @param args Argumentos de línea de comandos.
	 */
	public static void main(String[] args) {
		SpringApplication.run(InventarioPeluqueriaApplication.class, args);
	}

	/**
	 * Configura el builder de la aplicación para permitir el despliegue en un servidor externo.
	 * @param builder Objeto SpringApplicationBuilder.
	 * @return Configuración del builder.
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(InventarioPeluqueriaApplication.class);
	}
}