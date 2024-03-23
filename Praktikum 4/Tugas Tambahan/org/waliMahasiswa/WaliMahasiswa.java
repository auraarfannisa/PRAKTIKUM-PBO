// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program yang menunjukkan class WaliMahasiswa
// Tanggal  : 23 Maret 2024

package org.walimahasiswa;
import org.orang.Orang;

public class WaliMahasiswa extends Orang {
    // Atribut
    private String nomorHp;
    private String alamat;

    // Konstruktor
    public WaliMahasiswa (String nama, String nik, String nomorHp, String alamat){
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    // Method
    public String getNomorHp(){
        return nomorHp;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setNomorHp (String nomorHp){
        this.nomorHp = nomorHp;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void cetak(){
        super.cetak();
        System.out.println("Nomor HP: " + getNomorHp());
        System.out.println("Alamat: " + getAlamat());
    }
    
}