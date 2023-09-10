package com.eduardo.facturajpa.models.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    private String nombre;
    private Integer precio;
}
