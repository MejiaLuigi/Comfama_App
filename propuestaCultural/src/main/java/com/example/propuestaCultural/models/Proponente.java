package com.example.propuestaCultural.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;
@Entity
@Data
@Table(name = "proponente")
public class Proponente {
    //Un proponente puede tener un representante
    //Un proponente puede ser un solo tipo de proponente

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_proponente;

    @Column(name = "documento_identidad_proponente")
    private int documento_identidad;

    @Column(name = "nombre_proponente")
    private String nombre_proponente;

    @Column(name = "trayectoria_proponente")
    private String trayectoria_proponente;

    @ManyToOne
    @JoinColumn(name = "id_representante", referencedColumnName = "id_representante")
    private Representante id_representante;

    @ManyToOne
    @JoinColumn(name = "id_tipo_proponente", referencedColumnName = "id_tipo_Proponente")
    private TipoProponente id_tipo_proponente;
}
