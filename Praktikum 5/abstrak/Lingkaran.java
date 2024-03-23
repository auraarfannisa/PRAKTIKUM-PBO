// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program untuk menunjukkan class Lingkaran 
// Tanggal  : 23 Maret 2024

import static java.lang.Math.PI;

class Lingkaran implements IArea {
    // Atribut
    private double jejari;

    // Konstruktor
    public Lingkaran(double r){
        jejari = r;
    }

    // Method
    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
