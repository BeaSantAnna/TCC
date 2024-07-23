package com.tcc.orcamentos.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUsuario")
	private Long id;
	
	@Column(name="nomeUsuario")
	@NotBlank(message = "Nome de usuário obrigátorio.")
	private String nomeUsuario;
	
	@Column(name="emailUsuario", unique = true)
	@NotBlank(message = "E-mail obrigatório.")
	private String emailUsuario;
	
	@Column(name = "senhaUsuario")
	@NotBlank(message = "Senha obrigatória.")
	private String senhaUsuario;
	
	@Column(name = "telefoneUsuario")
	@NotBlank(message = "Telefone obrigatório.")
	private String telefoneUsuario;
}
