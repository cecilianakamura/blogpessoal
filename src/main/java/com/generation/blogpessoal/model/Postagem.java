package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //transforma classe em uma tabela
@Table(name = "tb_postagens") //dá nome à tabela
public class Postagem {
	
	@Id //essa variável será ID no banco de dados
	@GeneratedValue(strategy = GenerationType.IDENTITY) // transforma em auto-incrementável
	private Long id;
	
	@NotBlank
	@Size (min=5,max=50)
	private String titulo;
	
	@NotBlank
	@Size (min=5,max=100)
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data; //pega automaticamente data do sistema

	@ManyToOne
	@JsonIgnoreProperties("postagem") //para não ter um loop infinito
	private Tema tema; //variavel que será a chave estrangeira
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
