package com.chel0per.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chel0per.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
