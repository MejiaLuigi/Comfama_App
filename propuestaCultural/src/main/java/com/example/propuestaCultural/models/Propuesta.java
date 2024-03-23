package com.example.propuestaCultural.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "propuestas")
public class Propuesta {

    //una propuesta puede tener un solo valor
    //una propuesta puede tener muchos tipos de documentos
    //Relación con doc_adjuntos es de muchos a muchos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ValorPropuesta id_propuesta;

    @Column(name = "descripcion_actividades")
    private String descripcion_actividades;

    @Column(name = "descripcion_propuesta")
    private String descripcion_propuesta;

    @Column(name = "empresas_aliadas")
    private String empresas_aliadas;

    @Column(name = "estado_propuesta")
    private String estado_propuesta;

    @Column(name = "fecha_inicio")
    private String fecha_inicio;

    @Column(name = "fecha_presentacion")
    private String fecha_presentacion;

    @Column(name = "nombre_propuesta")
    private String nombre_propuesta;

    @Column(name = "publico_beneficiado")
    private String publico_beneficiado;

    @ManyToOne
    @JoinColumn(name = "id_proponente", referencedColumnName = "id_proponente")
    private Proponente id_proponente;


    //private Integer valor_propuesta;
}
