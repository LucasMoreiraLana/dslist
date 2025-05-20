package com.lucasmoreira.dslist.servicies;


import com.lucasmoreira.dslist.dto.GameDTO;
import com.lucasmoreira.dslist.entities.Game;
import com.lucasmoreira.dslist.exceptions.GameNotFoundException;
import com.lucasmoreira.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GameFindByIdService {

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id)
                .orElseThrow(() -> new GameNotFoundException(id));
        return new GameDTO(result);
    }

}
