package com.eduardo.facturajpa.models.service;

import org.springframework.stereotype.Service;

@Service("miServicioComplejo")
public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion() {
        return "ejecutando algún proceso importnate complicado...";
    }
}
