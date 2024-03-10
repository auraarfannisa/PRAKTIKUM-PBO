// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Representasi class yang berisi program class Buku
// Tanggal  : 10 Maret 2024

public class Buku {
    // Atribut
    private String judul;
    private boolean tersedia;

    // Konstruktor
    public Buku(String judul) {
        this.judul = judul;
        tersedia = true;
    }

    // Method
    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }
}
