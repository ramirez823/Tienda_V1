package com.tienda_m.Tienda.dao;

import com.tienda_m.Tienda.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao extends
        JpaRepository<Venta,Long>   {
    
    
}
