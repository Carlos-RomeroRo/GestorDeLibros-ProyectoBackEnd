package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo,Long> {
}
