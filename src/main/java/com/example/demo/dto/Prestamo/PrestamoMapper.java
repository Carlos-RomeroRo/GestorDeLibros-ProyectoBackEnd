package com.example.demo.dto.Prestamo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.example.demo.Entities.Prestamo;
import com.example.demo.Repository.LibroRepository;
import com.example.demo.Repository.UsuarioRepository;

@Mapper
public interface PrestamoMapper {

    PrestamoMapper INSTANCE = Mappers.getMapper(PrestamoMapper.class);

    @Mapping(source = "libro_id.id_libro", target = "libro_id")
    @Mapping(source = "usuario_id.id_usuario", target = "usuario_id")
    public PrestamoDTO prestamoToPrestamoDTO(Prestamo prestamo);

    /*
     * y PrestamoDTO.
     * En este caso, indica que el valor del campo idLibro.id en la entidad Prestamo
     * debe asignarse
     * al campo libro.id en la entidad PrestamoDTO durante el proceso de mapeo.
     * source = "idLibro.id": Indica que el valor provendrá del campo idLibro.id en
     * la entidad Prestamo.
     * target = "libro.id": Indica que el valor se asignará al campo libro.id en la
     * entidad PrestamoDTO.
     **/

    default Prestamo prestamoDTOToPrestamo(PrestamoDTO prestamoDTO,
            LibroRepository libroRepository,
            UsuarioRepository usuarioRepository) {

        if (prestamoDTO == null) {
            return null;
        }

        Prestamo prestamoRes = new Prestamo();
        long id = prestamoDTO.getLibro_id();
        prestamoRes.setLibro_id(
                libroRepository.findById(id).orElseThrow(() -> new RuntimeException("Libro no encontrado")));
        id = prestamoDTO.getUsuario_id();
        prestamoRes.setUsuario_id(
                usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado")));
        prestamoRes.setFecha_Prestamo(prestamoDTO.getFecha_prestamo());
        prestamoRes.setFecha_Devolucion(prestamoDTO.getFecha_devolucion());
        return prestamoRes;
    }
}

// es correcto
