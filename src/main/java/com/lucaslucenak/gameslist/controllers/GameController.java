package com.lucaslucenak.gameslist.controllers;

import com.lucaslucenak.gameslist.dtos.GameMaxDto;
import com.lucaslucenak.gameslist.dtos.GameMinDto;
import com.lucaslucenak.gameslist.models.GameModel;
import com.lucaslucenak.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/find-all-game-min")
    public List<GameMinDto> findAllGameMin() {
        return gameService.findAllGameMin();
    }

    @GetMapping(value = "/find-all-game-max")
    public List<GameMaxDto> findAllGameMax() {
        return gameService.findAllGameMax();
    }

    @GetMapping(value = "/{id}")
    public GameMaxDto findGameMaxById(@PathVariable Long id) {
        return gameService.findGameMaxById(id);
    }
}
