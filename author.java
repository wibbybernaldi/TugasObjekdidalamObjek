package com.company.ObjekMemilikiObjek;

/**
 * Created by Wibby on 09/06/2015.
 */
public class author {
    private String nama;
    private String alamat;
    private char jenisKelamin;

    public author(String nama, String alamat, char jenisKelamin) {
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return nama +
                "\n alamat = " + alamat +
                "\n jenisKelamin = " + jenisKelamin;
    }
}
