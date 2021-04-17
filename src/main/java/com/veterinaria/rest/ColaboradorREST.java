package com.veterinaria.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.service.ColaboradorService;

@RestController
@RequestMapping("/colaboradores/")
public class ColaboradorREST {
	
	@Autowired
	private ColaboradorService colaboradorService;
	

}
