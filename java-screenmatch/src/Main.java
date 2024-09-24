public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int releaseYear = 2022;
        System.out.println("Ano de lançamento: " + releaseYear);
        boolean includedInPlan = true;
        double movieRating = 8.1;
        // Média calculada pelas 3 notas da Jack, Paulo e Suelem
        double average = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(average);
        String synopsis;
        synopsis = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + releaseYear;
        System.out.println(synopsis);

        int rating = (int) (average / 2);
        System.out.println(rating);
    }
}
