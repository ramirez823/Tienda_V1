package com.tienda_m.Tienda.dao;

import com.tienda_m.Tienda.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends
        JpaRepository<Producto,Long>   {
    
    
}
