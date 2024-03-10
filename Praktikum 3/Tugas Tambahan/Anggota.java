// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Representasi class yang berisi program class Anggota serta penggunaan eksepsi menggunakan throw dan catch
// Tanggal  : 10 Maret 2024

public class Anggota {
    // Atribut
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    // Konstruktor
    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }
    
    // Method
    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        // TODO 2: Buat kondisi untuk mencegah jumlah buku yang dipinjam melebihi 3 dengan throw keyword
        if (jumlahBukuPinjaman >= 3) {
            throw new MaksimumBukuTerpinjamException("Anggota sudah mencapai batas maksimum peminjaman buku");
        }
        // TODO 3: Buat kondisi untuk mencegah buku yang tidak tersedia dipinjam dengan throw keyword
        if (!buku.isTersedia()) {
            throw new BukuTidakTersediaException("Buku tidak tersedia untuk dipinjam");
        }
    
        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }
    
}