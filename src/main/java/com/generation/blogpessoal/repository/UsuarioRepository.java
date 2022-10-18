package com.generation.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Usuario;

@Repository //repositorio de configurações herdadas do JpaRepository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	
	public Optional<Usuario> findByUsuario(String usuario); //busca específica por e-mail
	
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome); //busca específica por nome
	
	//Optional -> busca um usuario em específico, ao invés de listar todos os usuarios

}
