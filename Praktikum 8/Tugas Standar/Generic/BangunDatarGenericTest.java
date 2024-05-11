// package Praktikum 8;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        //objek BangunDatarGeneric dengan tipe data Lingkaran
        bdg.set(l);
        System.out.println("keliling lingkaran: " + bdg.hitungKeliling());
        System.out.println("tipe generic: " + bdg.get().getClass().getName());

        Persegi p = new Persegi(5);
        BangunDatarGeneric<Persegi> bdg2 = new BangunDatarGeneric<Persegi>();
        bdg2.set(p);
        System.out.println("keliling persegi: " + bdg2.hitungKeliling());
        System.out.println("tipe generic: " + bdg2.get().getClass().getName());
    }
}
