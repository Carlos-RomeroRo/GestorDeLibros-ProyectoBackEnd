package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Libro;
import com.example.demo.Repository.LibroRepository;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {
    @Autowired
    private LibroRepository libroRepository;

    @GetMapping("")
    public List<Libro> getLibros() {
        List<Libro> libros = libroRepository.findAll();
        if (libros.isEmpty()) {
            return List.of();
        }
        return libros;
    }
}
