// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Representasi class yang berisi program class Mahasiswa
// Tanggal  : 3 Maret 2024

public class Mahasiswa{
    //Atribut
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    //Konstruktor
    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }
    
    // Method
    public String getNama(){
        return this.nama;
    }

    public String getNim(){
        return this.nim;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public WaliMahasiswa getWali(){
        return this.wali;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
        System.out.println("Data Wali Mahasiswa: \n" + this.wali.getWali());
    }
}
