package com.example.demo.dto.Libro;

import com.example.demo.Entities.Libro;

public interface LibroMappers {
    LibroMappers INSTANCE = org.mapstruct.factory.Mappers.getMapper(LibroMappers.class);
    public LibroDTO libroToLibroDTO(Libro libro);
    public Libro libroDTOToLibro(LibroDTO libroDTO);
} 