package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    // Obtener todos los libros disponibles actualmente (es decir, aquellos con
    // cantidad disponible mayor que cero).
    @Query("SELECT l FROM Libro l WHERE l.cantidad_disponible > 0")
    List<Libro> booksAvailable();

    // Obtener todos los libros ordenados por título de forma ascendente.
    @Query("SELECT l FROM Libro l ORDER BY l.titulo ASC")
    List<Libro> orderByTitle();

    // Obtener el libro con la cantidad disponible más alta (retornaremos el nombre
    // del libro).
    @Query("SELECT l.titulo FROM Libro l WHERE l.cantidad_disponible = (SELECT MAX(m.cantidad_disponible) FROM Libro m)")
    List<Libro> mostAvailableBook(); // para devolver varios en casos de empate.
}

// es correcto
