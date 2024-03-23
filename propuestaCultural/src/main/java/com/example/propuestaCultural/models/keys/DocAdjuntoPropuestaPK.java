package com.example.propuestaCultural.models.keys;

import lombok.Data;

import java.util.UUID;

@Data
public class DocAdjuntoPropuestaPK {
    private UUID propuesta;
    private UUID documentosAdjunto;
}
