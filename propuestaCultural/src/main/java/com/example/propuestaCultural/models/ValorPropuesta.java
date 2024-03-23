package com.example.propuestaCultural.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;


@Entity

@Table(name = "valor_propuesta")
public class ValorPropuesta {
    //un valor puede tener una propuesta
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id_valorPropuesta;

    @OneToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;

    @Column(name = "aporte_comfama", columnDefinition = "DOUBLE PRECISION")
    private Integer aporte_comfama;

    @Column(name = "monto_total", columnDefinition = "DOUBLE PRECISION")
    private Integer monto_total;

    public ValorPropuesta() {
    }

    public ValorPropuesta(Integer id_valorPropuesta, Propuesta propuesta, Integer aporte_comfama, Integer monto_total) {
        this.id_valorPropuesta = id_valorPropuesta;
        this.propuesta = propuesta;
        this.aporte_comfama = aporte_comfama;
        this.monto_total = monto_total;
    }

    public Integer getId_valorPropuesta() {
        return id_valorPropuesta;
    }

    public void setId_valorPropuesta(Integer id_valorPropuesta) {
        this.id_valorPropuesta = id_valorPropuesta;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }

    public Integer getAporte_comfama() {
        return aporte_comfama;
    }

    public void setAporte_comfama(Integer aporte_comfama) {
        this.aporte_comfama = aporte_comfama;
    }

    public Integer getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(Integer monto_total) {
        this.monto_total = monto_total;
    }
}
