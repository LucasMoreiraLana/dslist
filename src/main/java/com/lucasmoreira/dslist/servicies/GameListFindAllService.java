package com.lucasmoreira.dslist.servicies;

import com.lucasmoreira.dslist.dto.GameListDTO;
import com.lucasmoreira.dslist.entities.Game;
import com.lucasmoreira.dslist.entities.GameList;
import com.lucasmoreira.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListFindAllService {

    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
