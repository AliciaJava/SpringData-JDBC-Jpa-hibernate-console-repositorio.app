package com.hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // Actualizamos el nombre del autor
        String author = "Alicia Ortega Muñoz";

        // Guardar cursos en el repositorio
        repository.save(new Course(1, "Learn AWS Jpa!", author));
        repository.save(new Course(2, "Learn Azure Jpa!", author));
        repository.save(new Course(3, "Learn DevOps Jpa!", author));

        // Eliminar curso por ID
        repository.deleteById(1L);

        // Buscar cursos por ID
        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));

        // Mostrar todos los cursos y contarlos
        System.out.println(repository.findAll());
        System.out.println(repository.count());

        // Buscar cursos por autor y nombre
        System.out.println(repository.findByAuthor(author));
        System.out.println(repository.findByName("Learn AWS Jpa!"));
        System.out.println(repository.findByName("Learn DevOps Jpa!"));
    }
}
