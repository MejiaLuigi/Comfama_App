package com.example.propuestaCultural.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
@Table(name = "representantes")
public class Representante {

    //Un representante puede tener muchos proponentes
    //Un representante puede tener un tipo documento

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_representante;

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", referencedColumnName = "id_tipo_documento")
    private TipoDocumento tipo_documento;

    @Column(name = "correo_electronico")
    private String correo_electronico;

    @Column(name = "numero_documento")
    private Integer numero_documento;

    @Column(name = "primer_apellido")
    private String primer_apellido;

    @Column(name = "primer_nombre")
    private String primer_nombre;

    @Column(name = "telefono_celular")
    private Integer telefono_celular;

    @Column(name = "telofono_fijo")
    private Integer telefono_fijo;


}
