package com.lucaslucenak.gameslist.repositories;

import com.lucaslucenak.gameslist.models.GameListModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameListModel, Long> {
}
