package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Obtener el nombre de todos los usuarios que comiencen con una letra dada.
    @Query("SELECT u FROM Usuario u WHERE LOWER(SUBSTRING(u.nombre, 1, 1)) = LOWER(:letter)")
    List<Usuario> usersByLetter(String letter);
}
// es correcto