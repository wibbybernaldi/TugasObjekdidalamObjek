package com.company.ObjekMemilikiObjek;

/**
 * Created by Wibby on 09/06/2015.
 */
public class TestBook {
    public static void main(String[] args) {
        author Ranma = new author("Ranmaru", "Malang", 'l');

        book book1 = new book();

        book1.setNamaBuku("Buku Bagus");
        book1.setHargaBuku(50000);
        book1.setJumlahStok(12);
        book1.setPenulis(Ranma);
        System.out.println(book1.toString());

        Ranma.setAlamat("Jl. Bromo No.691, Malang");
        book1.setHargaBuku(100000);
        System.out.println(book1.toString());
    }

}
