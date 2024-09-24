import br.com.pratica.screenmatch.calculation.TimeCalculator;
import br.com.pratica.screenmatch.calculation.RecommendationFilter;
import br.com.pratica.screenmatch.model.Episode;
import br.com.pratica.screenmatch.model.Movie;
import br.com.pratica.screenmatch.model.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + myMovie.getDurationInMinutes());

        myMovie.displayTechnicalSheet();
        myMovie.rate(8);
        myMovie.rate(5);
        myMovie.rate(10);
        System.out.println("Total de avaliações: " + myMovie.getTotalRatings());
        System.out.println(myMovie.getAverageRating());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.displayTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationInMinutes());

        Movie anotherMovie = new Movie();
        anotherMovie.setName("Avatar");
        anotherMovie.setReleaseYear(2023);
        anotherMovie.setDurationInMinutes(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(anotherMovie);
        calculator.include(lost);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(lost);
        episode.setTotalViews(300);
        filter.filter(episode);
    }
}
