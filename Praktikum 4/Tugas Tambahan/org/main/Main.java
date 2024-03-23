// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program yang merepresentasikan class Orang, Mahasiswa, dan WaliMahasiswa
// Tanggal  : 23 Maret 2024

package org.main; 

import org.orang.Orang;
import org.mahasiswa.Mahasiswa;
import org.waliMahasiswa.WaliMahasiswa;

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali1 = new WaliMahasiswa("Khadijah", "33060670", "0813888888", "Bukit Cemara No. 10C");
        Mahasiswa mahasiswa1 = new Mahasiswa("Aura", "33060680", "0813999999", "Kedokteran", wali1);

        System.out.println("Wali Mahasiswa:");
        wali1.cetak();

        System.out.println("\nMahasiswa:");
        mahasiswa1.cetak();

        // contoh penerapan inherintance
        System.out.println("\nNIM Mahasiswa: " + mahasiswa1.getNim());
        System.out.println("Jurusan Mahasiswa: " + mahasiswa1.getJurusan());
    }
}
