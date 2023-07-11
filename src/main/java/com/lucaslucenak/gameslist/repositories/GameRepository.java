package com.lucaslucenak.gameslist.repositories;

import com.lucaslucenak.gameslist.models.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameModel, Long> {
}
