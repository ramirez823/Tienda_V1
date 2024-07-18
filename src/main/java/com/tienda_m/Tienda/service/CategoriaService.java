package com.tienda_m.Tienda.service;

import com.tienda_m.Tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    /*
    se anuncia un metodo que recupera los registros de la tabla categoria dentro 
    de un arraylist,pueden ser todos los registros o solo los activos
    */
   public List<Categoria> getCategorias (boolean activos);

    //se obtiene un registro de la tabla categoria en un objeto
    // Categoria si el idCategoria existe.. si no se pasa un null
    public Categoria getCategoria(Categoria categoria);
    
    //se crea un nuevo registro en categoria si el objeto Categoria NO tiene idCategoria
    //se actualiza el registro en la tabla categoria si el objeto Categoria tiene un idCategoria
    public void save (Categoria categoria);
    
    //se elimina el registro que tiene el idCategoria
    public void delete(Categoria categoria);
    
    
}
