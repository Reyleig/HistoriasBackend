package com.veterinaria.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.service.DetallesHistoriaCService;

@RestController
@RequestMapping("/DetakkesHistoriaClinica/")
public class DetallesHistoriaCREST {
	
	@Autowired
	private DetallesHistoriaCService detallesHistoriaCService;
	

}
