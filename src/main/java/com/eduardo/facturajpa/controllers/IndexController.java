package com.eduardo.facturajpa.controllers;

import com.eduardo.facturajpa.models.service.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Autowired
    @Qualifier("miServicioComplejo")
    private IServicio servicio;

    //ubicacion de la ruta de comunicacion con otros archivos,
    //metodo que involucra la interfaz grafica
    @GetMapping({"/","","/index"})
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }
}