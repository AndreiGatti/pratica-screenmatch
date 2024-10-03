package br.com.pratica.screenmatch.main;

import br.com.pratica.screenmatch.model.Movie;
import br.com.pratica.screenmatch.model.Series;
import br.com.pratica.screenmatch.model.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1970);
        myMovie.rate(9);
        Movie anotherMovie = new Movie("Avatar", 2023);
        anotherMovie.rate(5);
        var andreiMovie = new Movie("Era do Gelo 3", 2009);
        andreiMovie.rate(10);
        Series lost = new Series("Lost", 2000);


        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie);
        list.add(anotherMovie);
        list.add(andreiMovie);
        list.add(lost);
        for (Title item: list) {
            System.out.println(item.getName());
            if(item instanceof Movie movie && movie.getRating() > 2){
                System.out.println("Classificação " + movie.getRating());
            }
        }

        ArrayList<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Adam Sandler");
        searchByArtist.add("Ryan Gosling");
        searchByArtist.add("Brad Pitt");
        System.out.println(searchByArtist);

        Collections.sort(searchByArtist);
        System.out.println("Depois do sort");
        System.out.println(searchByArtist);
        System.out.println("Lista de títulos ordenados");
        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println("Ordenando por ano");
        System.out.println(list);
    }
}
