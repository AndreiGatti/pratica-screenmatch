public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean includedInPlan = false;
        double movieRating = 8.1;
        String planType = "plus";

        if (releaseYear >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (includedInPlan == true || planType.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
