// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Representasi class MGaris untuk mengaplikasikan program class Garis
// Tanggal  : 28 Februari 2024

public class MGaris {
    public static void main(String[] args){
        Garis garisX = new Garis(new Titik(1,2), new Titik(5,7));
        
        System.out.println("Titik awal garisX adalah: (" + garisX.getTitikAwal().getAbsis() + ", " + garisX.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir garisX adalah: (" + garisX.getTitikAkhir().getAbsis() + ", " + garisX.getTitikAkhir().getOrdinat() + ")");

        System.out.println("Panjang garisX adalah: " + garisX.getPanjang());

        System.out.println("Gradien garisX adalah: " + garisX.getGradien());
        
        Garis garisXRefleksiY = garisX.getRefleksiY();

        System.out.println("Titik awal garisX setelah refleksi terhadap sumbu Y adalah: (" + garisXRefleksiY.getTitikAwal().getAbsis() + ", " + garisXRefleksiY.getTitikAwal().getOrdinat() + ")");
        System.out.println("Titik akhir garisX setelah refleksi terhadap sumbu Y adalah: (" + garisXRefleksiY.getTitikAkhir().getAbsis() + ", " + garisXRefleksiY.getTitikAkhir().getOrdinat() + ")");

        Garis G = new Garis(new Titik(2, 4), new Titik(3, 6));
        if (garisX.isTegakLurus(G)){
            System.out.println("Apakah garisX dan G tegak lurus? " + true);
        }
        else{
            System.out.println("Apakah garisX dan G tegak lurus? " + false);
        }
    }
}
