package com.example.parsingjsonfromnestedobject;

public class MovieDetails {
    //Model class for details data

    public String getRelease() {
        return release;
    }

    public String getCategories() {
        return category;
    }

    public String getDuration() {
        return duration;
    }

    String release;
    String category;
    String duration;

    public MovieDetails(String release, String categories, String duration) {
        this.release = release;
        this.category = categories;
        this.duration = duration;
    }
}
