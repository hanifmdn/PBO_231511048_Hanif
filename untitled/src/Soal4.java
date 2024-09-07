/*  Nama: Hanif Ahmad Naufal
    NIM: 231511048
    Kelas: 2B-D3
*/

import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        double gaji = 500000;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan total penjualan bulan ini: ");
        short totalPenjualan = input.nextShort();


        if (totalPenjualan >= 40) {
            gaji += totalPenjualan * 50000 * 0.25;
        } else if (totalPenjualan >= 80) {
            gaji += totalPenjualan * 50000 * 0.35;
        } else if (totalPenjualan < 15) {
            gaji = gaji - ((15 - totalPenjualan) * 50000 * 0.15);
        } else {
            gaji += totalPenjualan * (50000); // 5000 adalah 10% dari harga jual (50000*10/100)
        }
        System.out.println("Total gaji yang didapat: " + gaji);
    }
}