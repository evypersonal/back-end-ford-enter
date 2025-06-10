package com.example.adega.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adega.Model.Tipo;
import com.example.adega.Repository.TipoRepository;


@RestController

@RequestMapping("/tipo")

@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TipoController {
	
	@Autowired
	private TipoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Tipo>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("tipo/{tipo}")
	public ResponseEntity<List<Tipo>> GetByTipo(@PathVariable String tipo){
		return ResponseEntity.ok(repository.findByTipoContainingIgnoreCase(tipo));
	}
	
	@GetMapping("id/{id}")
	public ResponseEntity<List<Tipo>> getById(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Tipo> post(@RequestBody Tipo tipo){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tipo));
	}
	
	@PutMapping
	public ResponseEntity<Tipo> put(@RequestBody Tipo tipo){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(tipo));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
