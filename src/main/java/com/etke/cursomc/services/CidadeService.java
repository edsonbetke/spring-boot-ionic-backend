package com.etke.cursomc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etke.cursomc.domain.Cidade;
import com.etke.cursomc.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	CidadeRepository repo;

	public List<Cidade> findByEstado(Integer estadoid) {
		return repo.findCidades(estadoid);
	}
}
