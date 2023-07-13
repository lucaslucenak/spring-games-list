package com.lucaslucenak.gameslist.repositories;

import com.lucaslucenak.gameslist.models.GameModel;
import com.lucaslucenak.gameslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<GameModel, Long> {

    @Query(nativeQuery = true, value = """
            SELECT game.id, game.title, game.game_year AS `year`, game.img_url as imgUrl,
            game.short_description as shortDescription, belonging.position
            FROM game
            INNER JOIN belonging ON game.id = belonging.game_id
            WHERE belonging.game_list_id = :gameListId
            ORDER BY belonging.position
            """)
    List<GameMinProjection> findGameMinByListId(Long gameListId);
}
