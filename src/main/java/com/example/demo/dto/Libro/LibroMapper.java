package com.example.demo.dto.Libro;

import com.example.demo.Entities.Libro;

public interface LibroMapper {
    LibroMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(LibroMapper.class);
    public LibroDTO libroToLibroDTO(Libro libro);
    public Libro libroDTOToLibro(LibroDTO libroDTO);
} 