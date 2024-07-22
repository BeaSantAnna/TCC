package com.tcc.orcamentos.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCategoria")
	private Long id;

	@Column(name = "tituloCategoria", unique = true)
	@NotBlank(message = "Título da categoria obrigatório.")
	private String titulo;

	//@OneToMany(mappedBy = "categorias", cascade = CascadeType.ALL)
	//private List<Produto> produtos = new ArrayList<>();
}
