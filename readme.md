
## Learn JPA and Hibernate

Proyecto de demostración desarrollado con **Spring Boot** para aprender y practicar **JPA** y **Hibernate**, utilizando **Spring Data JPA** y **Spring Data JDBC** para el acceso a datos en bases de datos relacionales.

La aplicación utiliza **H2** como base de datos en memoria, lo que permite ejecutar el proyecto sin configuraciones adicionales.

---

## 📌 Características

- Proyecto basado en **Spring Boot 3**
- Persistencia de datos con **Spring Data JPA**
- Acceso a datos adicional con **Spring Data JDBC**
- Implementación ORM con **Hibernate**
- Base de datos en memoria **H2**
- API REST básica con **Spring Web**
- Pruebas unitarias con **Spring Boot Test**

---

## 🛠️ Tecnologías Utilizadas

- **Java:** 21  
- **Spring Boot:** 3.4.1  
- **Spring Data JPA**
- **Spring Data JDBC**
- **Hibernate**
- **Spring Web (REST)**
- **H2 Database**
- **Maven**

---

## 📋 Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- Java JDK 21
- Maven 3.9+
- IDE recomendado: IntelliJ IDEA, Eclipse, Spring Tool Suite

---

## ▶️ Ejecución del Proyecto

Desde la raíz del proyecto, ejecuta:

```bash
mvn spring-boot:run
````

O bien empaqueta el proyecto:

```bash
mvn clean package
java -jar target/learn-jpa-and-hibernate-0.0.1-SNAPSHOT.jar
```

La aplicación estará disponible en:

```
http://localhost:8080
```

---

## 🗄️ Base de Datos H2

La aplicación utiliza **H2 en memoria**.

Si está habilitada la consola H2, podrás acceder desde:

```
http://localhost:8080/h2-console
```

Configuración típica:

* JDBC URL: `jdbc:h2:mem:testdb`
* Usuario: `sa`
* Contraseña: *(vacía)*

---

## 📁 Estructura del Proyecto

```
src
 └── main
     ├── java
     │   └── com.in28minutes.springboot
     └── resources
         ├── application.properties
         └── data.sql
```

---

## 🧪 Ejecución de Pruebas

Para ejecutar las pruebas unitarias:

```bash
mvn test
```

---

## 🚀 Objetivo del Proyecto

Este proyecto tiene como objetivo:

* Comprender el funcionamiento de **JPA** y **Hibernate**
* Comparar **Spring Data JPA** vs **Spring Data JDBC**
* Aprender el mapeo de entidades
* Ejecutar consultas CRUD básicas
* Familiarizarse con Spring Boot 3 y Java 21

---

## 📄 Licencia

Proyecto con fines educativos y de aprendizaje.
Uso libre para prácticas personales.

---

## ✍️ Autor

Proyecto desarrollado como práctica de aprendizaje de **JPA & Hibernate con Spring Boot**.






	
	
	

	
	


	
		
	



	
	
	


	
	







