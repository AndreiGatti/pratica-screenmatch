package br.com.pratica.screenmatch.model;

import br.com.pratica.screenmatch.calculation.Classifiable;

public class Movie extends Title implements Classifiable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) getAverageRating() / 2;
    }
}
