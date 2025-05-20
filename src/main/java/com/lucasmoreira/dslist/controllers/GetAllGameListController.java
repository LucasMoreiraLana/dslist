package com.lucasmoreira.dslist.controllers;

import com.lucasmoreira.dslist.dto.GameListDTO;
import com.lucasmoreira.dslist.servicies.GameListFindAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/lists")
public class GetAllGameListController {

    @Autowired
    private GameListFindAllService gameListFindAllService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListFindAllService.findAll();
        return result;
    }
}
