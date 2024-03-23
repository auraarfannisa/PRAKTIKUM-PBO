// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program untuk mengimplementasi class MBujurSangkar
// Tanggal  : 23 Maret 2024

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();

        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }   
}

// Kalau method abstrak itu gaada bodynya, jadi implementasi method hitungLuas-nya harus ada di class BujurSangkar, 
// kalau di class BujurSangkar gaada implementasi hitungLuas-nya maka bakal error
