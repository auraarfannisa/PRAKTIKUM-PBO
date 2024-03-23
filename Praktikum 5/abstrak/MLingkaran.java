// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program untuk menunjukkan class MLingkaran
// Tanggal  : 23 Maret 2024

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        // Cara 1
        Lingkaran l1 = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan jejari 10.2 satuan adalah " + l1.hitungLuas());

        // Cara 2 (dengan scanner)
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nilai jejari lingkaran: ");
        double jejari = scan.nextDouble();

        Lingkaran l2 = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l2.hitungLuas());
    }
}
