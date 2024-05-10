package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Libro;
import com.example.demo.Entities.Prestamo;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    // Obtener los libros prestados por un usuario específico.
    @Query("SELECT p.libro_id FROM Prestamo p WHERE p.usuario_id.id = :userId")
    List<Libro> borrowedBooksByUser(Long userId);

    // Obtener la cantidad total de préstamos realizados por un usuario.
    @Query("SELECT COUNT(p) FROM Prestamo p WHERE p.usuario_id.id =:userId")
    int borrowedBooksByUserCount(Long userId);

}
// tengo dudas