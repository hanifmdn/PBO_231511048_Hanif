package com.akademik.hirarki;

abstract class Akademik {
    private String namaJurusan;

    protected Akademik(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public String getJurusan() {
        return namaJurusan;
    }

}
