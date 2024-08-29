package com.proaula.demo.domain.service;

import com.proaula.demo.domain.dto.ProductoDTO;
import com.proaula.demo.domain.mapper.ProductoMapper;
import com.proaula.demo.persistence.repository.ProductoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class ProductoServices {

    private final ProductoRepository productoRepository;

    public ProductoServices(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public ProductoDTO crearProducto(ProductoDTO produDTO) {
        try {
            this.productoRepository.save(ProductoMapper.toEntity(produDTO));

            return produDTO;
            
        } catch (Exception e) {
            System.out.println("Error crear producto: " + e);
            return null;
        } 
    }

    public List<ProductoDTO> listarProductos() {
        try {
            
            return this.productoRepository.findAll().stream().map(ProductoMapper::toDTO)
                    .collect(Collectors.toList());
            
        } catch (Exception e) {
            System.out.println("Error crear producto: " + e);
            return null;
        }
    }
    
    public ProductoDTO encontrarProducto(Long id) {
        try {
            
            ProductoDTO productoEncontrado = ProductoMapper.toDTO(this.productoRepository.findById(id).orElse(null));
            
            return productoEncontrado;
            
        } catch (Exception e) {
            System.out.println("Error crear producto: " + e);
            return null;
        }
    }

}
