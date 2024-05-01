package com.example.demo.dto.Libro;

public record LibroDTO(Long id, 
                       String titulo, 
                       String autor, 
                       int anoPublicacion, 
                       int cantidadDisponible) {
} 