package com.akademik.hirarki;

public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private Character kelas;

    public Mahasiswa (String namaJurusan, String nama, String nim, Character kelas) {
        super(namaJurusan, nama);
        this.nim = nim;
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }



    public Character getKelas() {
        return kelas;
    }


}
