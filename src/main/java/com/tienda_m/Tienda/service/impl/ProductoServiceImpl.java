package com.tienda_m.Tienda.service.impl;

import com.tienda_m.Tienda.dao.ProductoDao;
import com.tienda_m.Tienda.domain.Producto;
import com.tienda_m.Tienda.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements
        ProductoService {
    
    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos(boolean activos) {
        var lista = productoDao.findAll();
        if (activos) { //elimina los inactivos
            lista.removeIf(c -> !c.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly=true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Producto producto) {
         productoDao.save(producto);
    }

    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    @Transactional(readOnly=true)
    public List<Producto> consulta1(double precioInf, double precioSup) {
       return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);
        
    }
    
    
}
