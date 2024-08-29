package com.proaula.demo.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {
    private Long idProducto;
    private String categoria;
    private String estado;
    private String nombreProducto;
    private int cantidad;
    private double precio;
}
