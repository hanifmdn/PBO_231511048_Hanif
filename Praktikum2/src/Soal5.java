import java.util.Scanner;

public class Soal5 {
    static String firstLetterToUp (String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan kata pertama: ");
        String kata1 = input.nextLine();
        System.out.printf("Masukan kata kedua: ");
        String kata2 = input.nextLine();

        int panjang = kata1.length() + kata2.length();

        String lexio = (kata1.compareTo(kata2) > 0) ? "YES" : (kata1.compareTo(kata2) < 0) ? "NO" : "Equal";

        kata1 = firstLetterToUp(kata1);
        kata2 = firstLetterToUp(kata2);

        System.out.println(panjang);
        System.out.println(lexio);
        System.out.println(kata1 + ' ' + kata2);
    }
}