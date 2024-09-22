package com.akademik.hirarki;

public class MataKuliah extends Akademik {
    private String kodeMK;
    private String namaMK;
    private Dosen dosenPengampu;
    private String jenisPerkuliahan;

    public MataKuliah (String namaJurusan, String kodeMK, String namaMK, Dosen dosenPengampu, String jenisPerkuliahan) {
        super(namaJurusan);
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.dosenPengampu = dosenPengampu;
        this.jenisPerkuliahan = jenisPerkuliahan;
    }

    public String getKodeMK() {
        return kodeMK;
    }



    public String getNamaMK() {
        return namaMK;
    }



    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }



    public String getJenisPerkuliahan() {
        return jenisPerkuliahan;
    }


}
