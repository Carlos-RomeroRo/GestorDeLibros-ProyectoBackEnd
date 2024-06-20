package com.example.demo.Service.Libro;



import com.example.demo.dto.Libro.LibroDTO;

import java.util.List;

public interface LibroService {
        List<LibroDTO> getLibros();
        List<LibroDTO> getAvailableLibros();
        List<LibroDTO> getlibrosOrderDate();
        List<LibroDTO> getlibrosWord(String word);
}