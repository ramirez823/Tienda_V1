package com.tienda_m.Tienda.dao;

import com.tienda_m.Tienda.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends
        JpaRepository<Usuario,Long>   {
    
    
    public Usuario findByUsername(String username);
    
    
}
