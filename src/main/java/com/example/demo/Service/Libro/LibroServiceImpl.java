package com.example.demo.Service.Libro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Libro;
import com.example.demo.Repository.LibroRepository;
import com.example.demo.dto.Libro.LibroDTO;
import com.example.demo.dto.Libro.LibroMapper;
import com.example.demo.dto.Prestamo.PrestamoMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LibroServiceImpl implements LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<LibroDTO> getAvailableLibros() { // @Query en el repository

        return null;
    }

    @Override
    public List<LibroDTO> getLibros() {

        return null;
    }

    @Override
    public List<LibroDTO> getlibrosOrderDate() {
        try {
                List<Libro> libros = libroRepository.findAll();
                return libros.stream().map(LibroMapper.INSTANCE::libroToLibroDTO).toList();
            
        } catch (Exception e) {
            log.error("Error buscando los libros en la base de datos");
        }
        return List.of();
    }

    @Override
    public List<LibroDTO> getlibrosWord(String word) {

        return null;
    }

}
