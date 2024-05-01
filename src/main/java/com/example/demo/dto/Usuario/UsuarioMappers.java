package com.example.demo.dto.Usuario;

import com.example.demo.Entities.Usuario;

public interface UsuarioMappers {
    UsuarioMappers INSTANCE = org.mapstruct.factory.Mappers.getMapper(UsuarioMappers.class);
    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario);
    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);
}
