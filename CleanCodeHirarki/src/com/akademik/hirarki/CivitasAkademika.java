package com.akademik.hirarki;

abstract class CivitasAkademika extends Akademik {
    private String nama;

    protected CivitasAkademika (String jurusan, String nama) {
        super(jurusan);
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}



