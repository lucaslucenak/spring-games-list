package com.lucaslucenak.gameslist.dtos;

import com.lucaslucenak.gameslist.models.GameModel;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

public class GameMaxDto {

    private Long id;
    private String title;
    private Double score;
    private Integer gameYear;
    private String genre;
    private String platforms;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameMaxDto() {
    }

    public GameMaxDto(GameModel gameModel) {
        BeanUtils.copyProperties(gameModel, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getGameYear() {
        return gameYear;
    }

    public void setGameYear(Integer gameYear) {
        this.gameYear = gameYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameMaxDto that = (GameMaxDto) o;
        return id.equals(that.id) && Objects.equals(title, that.title) && Objects.equals(score, that.score) && Objects.equals(gameYear, that.gameYear) && Objects.equals(genre, that.genre) && Objects.equals(platforms, that.platforms) && Objects.equals(imgUrl, that.imgUrl) && Objects.equals(shortDescription, that.shortDescription) && Objects.equals(longDescription, that.longDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, score, gameYear, genre, platforms, imgUrl, shortDescription, longDescription);
    }
}
