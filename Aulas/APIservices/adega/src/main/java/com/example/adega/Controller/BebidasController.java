package com.example.adega.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adega.Model.Bebidas;
import com.example.adega.Repository.BebidasRepository;

@RestController
@RequestMapping ("/bebidas")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BebidasController {
	
	@Autowired
	private BebidasRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Bebidas>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Bebidas>> getByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<List<Bebidas>> getById(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id));
	}
	
}
