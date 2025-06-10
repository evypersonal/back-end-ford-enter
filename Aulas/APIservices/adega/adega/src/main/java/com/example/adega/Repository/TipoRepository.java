package com.example.adega.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adega.Model.Tipo;

@Repository
public interface TipoRepository extends JpaRepository<Tipo, Long>{
	public List<Tipo> findByTipoContainingIgnoreCase(String tipo);
	public List<Tipo> findById(long id);
}
