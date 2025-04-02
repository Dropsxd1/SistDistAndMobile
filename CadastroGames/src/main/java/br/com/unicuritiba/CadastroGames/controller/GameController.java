package br.com.unicuritiba.CadastroGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.CadastroGames.models.Game;
import br.com.unicuritiba.CadastroGames.repositories.GameRepository;

@RestController
public class GameController {

	@Autowired
	GameRepository repository;

	@GetMapping("/games")
	public ResponseEntity<List<Game>> getGames() {
		return ResponseEntity.ok(repository.findAll());
	}

	@PostMapping("/games")
	public ResponseEntity<Game> adicionaGame(@RequestBody Game game) {
		Game gameSalvo = repository.save(game);
		return ResponseEntity.ok(gameSalvo);
	}

	@DeleteMapping("/games/{id}")
	public void removeGame(@PathVariable long id) {
		repository.deleteById(id);
	}

	@PutMapping("/games/{id}")
	public Game putGame(@PathVariable Long id, @RequestBody Game game) {
	    game.setId(id);
	    return repository.save(game);
	}
    
}