/*  Nama: Hanif Ahmad Naufal
    NIM: 231511048
    Kelas: 2B-D3
*/

import java.util.Scanner;

public class Soal2 {
    public static void main(String args[]) {
        String[] kata = new String[3];
        Short[] angka = new Short[3];
        Short banyak;
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan banyak data: ");
        banyak = input.nextShort();
        System.out.println("Masukan input: ");
        for (int i = 0; i < banyak; i++) {
            kata[i] = input.next();
            angka[i] = input.nextShort();
        }

        System.out.printf("================================%n");
        for (int i = 0; i < kata.length; i++) {
            System.out.printf("%-15s%03d%n", kata[i], angka[i]);
        }
        System.out.println("================================");

    }
}