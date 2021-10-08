package com.etke.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etke.cursomc.domain.Estado;
import com.etke.cursomc.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	EstadoRepository repo;

	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
	}
}
