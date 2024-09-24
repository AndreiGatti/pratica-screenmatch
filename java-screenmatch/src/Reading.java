import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String movie = input.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int releaseYear = input.nextInt();
        System.out.println("Diga sua avaliação para o filme  ");
        double rating = input.nextDouble();

        System.out.println(movie);
        System.out.println(releaseYear);
        System.out.println(rating);
    }
}
