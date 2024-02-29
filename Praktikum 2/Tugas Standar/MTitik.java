// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Representasi class MTitik untuk mengaplikasikan program class Titik
// Tanggal  : 28 Februari 2024

public class MTitik {
    public static void main(String[] args){
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(3, 8);

        t1.setAbsis(5);
        t1.setOrdinat(7);
        t2.setAbsis(6);
        t2.setOrdinat(9);

        float absis;
        float ordinat;

        absis = t1.getAbsis();
        ordinat = t1.getOrdinat();
        System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);

        absis = t2.getAbsis();
        ordinat = t2.getOrdinat();
        System.out.printf("t2(%.1f, %.1f)\n", absis, ordinat);

        absis = t3.getAbsis();
        ordinat = t3.getOrdinat();
        System.out.printf("t3(%.1f, %.1f)\n", t3.getAbsis(), t3.getOrdinat());

        System.out.println("Jarak titik t1 terhadap titik pusat (0,0): " + t1.getJarakPusat());
        System.out.println("Jarak titik t2 terhadap titik pusat (0,0): " + t2.getJarakPusat());
        System.out.println("Jarak titik t3 terhadap titik pusat (0,0): " + t3.getJarakPusat());

        t2.refleksiY();
        t3.refleksiX();
        System.out.println("Koordinat t2 setelah refleksi thd sumbu y adalah: (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("Koordinat t3 setelah refleksi thd sumbu x adalah: (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        Titik t4 = t2.getRefleksiX();
        System.out.println("Koordinat t2 setelah direfleksi thd sumbu x adalah: (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");

        Titik t5 = t3.getRefleksiY();
        System.out.println("Koordinat t3 setelah direfleksi thd sumbu y adalah: (" + t5.getAbsis() + ", " + t5.getOrdinat() + ")");
    
    // Kesimpulan: 
    // Jika atribut diubah dari private ke public, maka atribut tersebut dapat diakses dari luar class Titik
    // Jika atribut diubah dari public ke private, maka atribut tersebut tidak dapat diakses dari luar class Titik dan hanya dapat diakses di dalam class titik
    // Jika konstruktor diubah dari public ke private, class tersebut tidak dapat diinstansiasi dari luar class Titik
    // Jika konstruktor diubah dari private ke public, kelas tersebut dapat diinstansiasi dari luar class Titik
    // Jika method diubah dari public ke private, method tersebut tidak dapat diakses dari luar class Titik
    // Jika method diubah dari private ke public, method tersebut dapat diakses dari luar class Titik
    }
}


