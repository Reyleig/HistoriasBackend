package com.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
