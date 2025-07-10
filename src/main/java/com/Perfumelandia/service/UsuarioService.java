package com.Perfumelandia.service;

import com.Perfumelandia.model.Usuario;
import com.Perfumelandia.repository.UsuarioRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired //Inyectar el repositorio de usuario
    private UsuarioRepository repo;
    //Método para registrar usuarios
    public Usuario saveUsuario(Usuario u) {
        return repo.save(u);
    }
    public Usuario login(String email, String password) {
      return repo.findByEmailAndPassword(email, password);
    }   
    //Método que autentifica los usuarios
       public Optional<Usuario> autenticar(String email, String password) {
     throw new Error("Unresolved compilation problem: \n\tThe method findByEmail(String) is undefined for the type UsuarioRepository\n");
  }

}