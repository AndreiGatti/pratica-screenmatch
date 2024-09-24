import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double averageRating = 0;
        double rating = 0;
        int totalRatings = 0;

        while (rating != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar  ");
            rating = input.nextDouble();

            if (rating != -1) {
                averageRating += rating;
                totalRatings++;
            }
        }

        System.out.println("Média de avaliações " + averageRating / totalRatings);
    }
}
