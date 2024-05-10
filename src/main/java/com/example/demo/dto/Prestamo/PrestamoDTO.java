package com.example.demo.dto.Prestamo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrestamoDTO {
    private Long id_prestamo;
    private Long libro_id;
    private Long usuario_id;
    private Date fecha_prestamo;
    private Date fecha_devolucion;
}

// es correcto