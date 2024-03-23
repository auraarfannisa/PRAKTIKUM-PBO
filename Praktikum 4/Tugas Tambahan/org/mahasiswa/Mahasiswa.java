// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program yang menunjukkan class Mahasiswa
// Tanggal  : 23 Maret 2024

package org.mahasiswa;
import org.orang.Orang;
import org.waliMahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang{
    // Atribut
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    // Konstruktor
    public Mahasiswa (String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    // Method
    public String getNim(){
        return nim;
    }
    public String getJurusan(){
        return jurusan;
    }
    public WaliMahasiswa getWali(){
        return wali;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }
    public void cetak() {
        super.cetak();
        System.out.println("NIM: " + getNim());
        System.out.println("Jurusan: " + getJurusan());
    }
}
