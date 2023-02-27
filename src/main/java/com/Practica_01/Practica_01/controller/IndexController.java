/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Practica_01.Practica_01.controller;

import com.Practica_01.Practica_01.domain.Estado;
import com.Practica_01.Practica_01.service.EstadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Slf4j
@Controller
public class IndexController {

    @Autowired
    EstadoService estadoService;

    @GetMapping("/")
    public String inicio(Model model) {

        var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);

        return "index";
    }

    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Estado estado) {
        return "modificarEstado";
    }

    @PostMapping("/guardarEstado")
    public String guardarCliente(Estado estado){
    estadoService.save(estado);
    return "redirect:/";
    }
    
    @GetMapping("/modificarEstado/{idPais}")
    public String modificarEstado(Estado estado, Model model){ 
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado",estado);
        return "modificarEstado";
    }
    @GetMapping("/eliminarEstado/{idPais}")
    public String eliminarEstado(Estado estado){
        estadoService.delete(estado);
        return "redirect:/";
    }
}
