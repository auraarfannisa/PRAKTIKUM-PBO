// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program penggunaan exception buatan sendiri
// Tanggal  : 10 Maret 2024

public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        Anggota anggota = new Anggota("Aura Arfannisa");
        Buku buku1 = new Buku("Teruslah Bodoh Jangan Pintar");
        Buku buku2 = new Buku("DUNE");
        Buku buku3 = new Buku("Majalah Bobo");
        Buku buku4 = new Buku("Jujutsu Kaisen"); 

        try {
            // TODO 4: Buat implementasi try-catch untuk handling exception pada saat melakukan peminjaman buku
            // Buat dua block catch: ketika anggota sudah meminjam buku lebih dari 3 dan ketika buku tidak tersedia/sudah dipinjam
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);
        }
        // Blok catch ketika anggota sudah meminjam buku lebih dari 3
        catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Blok catch ketika buku tidak tersedia/sudah dipinjam
        catch (BukuTidakTersediaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
