package com.example.demo.dto.Prestamo;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.demo.Entities.Prestamo;
import com.example.demo.Repository.LibroRepository;
import com.example.demo.Repository.UsuarioRepository;

public interface PrestamoMapper {
    PrestamoMapper INSTANCE = Mappers.getMapper(PrestamoMapper.class);

    @Mapping(source = "libro", target = "idLibro")
    @Mapping(source = "usuario", target = "idUsuario")
    public PrestamoDTO prestamoToPrestamoDTO(Prestamo prestamo);

    default Prestamo prestamoDTOToPrestamo(PrestamoDTO prestamoDTO,
            LibroRepository libroRepository,
            UsuarioRepository usuarioRepository) {

        if (prestamoDTO == null) {
            return null;
        }

        Prestamo prestamoRes = new Prestamo();
        long id = prestamoDTO.getLibro().getId();
        prestamoRes.setIdLibro(
                libroRepository.findById(id).orElseThrow(() -> new RuntimeException("Libro no encontrado")));
        id = prestamoDTO.getUsuario().getId();
        prestamoRes.setIdUsuario(
                usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado")));
        prestamoRes.setFechaPrestamo(prestamoDTO.getFechaPrestamo());
        return prestamoRes;
    }
}
