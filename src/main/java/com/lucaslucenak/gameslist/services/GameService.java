package com.lucaslucenak.gameslist.services;

import com.lucaslucenak.gameslist.dtos.GameMaxDto;
import com.lucaslucenak.gameslist.dtos.GameMinDto;
import com.lucaslucenak.gameslist.models.GameModel;
import com.lucaslucenak.gameslist.projections.GameMinProjection;
import com.lucaslucenak.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAllGameMin() {
        List<GameMinDto> gameMinDtos = new ArrayList<>();
        for (GameModel gameModel : gameRepository.findAll()) {
            gameMinDtos.add(new GameMinDto(gameModel));
        }
        return gameMinDtos;
    }

    @Transactional(readOnly = true)
    public List<GameMaxDto> findAllGameMax() {
        List<GameMaxDto> gameMaxDtos = new ArrayList<>();
        for (GameModel gameModel : gameRepository.findAll()) {
            gameMaxDtos.add(new GameMaxDto(gameModel));
        }
        return gameMaxDtos;
    }

    @Transactional(readOnly = true)
    public GameMaxDto findGameMaxById(Long id) {
        return new GameMaxDto(gameRepository.findById(id).get());
    }

    public List<GameMinDto> findAllGameMinByListId(Long gameListId) {
        List<GameMinDto> gameMinDtos = new ArrayList<>();
        for (GameMinProjection i : gameRepository.findGameMinByListId(gameListId)) {
            gameMinDtos.add(new GameMinDto(i));
        }
        return gameMinDtos;

    }
}
