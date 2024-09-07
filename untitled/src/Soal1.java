/*  Nama: Hanif Ahmad Naufal
    NIM: 231511048
    Kelas: 2B-D3
*/

import java.util.Scanner;
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan input: ");
        String s = input.nextLine();

        String[] tokens = s.split("[ !,?._'@]+");

        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}