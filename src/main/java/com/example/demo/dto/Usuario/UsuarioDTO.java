package com.example.demo.dto.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO{
    private Long id;
    private String nombre;
    private String email;
    private Long numeroTelefono;
    
}
