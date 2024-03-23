// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program untuk menunjukkan class BangunDatar
// Tanggal  : 23 Maret 2024

public abstract class BangunDatar{
    // Atribut
    protected double luas;

    // Konstruktor
    public abstract double hitungLuas(double sisi);

    // Method
    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}