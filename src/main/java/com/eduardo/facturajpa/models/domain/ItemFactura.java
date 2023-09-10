package com.eduardo.facturajpa.models.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemFactura {

    private Producto producto;
    private Integer cantidad;

    public Integer calcularImporte(){
        return cantidad * producto.getPrecio();
    }
}
