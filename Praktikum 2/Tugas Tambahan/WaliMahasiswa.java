// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Representasi class yang berisi program class WaliMahasiswa
// Tanggal  : 3 Maret 2024

public class WaliMahasiswa {
    // Atribut 
    private String nama;
    private String nomorHp;
    private String alamat;

    // Konstruktor
    public WaliMahasiswa(String nama, String nomorHp, String alamat){
        this.nama = nama;
        this.nomorHp = nomorHp; 
        this.alamat = alamat;
    }

    // Method
    public String getNama(){
        return this.nama;
    }

    public String getNomorHp(){
        return this.nomorHp;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorHp(String nomorHP){
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getWali() {
        return "Nama Wali: " + this.nama + "\nNomor HP: " + this.nomorHp + "\nAlamat: " + this.alamat;
    }
}
