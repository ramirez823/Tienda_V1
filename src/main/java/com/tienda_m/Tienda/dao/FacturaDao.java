package com.tienda_m.Tienda.dao;

import com.tienda_m.Tienda.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao extends
        JpaRepository<Factura,Long>   {
    
    
}
