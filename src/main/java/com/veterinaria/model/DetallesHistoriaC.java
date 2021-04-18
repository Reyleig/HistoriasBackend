package com.veterinaria.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "detalle_historia_clinica")
public class DetallesHistoriaC {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String temperatura;
	private double peso;
	private double frecuencia_cardiaca;
	private double frecuencia_respiratoria;

	private String alimentacion;
	private String habitad;
	private String observacion;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Bogota")
	@CreationTimestamp
	private Timestamp fecha_hora;
	
	@OneToOne
	@JoinColumn(name="colaborador_id")
	private Colaborador colaborador;
	@ManyToOne
	@JoinColumn(name="historia_clinica_id")
	private HistoriaClinica historiaClinica;
	
	public DetallesHistoriaC() {
	}

	public DetallesHistoriaC(String temperatura, double peso, double frecuencia_cardiaca,
			double frecuencia_respiratoria, String alimentacion, String habitad, String observacion,
			Colaborador colaborador, HistoriaClinica historiaClinica) {
		super();
		this.temperatura = temperatura;
		this.peso = peso;
		this.frecuencia_cardiaca = frecuencia_cardiaca;
		this.frecuencia_respiratoria = frecuencia_respiratoria;
		this.alimentacion = alimentacion;
		this.habitad = habitad;
		this.observacion = observacion;
		this.colaborador = colaborador;
		this.historiaClinica = historiaClinica;
	}
	
	
	public Timestamp getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(Timestamp fecha_hora) {
		this.fecha_hora = fecha_hora;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getFrecuencia_cardiaca() {
		return frecuencia_cardiaca;
	}
	public void setFrecuencia_cardiaca(double frecuencia_cardiaca) {
		this.frecuencia_cardiaca = frecuencia_cardiaca;
	}
	public double getFrecuencia_respiratoria() {
		return frecuencia_respiratoria;
	}
	public void setFrecuencia_respiratoria(double frecuencia_respiratoria) {
		this.frecuencia_respiratoria = frecuencia_respiratoria;
	}
	public String getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	public String getHabitad() {
		return habitad;
	}
	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}
	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
	
}
	

