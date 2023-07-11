package com.lucaslucenak.gameslist.services;

import com.lucaslucenak.gameslist.dtos.GameMinDto;
import com.lucaslucenak.gameslist.models.GameModel;
import com.lucaslucenak.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<GameMinDto> gameMinDtos = new ArrayList<>();
        for (GameModel gameModel : gameRepository.findAll()) {
            gameMinDtos.add(new GameMinDto(gameModel));
        }
        return gameMinDtos;
    }
}
