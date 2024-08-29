package com.proaula.demo.api.controller;

import com.proaula.demo.domain.dto.ProductoDTO;
import com.proaula.demo.domain.service.ProductoServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ProductoController {

    private final ProductoServices productoServices;

    public ProductoController(ProductoServices productoServices) {
        this.productoServices = productoServices;
    }
    
    
    @PostMapping
    public String crearProducto(@RequestBody ProductoDTO productoDTO) {
        try {
            productoServices.crearProducto(productoDTO);
            return "ok";
        } catch (Exception e) {
            return "error";
        }
    }
    @GetMapping("productos")
    public String obtenerProductos() {
        try {
            return "ok";
        } catch (Exception e) {
            return "error";
        }
    }
    
//    @GetMapping("/productos")
//    public ResponseEntity<ProductoDTO> obtenerProductos(@RequestBody ProductoDTO productoDTO) {
//        
//    }
//    
//    @GetMapping("/producto/{idProducto}")
//    public ResponseEntity<ProductoDTO> obtenerProducto(@RequestBody ProductoDTO productoDTO) {
//        
//    }
 
}
