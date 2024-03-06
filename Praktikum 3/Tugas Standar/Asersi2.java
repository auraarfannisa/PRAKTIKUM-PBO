// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol 
// Tanggal  : 6 Maret 2024

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert (jariJari > 0): "jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran (jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling Lingkaran = " + kelilingLingkaran);
    }
}

// Secara konsep, ada yang kurang tepat pada program Asersi2 di atas,
// yaitu pada line 20 jariJari diinisialisasi dengan nilai 0 namun diikuti 
// dengan sebuah asersi yang memeriksa bahwa nilai jariJari harus 
// lebih besar dari 0 sehingga asersi ini akan selalu gagal
// Solusi: inisialisasi jariJari dengan nilai lebih besar dari 0
