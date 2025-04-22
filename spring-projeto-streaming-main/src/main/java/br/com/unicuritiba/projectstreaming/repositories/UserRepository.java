package br.com.unicuritiba.projectstreaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.projectstreaming.models.User;

public interface UserRepository 
			extends JpaRepository<User, Long> {

}
