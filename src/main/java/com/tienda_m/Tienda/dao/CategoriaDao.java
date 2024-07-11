package com.tienda_m.Tienda.dao;

import com.tienda_m.Tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends
        JpaRepository<Categoria,Long>   {
    
    
}
