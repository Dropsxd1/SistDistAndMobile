package br.com.unicuritiba.projectstreaming.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.projectstreaming.models.Movie;
import br.com.unicuritiba.projectstreaming.repositories.MovieRepository;

@RestController
public class MovieController {
	
	@Autowired
	MovieRepository repository;

	@GetMapping("/movies")
	public ResponseEntity<List<Movie>> getUser(){
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/movies/{id}")
	public ResponseEntity<User> getUser(@PathVariable long id){
		return ResponseEntity.ok(repository.findById(id).get());
	}
	

}
