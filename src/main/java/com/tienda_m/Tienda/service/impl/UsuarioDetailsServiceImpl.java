/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_m.Tienda.service.impl;

import com.tienda_m.Tienda.dao.UsuarioDao;
import com.tienda_m.Tienda.domain.Rol;
import com.tienda_m.Tienda.domain.Usuario;
import com.tienda_m.Tienda.service.UsuarioDetailsService;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class UsuarioDetailsServiceImpl 
    implements UsuarioDetailsService, UserDetailsService {

    @Autowired
    private UsuarioDao usuarioDao;
    @Autowired
    private HttpSession session;
    
    @Override 
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) 
            throws UsernameNotFoundException {
        
        
        //se vbusca el regisr en la tabla de usuarios mediante
        //el findByUsername
        
        Usuario usuario = usuarioDao.findByUsername(username);
        
        //se valida si se recupero un usuario de la abla
        
        if (usuario==null){
            //no se encontro el usuario
            throw new UsernameNotFoundException(username);
        }
        
        //si estamos aca.. si  e encontro el usuario
        
        //aca va la recuperacion de la foto
        session.removeAttribute("usuarioImagen");
        session.setAttribute("usuarioImagen",
                usuario.getRutaImagen());
        
        
        //se recuperan los roles...
        var roles = new ArrayList<GrantedAuthority>();
        for (Rol r: usuario.getRoles()) {
            roles.add(new SimpleGrantedAuthority(r.getNombre()));
            
        }
        
        //se devuelve un usuario ya de tipo UserDetails
        return new User(usuario.getUsername(),usuario.getPassword(), roles);
        
    }
    
    
}
