package com.lucaslucenak.gameslist.controllers;

import com.lucaslucenak.gameslist.dtos.GameListDTO;
import com.lucaslucenak.gameslist.dtos.GameMinDto;
import com.lucaslucenak.gameslist.services.GameListService;
import com.lucaslucenak.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/game-list")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAllGameLists() {
        return gameListService.findAllGameLists();
    }

    @GetMapping(value = "/{id}")
    public GameListDTO findGameListById(@PathVariable Long id) {
        return  gameListService.findGameListById(id);
    }

    @GetMapping(value = "/find-games-by-list-id/{gameListId}")
    public List<GameMinDto> findGamesByGameListId(@PathVariable Long gameListId) {
        return gameService.findAllGameMinByListId(gameListId);
    }
}
