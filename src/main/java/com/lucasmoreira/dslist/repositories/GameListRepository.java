package com.lucasmoreira.dslist.repositories;

import com.lucasmoreira.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
