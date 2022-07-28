## Conectapps API ##

### ENDPOINTS ###

 * Carga inicial  - POST http://localhost:8080/conectapps/customers
 * Obtener todos  - GET  http://localhost:8080/conectapps/customers
 * Obtener por id - GET  http://localhost:8080/conectapps/customers/1

### Antes de ejecutar la aplicación ###

* Se deben configurar el archivo properties ubicado en /conectapps/src/main/resources/application.properties.

```
spring.datasource.url : con el host y puerto de la base de datos  -> Ej : jdbc:mysql://localhost:3306
spring.datasource.username : con el usuario
spring.datasource.password : con la contraseña
```

* Se debe configurar el archivo de log4j ubicado en /conectapps/src/main/resources/log4j2.xml
	- Agregar la ruta donde deben generarse los logs

```
<Property name="log.dir">RUTA DEL LOG</Property>
```


### Para ejecutar la aplicación desde un IDE ###

* Desde cualquier IDE correrlo como una aplicación JAVA o SPRING BOOT APP

### Para ejecutar la aplicación desde un TOMCAT ###

* Compilar la aplicación con el comando de MAVEN : mvn clean package
  - Genera el WAR en /conectapps/target llamado conectapps-1.0.war que se puede desplegar
    desde un tomcat en un IDE o externo.




### Como consultar la documentacion de Swagger? ###

```
/provisioning/document.html
```