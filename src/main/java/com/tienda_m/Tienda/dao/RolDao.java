package com.tienda_m.Tienda.dao;

import com.tienda_m.Tienda.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolDao extends
        JpaRepository<Rol,Long>   {
    
    
}
