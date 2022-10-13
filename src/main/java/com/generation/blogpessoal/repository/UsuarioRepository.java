package com.generation.blogpessoal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Usuario;

@Repository //repositorio de configurações herdadas do JpaRepository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	
	public Optional<Usuario> findByUsuario(String usuario);
	
	//Optional -> busca um usuario em específico, ao invés de listar todos os usuarios

}
