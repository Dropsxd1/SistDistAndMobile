package br.com.unicuritiba.CadastroGames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unicuritiba.CadastroGames.models.Game;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
}