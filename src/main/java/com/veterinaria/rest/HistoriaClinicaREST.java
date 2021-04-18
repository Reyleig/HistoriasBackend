package com.veterinaria.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.model.HistoriaClinica;
import com.veterinaria.service.HistoriaClinicaService;

@RestController
@RequestMapping("/historia_clinica/")
public class HistoriaClinicaREST {
	
	@Autowired
	private HistoriaClinicaService historiaClinicaService;
	@GetMapping
	private ResponseEntity<List<HistoriaClinica>> getAllHistoriaClinica(){
		return ResponseEntity.ok(historiaClinicaService.findAll());
	}
	@PostMapping
	private ResponseEntity<HistoriaClinica> saveHistoriaclinica (@RequestBody HistoriaClinica historiaclinica){
		
		try {
			HistoriaClinica historiaclinicaGuardada = historiaClinicaService.save(historiaclinica);
			return ResponseEntity.created(new URI("/historia_clinica/"+historiaclinicaGuardada.getId())).body(historiaclinicaGuardada);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	@DeleteMapping (value="delete/{id}")
	private ResponseEntity<Boolean> deleteHistoriaClinica (@PathVariable ("id") Long id){
		historiaClinicaService.deleteById(id);
		return ResponseEntity.ok(!(historiaClinicaService.findById(id)!=null));		  
	}

}
