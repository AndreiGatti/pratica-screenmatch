import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double averageRating = 0;
        double rating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme  ");
            rating = input.nextDouble();
            averageRating += rating;
        }

        System.out.println("Média de avaliações " + averageRating / 3);
    }
}
