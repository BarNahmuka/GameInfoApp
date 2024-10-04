package com.example.gamesvideosproject.models;

public class Game {


    private String id;
    private String name;
    private String releaseDate;
    private String imageUrl;
    private String rating;
    private String genre;
    private String description;
    private boolean ifClickedFlag = false;
    private String developers;

    private String ratingsCount;

    public Game(String id,String name, String releaseDate, String imageUrl, String rating, String genre, String ratingsCount) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.genre = genre;
        this.description = description;
        this.developers = developers;
        this.ratingsCount = ratingsCount;
    }

    public String getId() {return id;}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDevelopers() {
        return developers;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public boolean AlreadyClicked() {
        if(!ifClickedFlag)
        {
            ifClickedFlag = true;
            return false;
        }
        return true;
    }

    public String getRatingsCount() {
        return ratingsCount;
    }

    public void setRatingsCount(String genre) {
        this.ratingsCount = ratingsCount;
    }
}
