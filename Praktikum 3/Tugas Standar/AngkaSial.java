// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program penggunaan exception buatan sendiri
//            Pengenalan klausa 'throw' dan 'throws'
// Tanggal  : 6 Maret 2024

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main (String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!");
        }
    }
}

// 1. ketika eksepsi terjadi, baaris 12 pada AngkaSial.java tidak akan dieksekusi
// karena ketika method cobaAngka(13) dijalankan akan memenuhi kondisi if (angka == 13),
// sehingga akan dilemparkan exception AngkaSialException dan akan ditangkap di blok catch

// 2. ya, baris 21 akan dieksekusi ketika dilemparkan exception dan ditangkap
// oleh blok catch, contoh eksekusinya adalah ketika menjalankan method cobaAngka(13)
