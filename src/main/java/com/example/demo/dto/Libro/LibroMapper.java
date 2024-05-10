package com.example.demo.dto.Libro;

import org.mapstruct.Mapper;

import com.example.demo.Entities.Libro;

@Mapper
public interface LibroMapper {
    LibroMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(LibroMapper.class);

    public LibroDTO libroToLibroDTO(Libro libro);

    public Libro libroDTOToLibro(LibroDTO libroDTO);
}

// es correcto