package com.lucasmoreira.dslist.controllers;

import com.lucasmoreira.dslist.dto.GameMinDTO;
import com.lucasmoreira.dslist.servicies.GameFindByListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/lists")
public class GetGameFindByListController {

    @Autowired
    private GameFindByListService gameFindByListService;

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameFindByListService.findByList(listId);
        return result;
    }

}
