// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program untuk menunjukkan asersi
// Tanggal  : 6 Maret 2024

public class Asersi1 {
    public static void main(String[] args){
        int x = -8;
        if (x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert (x < 0): "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}

// asersi akan selalu dievaluasi sebagai benar, karena x 
// selalu kurang dari 0 pada blok else. jadi, ketika asersi diaktifkan, 
// program akan mencetak "x bilangan negatif" pada konsol.

// jika asersi dinonaktifkan, pernyataan assert akan diabaikan, 
// dan program akan mencetak "x bilangan negatif" tanpa memeriksa asersi.