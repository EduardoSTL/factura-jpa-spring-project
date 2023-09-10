package com.eduardo.facturajpa.models.service;

public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion() {
        return "ejecutando algún proceso importnate complicado...";
    }
}
