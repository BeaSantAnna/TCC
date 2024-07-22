package com.tcc.orcamentos.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "itensSelecao")
public class ItensSelecao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Integer quantidade;

	private Double valorUnitario = 0.;

	private Double valorTotal = 0.;
	
	public Integer getQuantidade() {
		if(quantidade == null) {
			quantidade  =0;
		}
		return quantidade;
	}
	
	@ManyToOne
	private Produto produto;

	@ManyToOne
	private Solicitacao solitacao;
}