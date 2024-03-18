## Clean Architecture with pure java
Esta aplicación fue creada con el proposito de aprender a aplicar la arquitectura hexagonal con Java

## USO
Ejecutar el compilador de java.

## ¿En qué esta compuesta?
En la arquitectura hexagonal tendremos nuestra aplicacion dividida por capas. Principalmente nos encontraremos con 4 capas.
1. Dominio
2. Aplicación
3. Infrastructura
4. Framework

## Explicación
Dominio: Sólo dominio se conoce a si mismo, no desconoce cualquier capa de mayor nivel. 
Aplicación: Es quien posee nuestros casos de uso, los cuales interacturan con el dominio.
Infrastructura: La infrastructura accede a la aplicacion y a los puertos, utilizando los casos de uso.
Framework: Tecnologia en la que funciona nuestra aplicacion. Llamada y instancias de nuestras clases.
