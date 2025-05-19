package com.lucasmoreira.dslist.repositories;

import com.lucasmoreira.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
