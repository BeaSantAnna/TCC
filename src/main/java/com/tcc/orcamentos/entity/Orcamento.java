package com.tcc.orcamentos.entity;

import java.time.LocalDate;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "orcamento")
public class Orcamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ordemPedido")
	@NotBlank(message = "Ordem de pedido da solicitação.")
	private int ordemPedido;
	
	@Column(name = "numeroPedido")
	@NotBlank(message = "Número de pedido da solicitação.")
	private int numeroPedido;
	
	@Column(name = "formaPagamento")
	@NotBlank(message = "Forma de pagamento.")
	private String formaPagamento;
	
	@Column(name = "validadeProposta")
	@NotBlank(message = "Validade da proposta.")
	private LocalDate validadeProposta;
	
	@Column(name = "dataEmissao")
	@NotBlank(message = "Data de emissão.")
	private LocalDate dataEmissao;
	
	@Column(name = "tabelaICMS")
	@NotBlank(message = "Tabela de ICMS.")
	private String tabelaICMS;
	
	@Column(name = "tipoEmbalagem")
	@NotBlank(message = "Tipo de embalagem.")
	private String tipoEmbalagem;
	
	@Column(name = "Entrega")
	private String entrega;
	
	
}
