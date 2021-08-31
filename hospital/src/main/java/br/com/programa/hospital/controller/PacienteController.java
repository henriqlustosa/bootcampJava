package br.com.programa.hospital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hospital/v1/paciente")
public class PacienteController {

    @GetMapping
    public String getBook(){
        return "API Test!";
    }

}
