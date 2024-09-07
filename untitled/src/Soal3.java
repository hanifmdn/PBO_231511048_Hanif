/*  Nama: Hanif Ahmad Naufal
    NIM: 231511048
    Kelas: 2B-D3
*/

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Integer angka1, angka2;
        Integer hasil = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan operasi: ");
        String tampungInput = input.nextLine();

        String[] bagi = tampungInput.split(" ");
        angka1 = Integer.parseInt(bagi[0]);
        angka2 = Integer.parseInt(bagi[2]);

        switch (bagi[1]) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                hasil = angka1 / angka2;
                break;
            case "%":
                hasil = angka1 % angka2;
        }
        System.out.println(hasil);
    }
}
