package com.junior.cursospringboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junior.cursospringboot.domain.Categoria;
import com.junior.cursospringboot.repositories.CategoriaRepository;
import java.util.Optional;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		
		java.util.Optional<Categoria> obj = repo.findById(id); 
		return obj.orElse(null);
		
	}
	
}
