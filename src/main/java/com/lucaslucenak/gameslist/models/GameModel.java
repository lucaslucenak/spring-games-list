package com.lucaslucenak.gameslist.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "game")
public class GameModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String title;

    private Double score;

    private Integer gameYear;

    private String genre;

    private String platforms;

    @Column(columnDefinition = "TEXT")
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public GameModel(Long id, String title, Double score, Integer gameYear, String genre, String platforms, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.gameYear = gameYear;
        this.genre = genre;
        this.platforms = platforms;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public GameModel() {
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platforms;
    }

    public void setPlatform(String platforms) {
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
        GameModel gameModel = (GameModel) o;
        return id.equals(gameModel.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
