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

import com.veterinaria.model.DetallesHistoriaC;
import com.veterinaria.service.DetallesHistoriaCService;

@RestController
@RequestMapping("/detalleshistoriaclinica/")
public class DetallesHistoriaCREST {

	@Autowired
	private DetallesHistoriaCService detallesHistoriaCService;

	@GetMapping
	private ResponseEntity<List<DetallesHistoriaC>> getAllDetallesHistoriaC() {
		return ResponseEntity.ok(detallesHistoriaCService.findAll());
	}

	@PostMapping
	private ResponseEntity<DetallesHistoriaC> saveDetallesHistoriaC(@RequestBody DetallesHistoriaC detallesHistoriaC) {

		try {
			DetallesHistoriaC DetallesHistoriaCGuardado = detallesHistoriaCService.save(detallesHistoriaC);
			return ResponseEntity.created(new URI("/detalleshistoriaclinica/" + DetallesHistoriaCGuardado.getId()))
					.body(DetallesHistoriaCGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@DeleteMapping(value = "delete/{id}")
	private ResponseEntity<Boolean> deleteDetalleHistoriaC(@PathVariable("id") Long id) {
		detallesHistoriaCService.deleteById(id);
		return ResponseEntity.ok(!(detallesHistoriaCService.findById(id) != null));
	}

}
