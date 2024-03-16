// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program penggunaan inheritance
// Tanggal  : 16 Maret 2024

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5, 4);

        persegiPanjang.printInfo();
        System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());

        Segitiga segitiga = new Segitiga(2, 5, 3);
        segitiga.printInfo();
        System.out.println("Luas segitiga: " + segitiga.hitungLuas());
    }
}
