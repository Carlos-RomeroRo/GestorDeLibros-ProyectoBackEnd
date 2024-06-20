package com.example.demo.dto.Usuario;

import org.mapstruct.Mapper;

import com.example.demo.Entities.Usuario;

@Mapper
public interface UsuarioMapper {
    UsuarioMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(UsuarioMapper.class);

    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario);

    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);
}

