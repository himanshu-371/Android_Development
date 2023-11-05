package com.example.parsingjsonfromnestedobject;

import com.google.gson.annotations.SerializedName;

public class DataModel {

    int id;
    String title;

    float rating;
    String poster;

   //we need to make object of class details
    @SerializedName("Details")
    MovieDetails movieDetails;

    public DataModel(int id, String title, float rating, String poster, MovieDetails movieDetails) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.poster = poster;
        this.movieDetails = movieDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public MovieDetails getMovieDetails() {
        return movieDetails;
    }

    public void setMovieDetails(MovieDetails movieDetails) {
        this.movieDetails = movieDetails;
    }
}
