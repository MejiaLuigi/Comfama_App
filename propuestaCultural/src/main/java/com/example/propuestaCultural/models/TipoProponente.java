package com.example.propuestaCultural.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "tipo_proponente")

public class TipoProponente {
    //Un tipo proponente puede estar en muchos proponente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipo_proponente;

    @Column(name = "documento_identidad_proponente")
    private Integer documento_identidad_proponente;

    @Column(name = "tipo_proponente")
    private String tipo_proponente;
}
