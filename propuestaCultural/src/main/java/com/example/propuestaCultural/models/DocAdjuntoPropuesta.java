package com.example.propuestaCultural.models;

import com.example.propuestaCultural.models.keys.DocAdjuntoPropuestaPK;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "propuesta_documento")
@IdClass(DocAdjuntoPropuestaPK.class)
public class DocAdjuntoPropuesta {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;

    @Id
    @ManyToOne
    @JoinColumn(name="id_documentoAdjunto", referencedColumnName = "id_documentoAdjunto")
    private DocumentosAdjunto documentosAdjunto;
}
