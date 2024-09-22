package com.akademik.hirarki;

public class Jadwal extends Akademik {
    private String hari;
    private MataKuliah matkul;
    private String jam;
    private String ruangan;

    public Jadwal(String hari, MataKuliah matkul, String jam, String ruangan, String namaJurusan) {
        super(namaJurusan);
        this.hari = hari;
        this.matkul = matkul;
        this.jam = jam;
        this.ruangan = ruangan;
    }

    public String getHari() {
        return hari;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public String getJam() {
        return jam;
    }

    public String getRuangan() {
        return ruangan;
    }
}
