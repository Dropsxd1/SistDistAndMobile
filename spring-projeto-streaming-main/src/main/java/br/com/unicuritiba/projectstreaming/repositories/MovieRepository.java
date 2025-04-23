package br.com.unicuritiba.projectstreaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.projectstreaming.models.Movie;

public interface MovieRepository 
		extends JpaRepository<Movie, Long>{
		
}
