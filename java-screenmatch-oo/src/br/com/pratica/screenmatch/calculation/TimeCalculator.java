package br.com.pratica.screenmatch.calculation;


import br.com.pratica.screenmatch.model.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void include(Movie m) {
//        this.totalTime += m.getDurationInMinutes();
//    }
//
//    public void include(Series s) {
//        this.totalTime += s.getDurationInMinutes();
//    }

    public void include(Title title) {
        System.out.println("Adding duration in minutes of " + title);
        this.totalTime += title.getDurationInMinutes();
    }
}
