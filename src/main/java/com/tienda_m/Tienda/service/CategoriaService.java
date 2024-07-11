package com.tienda_m.Tienda.service;

import com.tienda_m.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    /*
    se anuncia un metodo que recupera los registros 
    de la tabla categoria dentro de un arraylist,
    pueden ser todos los registros o solo los activos
    */
    
    public List<Categoria> getCategorias (boolean activos);
    
    
    
}
