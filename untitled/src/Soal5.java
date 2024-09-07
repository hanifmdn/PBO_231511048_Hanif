/*  Nama: Hanif Ahmad Naufal
    NIM: 231511048
    Kelas: 2B-D3
*/

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan 4 plat nomor: ");
        String platNomor = input.nextLine();

        String[] platSplit = platNomor.split(" ");

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < platSplit.length; i++) {
            builder.append(platSplit[i]);
        }

        String gabunganPlat = builder.toString();
        long platLong = Long.parseLong(gabunganPlat);
        if ((platLong - 999999) % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
}