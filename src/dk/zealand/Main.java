package dk.zealand;

public class Main {

    // Fra bogen https://books.trinket.io/thinkjava2/chapter6.html
    // Kapitel 6 ex 4
    // Kapitel 6 ex 6

    public static void main(String[] args) {
        String ord = "abcdex";
        if (isAbecedarian(ord)) {
            System.out.println("Ordet er i abc-rækkefølge");
        }
        else {
            System.out.println("Ordet er ikke i abc-rækkefølge");
        }
    }

    // Write a method called isAbecedarian that
    // takes a String and
    // returns a boolean indicating whether the word is abecedarian.
    public static boolean isAbecedarian(String ord) {
        // Pseudokode - algoritme almindelig ord
        // giv dem tal i forhold til alfabetet
        // gennemgå alle bogstaver
        // XABCDE
        boolean erDetNuIRækkefølge = true;
        for (int i = 1; i < ord.length(); i++) {
            System.out.println("Bogstav " + i + " er " + ord.charAt(i));
            if (ord.charAt(i)>=ord.charAt(i-1)) {
                System.out.println("Denne bogstav er større end den forrige.");
            }
            else {
                System.out.println("Denne bogstav er ikke større.");
                erDetNuIRækkefølge = false;
            }
        }

        return erDetNuIRækkefølge;
    }

}
