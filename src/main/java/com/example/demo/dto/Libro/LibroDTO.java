package com.example.demo.dto.Libro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroDTO {
    private Long id_libro;
    private String titulo;
    private String autor;
    private int ano_publicacion;
    private String descripcion;
    private int cantidad_disponible;
}
