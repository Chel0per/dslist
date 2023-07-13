package com.chel0per.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chel0per.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}