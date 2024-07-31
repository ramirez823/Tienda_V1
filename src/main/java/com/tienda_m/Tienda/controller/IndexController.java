package com.tienda_m.Tienda.controller;

import com.tienda_m.Tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private ProductoService productoService;


    @GetMapping("/")
    public String listado(Model model) {
        var productos = productoService.getProductos(true);
        model.addAttribute("productos", productos);

        return "index";

    }

}
