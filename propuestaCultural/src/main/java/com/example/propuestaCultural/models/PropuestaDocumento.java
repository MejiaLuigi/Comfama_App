package com.example.propuestaCultural.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "propuesta_documento")
public class PropuestaDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_documento_adjunto_nit")
    private Integer id_documento_adjunto_nit;

    @Column(name = "id_propuesta")
    private Integer id_propuesta;
}
