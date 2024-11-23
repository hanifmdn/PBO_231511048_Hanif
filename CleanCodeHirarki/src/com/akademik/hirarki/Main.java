package com.akademik.hirarki;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final String TEKNIK_INFORMATIKA = "Teknik Informatika";
    private static final String TEORI = "Teori";
    private static final String PRAKTIK = "Praktik";
    private static final String KELASD105 = "D105-Kelas";
    private static final String KELAS116 = "D116-Lab. PjBL-2";
    private static final String SENIN = "Senin";
    private static final String KAMIS = "Kamis";

    public static void main(String[] args) {
        ArrayList<Dosen> dosenList = new ArrayList<>();
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Yudi Widhiyasana", "KO013N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Santi Sundari", "KO009N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Trisna Gelar A", "KO078N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Ade Hodijah", "KO060N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Muhammad Rizqi S", "KO074N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Bambang Wisnuadhi", "KO003N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Wendi Wirasta", "KO079N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Didik Suwito Pribadi", "KO005N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Ade Chandra Nugraha", "KO001N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Zulkifli Arsyad", "KO061N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Siti Dwi Setiarini", "KO075N"));
        dosenList.add(new Dosen(TEKNIK_INFORMATIKA, "Yadhi Aditya P.", "KO052N"));

        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new Mahasiswa(TEKNIK_INFORMATIKA, "Hanif", "231511048", 'B'));
        mahasiswaList.add(new Mahasiswa(TEKNIK_INFORMATIKA, "Ahmad", "231511041", 'B'));
        mahasiswaList.add(new Mahasiswa(TEKNIK_INFORMATIKA, "Naufal", "231511042", 'B'));
        mahasiswaList.add(new Mahasiswa(TEKNIK_INFORMATIKA, "Fikri", "231511043", 'B'));
        mahasiswaList.add(new Mahasiswa(TEKNIK_INFORMATIKA, "Udin", "231511044", 'B'));
        mahasiswaList.add(new Mahasiswa(TEKNIK_INFORMATIKA, "John", "231511045", 'B'));
        mahasiswaList.add(new Mahasiswa(TEKNIK_INFORMATIKA, "Doe", "231511046", 'B'));
        mahasiswaList.add(new Mahasiswa(TEKNIK_INFORMATIKA, "Alex", "231511047", 'B'));
        mahasiswaList.add(new Mahasiswa(TEKNIK_INFORMATIKA, "Bill", "231511049", 'B'));
        mahasiswaList.add(new Mahasiswa(TEKNIK_INFORMATIKA, "Ujang", "231511040", 'B'));

        ArrayList<MataKuliah> mataKuliahList = new ArrayList<>();
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2015", "Komputer Grafik", dosenList.get(0), TEORI));
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2015", "Komputer Grafik", dosenList.get(2), PRAKTIK));
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2013", "Pengantar RPL", dosenList.get(1), TEORI));
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2012", "Basis Data", dosenList.get(3), PRAKTIK));
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2014", "Aljabar Linear", dosenList.get(4), TEORI));
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2016", "Proyek 3: Web Development", dosenList.get(5), PRAKTIK));
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2012", "Basis Data", dosenList.get(8), TEORI));
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2011", "Pemrograman Berorientasi Objek", dosenList.get(9), TEORI));
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2011", "Pemrograman Berorientasi Objek", dosenList.get(9), PRAKTIK));
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2010", "Matematika Diskrit II", dosenList.get(10), TEORI));
        mataKuliahList.add(new MataKuliah(TEKNIK_INFORMATIKA, "21IF2013", "Pengantar RPL", dosenList.get(11), PRAKTIK));

        ArrayList<Jadwal> jadwalList = new ArrayList<>();
        jadwalList.add(new Jadwal(SENIN, mataKuliahList.get(0), "08.40-10.40", KELASD105, TEKNIK_INFORMATIKA));
        jadwalList.add(new Jadwal(SENIN, mataKuliahList.get(2), "10.40-12.20", KELASD105, TEKNIK_INFORMATIKA));
        jadwalList.add(new Jadwal(SENIN, mataKuliahList.get(1), "13.00-15.30", "D102-Lab. MT", TEKNIK_INFORMATIKA));
        jadwalList.add(new Jadwal("Selasa", mataKuliahList.get(3), "07.00-12.20", "D106-Lab. SDB", TEKNIK_INFORMATIKA));
        jadwalList.add(new Jadwal("Selasa", mataKuliahList.get(4), "13.00-14.40", "D101-Kelas", TEKNIK_INFORMATIKA));
        jadwalList.add(new Jadwal("Rabu", mataKuliahList.get(5), "07.00-16.40", KELAS116, TEKNIK_INFORMATIKA));
        jadwalList.add(new Jadwal(KAMIS, mataKuliahList.get(6), "07.00-08.40", KELASD105, TEKNIK_INFORMATIKA));
        jadwalList.add(new Jadwal(KAMIS, mataKuliahList.get(7), "08.40-10.40", KELASD105, TEKNIK_INFORMATIKA));
        jadwalList.add(new Jadwal(KAMIS, mataKuliahList.get(8), "10.40-13.50", KELAS116, TEKNIK_INFORMATIKA));
        jadwalList.add(new Jadwal(KAMIS, mataKuliahList.get(9), "13.50-16.40", "D108-Kelas", TEKNIK_INFORMATIKA));
        jadwalList.add(new Jadwal("Jumat", mataKuliahList.get(10), "07.50-14.40", KELAS116, TEKNIK_INFORMATIKA));

        boolean running = true;
        Scanner input = new Scanner(System.in);

        while (running) {
            tampilkanMenu();
            int opsi = input.nextInt();

            switch (opsi) {
                case 1:
                    tampilkanDosen(dosenList);
                    break;
                case 2:
                    tampilkanMahasiswa(mahasiswaList);
                    break;
                case 3:
                    tampilkanJadwal(jadwalList);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Pilih opsi yang sesuai!");
            }
        }
        input.close();
    }

    private static void tampilkanMenu() {
        System.out.println("1. Tampilkan Dosen");
        System.out.println("2. Tampilkan Mahasiswa");
        System.out.println("3. Tampilkan Jadwal");
        System.out.println("4. Keluar");
        System.out.print("Pilih opsi: ");
    }

    private static void tampilkanDosen(ArrayList<Dosen> dosenList) {
        System.out.printf("%nDaftar Dosen%n");
        System.out.printf("%-25s %-15s %-20s%n", "Nama", "Kode Dosen", "Jurusan");
        System.out.println("------------------------------------------------------------");
        for (Dosen dosen : dosenList) {
            System.out.printf("%-25s %-15s %-20s%n", dosen.getNama(), dosen.getKodeDosen(), dosen.getJurusan());
        }
    }

    private static void tampilkanMahasiswa(ArrayList<Mahasiswa> mahasiswaList) {
        System.out.printf("%nDaftar Mahasiswa%n");
        System.out.printf("%-15s %-13s %-8s %-15s%n", "Nama", "NIM", "Kelas", "Jurusan");
        System.out.println("--------------------------------------------------------");
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.printf("%-15s %-15s %-6c %-15s%n", mahasiswa.getNama(), mahasiswa.getNim(), mahasiswa.getKelas(), mahasiswa.getJurusan());
        }
    }

    private static void tampilkanJadwal(ArrayList<Jadwal> jadwalList) {
        System.out.printf("%nJadwal Perkuliahan%n");
        System.out.printf("%-10s %-15s %-10s %-35s %-12s %-12s %-23s %-20s %-20s%n",
                "Hari", "Jam", "Kode MK", "Mata Kuliah", "Jenis", "Kode Dosen", "Nama Dosen", "Ruangan", "Jurusan");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Jadwal jadwal : jadwalList) {
            System.out.printf("%-10s %-15s %-10s %-35s %-12s %-12s %-23s %-20s %-20s%n",
                    jadwal.getHari(),
                    jadwal.getJam(),
                    jadwal.getMatkul().getKodeMK(),
                    jadwal.getMatkul().getNamaMK(),
                    jadwal.getMatkul().getJenisPerkuliahan(),
                    jadwal.getMatkul().getDosenPengampu().getKodeDosen(),
                    jadwal.getMatkul().getDosenPengampu().getNama(),
                    jadwal.getRuangan(),
                    jadwal.getJurusan());
        }
    }
}
