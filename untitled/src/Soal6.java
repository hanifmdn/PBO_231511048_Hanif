/*  Nama: Hanif Ahmad Naufal
    NIM: 231511048
    Kelas: 2B-D3
*/

import java.math.BigInteger;
import java.util.Scanner;
public class Soal6 {
    public static void main (String[] args) {
        BigInteger a, b, hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan input: ");
        a = input.nextBigInteger();
        b = input.nextBigInteger();

        System.out.println("Output: ");
        hasil = a.add(b);
        System.out.println(hasil);

        hasil = a.multiply(b);
        System.out.println(hasil);
    }
}