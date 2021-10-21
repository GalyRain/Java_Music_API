package com.whate_dragon.java_music_api.model;

public class Movie {
    private String title;
    private String posterUrl;
    private String year;

    public Movie() {
    }

    public String getTitle() {
        return title;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public String getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
