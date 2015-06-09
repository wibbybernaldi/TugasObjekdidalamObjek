package com.company.ObjekMemilikiObjek;

/**
 * Created by Wibby on 09/06/2015.
 */
public class book {
    private String namaBuku;
    private double hargaBuku;
    private int jumlahStok;
    private author penulis;

    public book() {
    }


    public book(String namaBuku, double hargaBuku, int jumlahStok) {
        this.namaBuku = namaBuku;
        this.hargaBuku = hargaBuku;
        this.jumlahStok = jumlahStok;
    }

    public book(String namaBuku, double hargaBuku, author penulis) {
        this.namaBuku = namaBuku;
        this.hargaBuku = hargaBuku;
        this.penulis = penulis;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public double getHargaBuku() {
        return hargaBuku;
    }

    public void setHargaBuku(double hargaBuku) {
        this.hargaBuku = hargaBuku;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public author getPenulis() {
        return penulis;
    }

    public void setPenulis(author penulis) {
        this.penulis = penulis;
    }

    @Override
    public String toString() {
        return "Buku" +
                "\n namaBuku = " + namaBuku +
                "\n hargaBuku = " + hargaBuku +
                "\n jumlahStok = " + jumlahStok +
                "\n penulis = " + penulis;
    }


}
