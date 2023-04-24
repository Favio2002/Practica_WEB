package com.formulario;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/*
 La clase ServletInitializer que extiende SpringBootServletInitializer es utilizada en aplicaciones web 
 construidas con Spring Boot que están diseñadas para ser empaquetadas como un archivo WAR (Web Archive).
  Esta clase es necesaria cuando se implementa la aplicación en un servidor de aplicaciones externo en lugar de usar 
  el servidor incorporado de Spring Boot.
 */
public class ServletInitializer  extends SpringBootServletInitializer{

	//se esta empaquetanto la aplicacion como un archivo war
	/*
	 un archivo WAR es un formato de archivo utilizado para empaquetar una aplicación web Java en un solo archivo comprimido 
	 que contiene todos los archivos necesarios para implementar la aplicación web en un servidor de aplicaciones web compatible 
	 con Java EE.
	 */
	//En el método configure(), se especifica la clase principal de la aplicación
	//(DemoApplication.class) para inicializarla como una aplicación Spring Boot.
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		
		return application.sources(FormularioApplication.class);
	}
}
