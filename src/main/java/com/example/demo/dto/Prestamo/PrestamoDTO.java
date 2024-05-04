package com.example.demo.dto.Prestamo;

import java.security.Timestamp;

import com.example.demo.dto.Libro.LibroDTO;
import com.example.demo.dto.Usuario.UsuarioDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrestamoDTO {
    private Long id;
    private LibroDTO libro;
    private UsuarioDTO usuario;
    private Timestamp fechaPrestamo;
}
