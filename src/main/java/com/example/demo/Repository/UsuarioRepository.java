package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
