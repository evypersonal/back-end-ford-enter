package com.example.adega.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adega.Model.Bebidas;


@Repository
public interface BebidasRepository extends JpaRepository<Bebidas, Long>{
	
	public List<Bebidas> findAllByNomeContainingIgnoreCase(String nome);
	public List <Bebidas> findById(long id);
}
