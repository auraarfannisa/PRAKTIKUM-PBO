// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program untuk menunjukkan class Persegi Panjang yang mewarisi Poligon
// Tanggal  : 16 Maret 2024

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun persegi panjang bersisi " + getJumlahSisi());
    }
}
