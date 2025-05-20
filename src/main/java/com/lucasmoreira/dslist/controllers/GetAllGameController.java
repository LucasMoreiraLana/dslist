package com.lucasmoreira.dslist.controllers;


import com.lucasmoreira.dslist.dto.GameMinDTO;
import com.lucasmoreira.dslist.servicies.GameFindAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/games")
public class GetAllGameController {

    @Autowired
    private GameFindAllService gameFindAllService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameFindAllService.findAll();
        return result;
    }
}
