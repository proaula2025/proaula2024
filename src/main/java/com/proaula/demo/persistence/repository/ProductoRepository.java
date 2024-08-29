package com.proaula.demo.persistence.repository;

import com.proaula.demo.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
    
    
}
