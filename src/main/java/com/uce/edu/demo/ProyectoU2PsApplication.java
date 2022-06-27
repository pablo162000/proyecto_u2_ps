package com.uce.edu.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.log4j.Logger;

@SpringBootApplication
public class ProyectoU2PsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU2PsApplication.class, args);
	}

	private static Logger logJava = Logger.getLogger(ProyectoU2PsApplication.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola Mundo");
		logJava.trace("LOG TRACE");
		logJava.debug("LOG DEBUG");
		logJava.info("LOG INFO");
		logJava.warn("LOG WARN");
		logJava.error("LOG ERROR");
		logJava.fatal("LOG FATAL");

//		#DEBUG. Usado para escribir mensajes de depuración
//		#INFO. Mensajes de estilo verbose. Puramente informativos de determinada acción
//		#WARN. Para alertar de eventos de los que se quiere dejar constancia pero que no afectan al funcionamiento de la aplicación
//		#ERROR. Usado para los mensajes de eventos que afectan al programa pero lo dejan seguir funcionando. Algún parámetro no
//		#es correcto pero se carga el parámetro por defecto, por ejemplo
//		#FATAL. Usado para errores críticos. Normalmente después de guardar el mensaje el programa terminará

	}

}
