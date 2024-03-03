// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Representasi class Main untuk mengaplikasikan program class Mahasiswa dan class WaliMahasiswa
// Tanggal  : 3 Maret 2024

public class Main {
    public static void main(String[] args) {
        // Objek WaliMahasiswa
        WaliMahasiswa wali = new WaliMahasiswa("Khadijah, S.Kom., M.Cs", "082222222222", "Bukit Cemara 10C");
        
        // Objek Mahasiswa (Cara 1)
        Mahasiswa mahasiswa = new Mahasiswa("Aura Arfannisa Az Zahra", "24060122130097", "Informatika", wali);
        
        System.out.println("=== Identitas Mahasiswa (1) ===");
        mahasiswa.cetak();

        // Objek Mahasiswa (Cara 2)                
        mahasiswa.setNama("Aura Arfannisa Az Zahra");
        mahasiswa.setNim("24060122130098");
        mahasiswa.setJurusan("Informatika");
                
        System.out.println("\n=== Identitas Mahasiswa (2) ===");
        mahasiswa.cetak();
        }
}
