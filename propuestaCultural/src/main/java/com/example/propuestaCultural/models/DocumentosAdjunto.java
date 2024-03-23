package com.example.propuestaCultural.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "documentos_adjuntos")
public class DocumentosAdjunto {

    //Relación con propuesta es de muchos a muchos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_documentoAdjunto;

    @Column(name = "url", length = 50, nullable = false)
    private String url;

    @Column(name = "nombre_documento", nullable = false)
    private String nombre_documento;
}
