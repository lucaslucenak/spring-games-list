package com.lucaslucenak.gameslist.dtos;

import com.lucaslucenak.gameslist.models.GameListModel;
import org.springframework.beans.BeanUtils;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {
    }
    public GameListDTO(GameListModel gameListModel) {
        BeanUtils.copyProperties(gameListModel, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
