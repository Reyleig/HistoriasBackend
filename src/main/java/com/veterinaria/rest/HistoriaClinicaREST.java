package com.veterinaria.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.service.HistoriaClinicaService;

@RestController
@RequestMapping("/historia_clinica/")
public class HistoriaClinicaREST {
	
	@Autowired
	private HistoriaClinicaService historiaClinicaService;

}
