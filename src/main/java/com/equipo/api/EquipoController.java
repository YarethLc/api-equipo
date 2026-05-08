package com.equipo.api;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/equipo")
public class EquipoController {

    // Endpoint base — no modificar
    @GetMapping
    public List<String> integrantes() {
        return List.of("Equipo listo. Cada integrante agrega su endpoint abajo.");
    }

    // ————————————————————————————————————————
    // ZONA DE TRABAJO DEL EQUIPO
    // ————————————————————————————————————————

    @GetMapping("/Maria Stefany Izquierdo Palacios")
    public String saludoMaria() {
        return "Hola, soy Stefany y este es mi endpoint.";
    }

    @GetMapping("/Yareth")
    public String saludoYareth() {
        return "Hola, soy Yareth y este es mi endpoint.";
    }

    @GetMapping("/Esteban")
    public String saludoEsteban() {
        return "Hola, soy Esteban y este es mi endpoint.";
    }

}