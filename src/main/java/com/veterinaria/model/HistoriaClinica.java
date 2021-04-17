package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "historiaclinica")
public class HistoriaClinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "mascota_id")
	private Mascota mascota;
	private int fecha_creacion;

	
	public HistoriaClinica() {
	}

	public HistoriaClinica(Mascota mascota, int fecha_creacion) {
		super();
		this.mascota = mascota;
		this.fecha_creacion = fecha_creacion;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public int getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(int fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

}
