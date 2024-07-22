package com.tcc.orcamentos.entity;

import java.util.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nomeFantasia")
	@NotBlank(message = "Nome fantasia obrigatório.")
	@Size(min = 10, max = 40)
	private String nomeFantasia;
	
	@Column(name = "cnpj")
	@NotBlank(message = "CNPJ da empresa obrigatório.")
	@Size(min = 10, max = 40)
	private String cnpj;
	
	@Column(name = "inscricaoEstadual")
	@NotBlank(message = "Inscrição Estadual da empresa obrigatório.")
	@Size(min = 10, max = 40)
	private String inscricaoEstadual;
	
	@Column(name = "endereco")
	@NotBlank(message = "Endereço da empresa obrigatório.")
	@Size(min = 5, max = 60)
	private String endereco;
	
	@Column(name = "cep")
	@NotBlank(message = "CEP da empresa obrigatório.")
	@Size(min = 10, max = 40)
	private String cep;
	
	@ElementCollection
    @CollectionTable(name = "imagem_empresa", joinColumns = @JoinColumn(name = "idEmpresa"))
    @Column(name = "logoEmpresa")
    private Collection<String> imagemEmpresa;

	@Column(name="emailUsuario", unique = true)
	@NotBlank(message = "E-mail obrigatório.")
	private String emailEmpresa;
	
	@Column(name = "telefoneUsuario")
	@NotBlank(message = "Telefone obrigatório.")
	private String telefoneEmpresa;

}

