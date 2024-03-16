// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program untuk menunjukkan class Segitiga yang mewarisi Poligon
// Tanggal  : 16 Maret 2024

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;
    
    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return (alas * tinggi) / 2;
    }

    public void printInfo(){
        System.out.println("Bangun segitiga bersisi " + this.getJumlahSisi());
    }
}
