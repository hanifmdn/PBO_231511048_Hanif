package com.akademik.hirarki;

public class Dosen extends CivitasAkademika {
    private String kodeDosen;

    public Dosen (String namaJurusan, String nama, String kodeDosen) {
        super(namaJurusan, nama);
        this.kodeDosen = kodeDosen;
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

}