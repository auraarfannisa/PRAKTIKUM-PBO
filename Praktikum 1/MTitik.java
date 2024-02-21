public class MTitik {
    public static void main(String[] args){
        Titik t1;
        Titik t2;

        //Membuat objek dengan new Titik()
        t1 = new Titik();
        t2 = new Titik();

        t1.setAbsis(5);
        t1.setOrdinat(7);
        t2.setAbsis(6);
        t2.setOrdinat(9);

        //Variabel Penampung
        float counterTitik;
        float absis;
        float ordinat;

        counterTitik = Titik.getCounterTitik();
        // Kalau formatnya pake + pake println
        System.out.println("Jumlah objek titik: " + counterTitik);

        absis = t1.getAbsis();
        ordinat = t1.getOrdinat();
        // Kalau formatnya gini pake printf
        System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);

        absis = t2.getAbsis();
        ordinat = t2.getOrdinat();
        System.out.printf("t2(%.1f, %.1f)\n", absis, ordinat);

        // System.out.println("Koordinat titik t1: (" + t1.getAbsis() + t1.getOrdinat() + ")" );
        // System.out.println("Koordinat titik t2: (" + t2.getAbsis() + t2.getOrdinat() + ")");
    }

}