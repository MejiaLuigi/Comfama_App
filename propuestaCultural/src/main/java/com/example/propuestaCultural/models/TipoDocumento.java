package com.example.propuestaCultural.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tipos_documento")
public class TipoDocumento {

    //un tipo documento puede tener muchos reprensentantes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_tipo_documento;

    @Column(name = "tipo_documento")
    private String tipo_documento;
}
