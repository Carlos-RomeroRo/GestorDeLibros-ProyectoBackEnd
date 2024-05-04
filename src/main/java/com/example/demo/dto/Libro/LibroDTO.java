package com.example.demo.dto.Libro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroDTO{
    private Long id; 
    private String titulo;
    private String autor;
    private int anoPublicacion; 
    private int cantidadDisponible;
} 