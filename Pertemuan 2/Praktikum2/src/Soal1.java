import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan jumlah angka yang ingin di test: ");
        int T = input.nextInt();

        for (int i = 0; i < T; i++) {
            try {
                long angka = input.nextLong();
                System.out.println("\n" + angka + " can be fitted in:");

                if (angka >= Byte.MIN_VALUE && angka <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (angka >= Short.MIN_VALUE && angka <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (angka >= Integer.MIN_VALUE && angka <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (angka >= Long.MIN_VALUE && angka <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception s) {
                System.out.println(input.next() + " can't be fitted anywhere.");
            }
        }
    }
}