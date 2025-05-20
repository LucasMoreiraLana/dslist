package com.lucasmoreira.dslist.controllers;

import com.lucasmoreira.dslist.dto.GameDTO;
import com.lucasmoreira.dslist.dto.GameMinDTO;
import com.lucasmoreira.dslist.servicies.GameFindByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/games")
public class GetGameByIdController {

    @Autowired
    GameFindByIdService gameFindByIdService;

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id){
        GameDTO result = gameFindByIdService.findById(id);
        return result;
    }

}
