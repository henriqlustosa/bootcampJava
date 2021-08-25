package br.com.programa.hospital.dto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital/v1/paciente")
public class PacienteDto {
	
	@GetMapping
	public String getPaciente()
	{
		return "API Test!";
	}

}
