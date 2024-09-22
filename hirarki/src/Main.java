import com.akademik.hirarki.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dosen[] dosen = new Dosen[12];
        dosen[0] = new Dosen("Teknik Informatika","Yudi Widhiyasana", "KO013N");
        dosen[1] = new Dosen("Teknik Informatika","Santi Sundari", "KO009N");
        dosen[2] = new Dosen("Teknik Informatika","Trisna Gelar A", "KO078N");
        dosen[3] = new Dosen("Teknik Informatika","Ade Hodijah", "KO060N");
        dosen[4] = new Dosen("Teknik Informatika","Muhammad Rizqi S", "KO074N");
        dosen[5] = new Dosen("Teknik Informatika","Bambang Wisnuadhi", "KO003N");
        dosen[6] = new Dosen("Teknik Informatika","Wendi Wirasta", "KO079N");
        dosen[7] = new Dosen("Teknik Informatika","Didik Suwito Pribadi", "KO005N");
        dosen[8] = new Dosen("Teknik Informatika","Ade Chandra Nugraha", "KO001N");
        dosen[9] = new Dosen("Teknik Informatika","Zulkifli Arsyad", "KO061N");
        dosen[10] = new Dosen("Teknik Informatika","Siti Dwi Setiarini", "KO075N");
        dosen[11] = new Dosen("Teknik Informatika","Yadhi Aditya P.", "KO052N");

        Mahasiswa[] dataMahasiswa = new Mahasiswa[10];
        dataMahasiswa[0] = new Mahasiswa ("Teknik Informatika","Hanif", "231511048", 'B');
        dataMahasiswa[1] = new Mahasiswa ("Teknik Informatika","Ahmad", "231511041", 'B');
        dataMahasiswa[2] = new Mahasiswa ("Teknik Informatika","Naufal", "231511042", 'B');
        dataMahasiswa[3] = new Mahasiswa ("Teknik Informatika","Fikri", "231511043", 'B');
        dataMahasiswa[4] = new Mahasiswa ("Teknik Informatika","Udin", "231511044", 'B');
        dataMahasiswa[5] = new Mahasiswa ("Teknik Informatika","John", "231511045", 'B');
        dataMahasiswa[6] = new Mahasiswa ("Teknik Informatika","Doe", "231511046", 'B');
        dataMahasiswa[7] = new Mahasiswa ("Teknik Informatika","Alex", "231511047", 'B');
        dataMahasiswa[8] = new Mahasiswa ("Teknik Informatika","Bill", "231511049", 'B');
        dataMahasiswa[9] = new Mahasiswa ("Teknik Informatika","Ujang", "231511040", 'B');

        MataKuliah[] dataMatkul = new MataKuliah[11];
        dataMatkul[0] = new MataKuliah("Teknik Informatika", "21IF2015", "Komputer Grafik", dosen[0], "Teori");
        dataMatkul[1] = new MataKuliah("Teknik Informatika","21IF2015", "Komputer Grafik", dosen[2], "Praktik");
        dataMatkul[2] = new MataKuliah("Teknik Informatika","21IF2013", "Pengantar RPL", dosen[1], "Teori");
        dataMatkul[3] = new MataKuliah("Teknik Informatika","21IF2012", "Basis Data", dosen[3], "Praktik");
        dataMatkul[4] = new MataKuliah("Teknik Informatika","21IF2014", "Aljabar Linear", dosen[4], "Teori");
        dataMatkul[5] = new MataKuliah("Teknik Informatika","21IF2016", "Proyek 3: Web Development", dosen[5], "Praktik");
        dataMatkul[6] = new MataKuliah("Teknik Informatika","21IF2012", "Basis Data", dosen[8], "Teori");
        dataMatkul[7] = new MataKuliah("Teknik Informatika","21IF2011", "Pemrograman Berorientasi Objek", dosen[9], "Teori");
        dataMatkul[8] = new MataKuliah("Teknik Informatika","21IF2011", "Pemrograman Berorientasi Objek", dosen[9], "Praktik");
        dataMatkul[9] = new MataKuliah("Teknik Informatika","21IF2010", "Matematika Diskrit II", dosen[10], "Teori");
        dataMatkul[10] = new MataKuliah("Teknik Informatika","21IF2013", "Pengantar RPL", dosen[11], "Praktek");

        Jadwal[] jadwalKuliah = new Jadwal[11];
        jadwalKuliah[0] = new Jadwal("Senin", dataMatkul[0], "08.40-10.40","D105-Kelas", "Teknik Informatika");
        jadwalKuliah[1] = new Jadwal("Senin", dataMatkul[2], "10.40-12.20","D105-Kelas", "Teknik Informatika");
        jadwalKuliah[2] = new Jadwal("Senin", dataMatkul[1], "13.00-15.30","D102-Lab. MT", "Teknik Informatika");
        jadwalKuliah[3] = new Jadwal("Selasa", dataMatkul[3], "07.00-12.20","D106-Lab. SDB", "Teknik Informatika");
        jadwalKuliah[4] = new Jadwal("Selasa", dataMatkul[4], "13.00-14.40","D101-Kelas", "Teknik Informatika");
        jadwalKuliah[5] = new Jadwal("Rabu", dataMatkul[5], "07.00-16.40","D116-Lab. PjBL-2", "Teknik Informatika");
        jadwalKuliah[6] = new Jadwal("Kamis", dataMatkul[6], "07.00-08.40","D105-Kelas", "Teknik Informatika");
        jadwalKuliah[7] = new Jadwal("Kamis", dataMatkul[7], "08.40-10.40","D105-Kelas", "Teknik Informatika");
        jadwalKuliah[8] = new Jadwal("Kamis", dataMatkul[8], "10.40-13.50","D116-Lab. PjBL-2", "Teknik Informatika");
        jadwalKuliah[9] = new Jadwal("Kamis", dataMatkul[9], "13.50-16.40","D108-Kelas", "Teknik Informatika");
        jadwalKuliah[10] = new Jadwal("Jum'at", dataMatkul[10], "07.50-14.40","D116-Lab. PjBL-2", "Teknik Informatika");


        Boolean running = true;
        while (running) {
            System.out.println("1. Tampilkan Dosen");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Tampilkan Jadwal");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi ");
            Scanner input = new Scanner(System.in);
            int opsi = input.nextInt();
            switch (opsi) {
                case 1:
                    System.out.printf("%n%nDaftar Dosen%n");
                    System.out.printf("%-25s %-15s %-20s%n", "Nama", "Kode Dosen", "Jurusan");
                    System.out.println("------------------------------------------------------------");
                    for (int i = 0; i < 12; i++) {
                        System.out.printf("%-25s %-15s %-20s%n", dosen[i].getNama(), dosen[i].getKodeDosen(), dosen[i].getJurusan());
                    }
                    System.out.printf("%n");
                    break;
                case 2:
                    System.out.printf("%n%nDaftar Mahasiswa%n");
                    System.out.printf("%-15s %-13s %-8s %-15s%n", "Nama", "NIM", "Kelas", "Jurusan");
                    System.out.println("--------------------------------------------------------");
                    for (int i = 0; i < 10; i++) {
                        System.out.printf("%-15s %-15s %-6c %-15s%n", dataMahasiswa[i].getNama(), dataMahasiswa[i].getNim(), dataMahasiswa[i].getKelas(), dataMahasiswa[i].getJurusan());

                    }
                    System.out.printf("%n");
                    break;
                case 3:
                    System.out.printf("%n%nJadwal Perkuliahan%n");
                    System.out.printf("%-10s %-15s %-10s %-35s %-12s %-12s %-23s %-20s %-20s%n", "Hari", "Jam", "Kode MK", "Mata Kuliah", "Jenis", "Kode Dosen", "Nama Dosen", "Ruangan", "Jurusan");
                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    for (int i = 0; i < 11; i++) {
                        System.out.printf("%-10s %-15s %-10s %-35s %-12s %-12s %-23s %-20s %-20s%n",
                                jadwalKuliah[i].getHari(),
                                jadwalKuliah[i].getJam(),
                                jadwalKuliah[i].getMatkul().getKodeMK(),
                                jadwalKuliah[i].getMatkul().getNamaMK(), jadwalKuliah[i].getMatkul().getJenisPerkuliahan(),
                                jadwalKuliah[i].getMatkul().getDosenPengampu().getKodeDosen(),
                                jadwalKuliah[i].getMatkul().getDosenPengampu().getNama(),
                                jadwalKuliah[i].getRuangan(),
                                jadwalKuliah[i].getJurusan());
                    }
                    System.out.printf("%n");

                    break;

                case 4:
                    running = false;
                    break;

            }
        }
    }
}