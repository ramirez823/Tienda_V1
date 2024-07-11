package com.tienda_m.Tienda.service.impl;

import com.tienda_m.Tienda.dao.CategoriaDao;
import com.tienda_m.Tienda.domain.Categoria;
import com.tienda_m.Tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements
        CategoriaService {
    
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        
        
        if (activos) { //elimina los inactivos
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
    }
    
    
}
