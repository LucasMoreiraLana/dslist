package com.lucasmoreira.dslist.controllers;


import com.lucasmoreira.dslist.dto.ReplacementDTO;
import com.lucasmoreira.dslist.servicies.ReplacementGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/lists")
public class PostReplacementController {

    @Autowired
    ReplacementGameService replacementGameService;

    @PostMapping("/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        replacementGameService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
}
