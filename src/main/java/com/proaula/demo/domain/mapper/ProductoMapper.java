package com.proaula.demo.domain.mapper;

import com.proaula.demo.domain.dto.ProductoDTO;
import com.proaula.demo.persistence.entity.Producto;

public class ProductoMapper {

    public static ProductoDTO toDTO(Producto producto) {

        ProductoDTO productoDTO = new ProductoDTO();
        
        productoDTO.setIdProducto(producto.getIdProducto());
        productoDTO.setCategoria(producto.getCategoria());
        productoDTO.setEstado(producto.getEstado());
        productoDTO.setNombreProducto(producto.getNombreProducto());
        productoDTO.setCantidad(producto.getCantidad());
        productoDTO.setPrecio(producto.getPrecio());

        return productoDTO;
    }

    public static Producto toEntity(ProductoDTO dto) {
        Producto producto = new Producto();
        
        producto.setIdProducto(dto.getIdProducto());
        producto.setCategoria(dto.getCategoria());
        producto.setEstado(dto.getEstado()); 
        producto.setNombreProducto(dto.getNombreProducto());
        producto.setCantidad(dto.getCantidad());
        producto.setPrecio(dto.getPrecio());

        return producto;
    }
}
