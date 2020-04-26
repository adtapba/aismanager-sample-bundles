# AIS Manager - Bundles

### Introducción

Ejemplo de bundles que permiten integrar la aplicación [aismanager-sample-app](https://github.com/adtapba/aismanager-sample-app) en la arquitectura [SOA](https://en.wikipedia.org/wiki/Service-oriented_architecture) de la  [APBA](https://www.apba.es/).

Junto con el proyecto [aismanager-sample-app](https://github.com/adtapba/aismanager-sample-app), este sistema sólo tiene el objetivo de servir como un ejemplo básico de integración para un caso de uso cercano a la realidad en el entorno de negocio marítimo-portuario, mostrando las directrices de integración marcadas por la [APBA](https://www.apba.es/). No tiene las características exigibles a un sistema comercial de gestión de datos [AIS](https://en.wikipedia.org/wiki/Automatic_identification_system).

### Funcionalidad

* Publicación de servicios proxy de los que ofrece [aismanager-sample-app](https://github.com/adtapba/aismanager-sample-app)  para configurar líneas de control de paso de embarcaciones y consultar la última posición registrada para un buque.
* Consumo de eventos provenientes de estaciones AIS.
* Recepción de eventos publicados por [aismanager-sample-app](https://github.com/adtapba/aismanager-sample-app).

### Construcción
Ejecutar el siguiente comando [Maven](http://maven.apache.org/) en la raíz de la carpeta:
```
mvn clean install -Dgpg.skip=true
```
### Despliegue y pruebas de los bundles

1. Crear una [instalación de ServiceMix con las adaptaciones realizadas por la APBA](https://github.com/adtapba/servicemix-development-installation).
2. Configurar la autenticación y autorización JAAS para aismanager, ejecutando los siguientes comandos en la consola Karaf:
```
jaas:realm-manage --realm apba
jaas:user-add aismanager_userwithanypermissions test1234
jaas:user-add aismanager_adminuser test1234
jaas:group-add aismanager_adminuser GROUP_AISMANAGER_ADMIN_USERS
jaas:user-add aismanager_regularuser test1234
jaas:group-add aismanager_regularuser GROUP_AISMANAGER_REGULAR_USERS
jaas:group-role-add GROUP_AISMANAGER_ADMIN_USERS ROLE_AISMANAGER_PUBLISHERS
jaas:group-role-add GROUP_AISMANAGER_ADMIN_USERS ROLE_AISMANAGER_PROXY_SERVICES_ADMIN_USERS
jaas:group-role-add GROUP_AISMANAGER_REGULAR_USERS ROLE_AISMANAGER_PROXY_SERVICES_REGULAR_USERS
jaas:update
```
3. Copiar los [ficheros de configuración de aismanager](https://github.com/adtapba/aismanager-sample-bundles/tree/master/distribution/src/main/resources/conf) en la carpeta etc de la instalación de ServiceMix.
4. Desplegar la feature de aismanager, que contiene todos los bundles y sus dependencias:
```
feature:repo-add mvn:es.apba.infra.esb.aismanager/distribution/1.0.0-SNAPSHOT/xml/features
feature:install aismanager
```
5. Construir y ejecutar [aismanager-sample-app](https://github.com/adtapba/aismanager-sample-app).
7. Para probar los bundles, se dispone de unas [suites de tests de los recursos REST que se publican en ServiceMix](https://github.com/adtapba/aismanager-sample-bundles/tree/master/distribution/src/test/resources/postman) que se pueden importar en [Postman](https://www.postman.com/).
8. También hay varios [mensajes de ejemplo](https://github.com/adtapba/aismanager-sample-bundles/tree/master/distribution/src/test/resources/sample-messages/trackevent) que se pueden enviar al tópico apba.topic.aisstation.trackevent mediante la herramienta [Hawtio](https://hawt.io) desplegada en ServiceMix.
