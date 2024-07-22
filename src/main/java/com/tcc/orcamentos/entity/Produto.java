package com.tcc.orcamentos.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nomeProduto")
	@NotBlank(message = "Nome do produto obrigatório.")
	@Size(min = 10, max = 40)
	private String nomeProduto;

	@Column(name = "valor")
	@NotNull(message = "Preço do produto obrigatório.")
	private double valor;

	@Column(name = "descricao", length = Integer.MAX_VALUE)
	@NotBlank(message = "Descrição do produto obrigatória.")
	@Size(min = 10, message = "A descrição do produto deve ter pelo menos 10 caracteres.")
	private String descricao;
	
	@Column(name = "valorSolicitacao")
	private Double valorSolicitacao;


	// Relacionamento com Categoria
	//@ManyToOne(cascade = CascadeType.ALL)
	//private Categoria categorias;
}
