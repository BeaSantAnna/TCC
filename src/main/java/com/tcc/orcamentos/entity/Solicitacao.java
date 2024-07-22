package com.tcc.orcamentos.entity;

import java.util.Date;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "solicitacao")
public class Solicitacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Cliente cliente;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataSolicitacao = new Date();

	private Double valorTotal=0.;
	
    @NotBlank(message = "Status da solicitação é obrigatório.")
    @Column(name = "status")
    private String status;
}
