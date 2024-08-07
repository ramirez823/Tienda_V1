package com.tienda_m.Tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="producto")

public class Producto implements Serializable {
    
    private static final long serialVersionUID =11;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name="id_producto")
    private Long idProducto;
    // private Long idCategoria;    no se utiliza mas por el @ManyToOne
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;
    
    

}
