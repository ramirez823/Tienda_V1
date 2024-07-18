package com.tienda_m.Tienda.service;

import com.tienda_m.Tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    /*
    se anuncia un metodo que recupera los registros de la tabla producto dentro 
    de un arraylist,pueden ser todos los registros o solo los activos
    */
   public List<Producto> getProductos (boolean activos);

    //se obtiene un registro de la tabla producto en un objeto
    // Producto si el idProducto existe.. si no se pasa un null
    public Producto getProducto(Producto producto);
    
    //se crea un nuevo registro en producto si el objeto Producto NO tiene idProducto
    //se actualiza el registro en la tabla producto si el objeto Producto tiene un idProducto
    public void save (Producto producto);
    
    //se elimina el registro que tiene el idProducto
    public void delete(Producto producto);
    
    
}
