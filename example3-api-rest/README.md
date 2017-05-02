# Tercer ejemplo API REST simple

La finalidad será crear:

- Construcción real de API RESTful (RestApiVerticle)
- Anotaciones de Vertx para Verticles
- Comunicación Handler + Verticle, Verticle + Verticle 
- Bloqueo de código y alternativas
- Verticle síncrono, Workers y Pool del mismo
- Ejemplo de Async coordination
- Monitorización y rendimiento

# En eclipse Ejecutar el Verticle que se quiera del siguiente modo:

 - Seleccionar la clase Starter
 - Añadir el comando run PAQUETERIA_Y_NOMBRE_DE_VERTICLE -conf ruta_al_fichero_de_configuracion
 - Añadir la variable de entorno de java  -Dvertx.logger-delegate-factory-class-name=io.vertx.core.logging.SLF4JLogDelegateFactory
 - Añadir la variable de entorno de java para el debug de -Dvertx.options.blockedThreadCheckInterval=1000000 

# Build and run 

Ejecutar build_and_run.sh