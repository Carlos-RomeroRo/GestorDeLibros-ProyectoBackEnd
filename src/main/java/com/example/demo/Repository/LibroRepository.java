package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Libro;

public interface LibroRepository extends JpaRepository<Libro,Long>{
}
