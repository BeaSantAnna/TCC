package com.tcc.orcamentos.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCliente")
	private Long id;

	@Column(name = "nomeUsuario")
	@NotBlank(message = "Nome de usuário obrigátorio.")
	private String nomeCliente;

	@Column(name = "emailUsuario", unique = true)
	@NotBlank(message = "E-mail obrigatório.")
	private String emailCliente;

	@Column(name = "senhaUsuario")
	@NotBlank(message = "Senha obrigatória.")
	private String senhaCliente;

	@Column(name = "telefoneUsuario")
	@NotBlank(message = "Telefone obrigatório.")
	private String telefoneCliente;
}
