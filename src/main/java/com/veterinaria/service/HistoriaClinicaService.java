package com.veterinaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.veterinaria.model.HistoriaClinica;
import com.veterinaria.repository.HistoriaClinicaRepository;

@Service
public class HistoriaClinicaService implements HistoriaClinicaRepository{
	
	@Autowired
	private HistoriaClinicaRepository historiaClinicaRepository;

	@Override
	public List<HistoriaClinica> findAll() {
		return historiaClinicaRepository.findAll();
	}

	@Override
	public List<HistoriaClinica> findAll(Sort sort) {
		
		return historiaClinicaRepository.findAll(sort);
	}

	@Override
	public List<HistoriaClinica> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistoriaClinica> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends HistoriaClinica> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteInBatch(Iterable<HistoriaClinica> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public HistoriaClinica getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistoriaClinica> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistoriaClinica> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<HistoriaClinica> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistoriaClinica> S save(S entity) {
		
		return historiaClinicaRepository.save(entity);
	}

	@Override
	public Optional<HistoriaClinica> findById(Long id) {
		
		return historiaClinicaRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		historiaClinicaRepository.deleteById(id);
		
	}

	@Override
	public void delete(HistoriaClinica entity) {
		historiaClinicaRepository.delete(entity);
		
	}

	@Override
	public void deleteAll(Iterable<? extends HistoriaClinica> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends HistoriaClinica> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistoriaClinica> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends HistoriaClinica> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends HistoriaClinica> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
