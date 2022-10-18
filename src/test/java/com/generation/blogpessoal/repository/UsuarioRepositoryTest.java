package com.generation.blogpessoal.repository;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.generation.blogpessoal.model.Usuario;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@BeforeAll
	void start() {
		
		usuarioRepository.deleteAll();
		usuarioRepository.save(new Usuario(0L, "João da Silva", "https://i.imgur.com/h4t8loa.jpg", "joao@email.com.br", "13465278"));
		
		usuarioRepository.save(new Usuario(0L, "Manuela da Silva", "https://i.imgur.com/NtyGneo.jpg", "manuela@email.com.br", "13465278"));
		
		usuarioRepository.save(new Usuario(0L, "Adriana da Silva", "https://i.imgur.com/5M2p5Wb.jpg", "adriana@email.com.br", "13465278"));
		
		usuarioRepository.save(new Usuario(0L, "Paulo Antunes", "https://i.imgur.com/FETvs20.jpg", "paulo@email.com.br", "13465278"));
	}

	
}
