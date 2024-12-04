package com.senac.passaporte.emissor.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.passaporte.emissor.entities.Passaporte;
import com.senac.passaporte.emissor.services.PassaporteService;

@RestController
@RequestMapping("passaporte")
public class PassaporteController {

	private final PassaporteService passaporteService;
	
	public PassaporteController(PassaporteService passaporteService) {
		this.passaporteService = passaporteService;
	}
	
	@PostMapping(value = "adicionarPassaporte")
	public ResponseEntity<Passaporte> adicionarPassaporte(@RequestBody Passaporte passaporte){
		Passaporte tempPassaporte = passaporteService.adicionarPassaporte(passaporte);
		return ResponseEntity.ok(tempPassaporte);
	}
}
