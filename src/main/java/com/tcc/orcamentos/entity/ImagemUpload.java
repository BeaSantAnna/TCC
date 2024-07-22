package com.tcc.orcamentos.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class ImagemUpload {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] data;

    private String fileName;
    private String fileType;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
    
    
}
