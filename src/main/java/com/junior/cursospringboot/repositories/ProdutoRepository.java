package com.junior.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junior.cursospringboot.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Integer>{

}
