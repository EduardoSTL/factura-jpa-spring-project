package com.eduardo.facturajpa;

import com.eduardo.facturajpa.models.domain.ItemFactura;
import com.eduardo.facturajpa.models.domain.Producto;
import com.eduardo.facturajpa.models.service.IServicio;
import com.eduardo.facturajpa.models.service.MiServicio;
import com.eduardo.facturajpa.models.service.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.eduardo.facturajpa")
public class AppConfig {
    //este tipo de archivo se usa para desplegar datos en la web pero no necesariamente de la base de datos
    @Bean("miServicioSimple")
    @Primary
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean("miSerivicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara Sony", 100);
        Producto producto2 = new Producto("Bicileta Bianchi aro 26", 200);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
    }

    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("Monitor LG LCD 24", 260);
        Producto producto2 = new Producto("Notebook ASUS", 500);
        Producto producto3 = new Producto("Impresora HP multifuncional", 80);
        Producto producto4 = new Producto("Escritorio oficina", 300);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 1);
        ItemFactura linea3 = new ItemFactura(producto1, 1);
        ItemFactura linea4 = new ItemFactura(producto2, 1);

        return Arrays.asList(linea1, linea2, linea3, linea4);
    }
}
