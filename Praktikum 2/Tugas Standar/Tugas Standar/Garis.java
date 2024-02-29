// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Representasi class yang berisi program class Garis
// Tanggal  : 28 Februari 2024

public class Garis {
    // Atribut
    private Titik titikAwal;
    private Titik titikAkhir;

    // Konstruktor
    public Garis() {
        titikAwal = new Titik();
        titikAkhir = new Titik();
    }

    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    // Method
    public void setTitikAwal(Titik awal) {
        titikAwal = awal;
    }

    public void setTitikAkhir(Titik akhir) {
        titikAkhir = akhir;
    }

    public Titik getTitikAwal() {
        return this.titikAwal;
    }

    public Titik getTitikAkhir() {
        return this.titikAkhir;
    }

    public float getPanjang(){
        return (float) Math.sqrt(Math.pow((titikAkhir.getAbsis() - titikAwal.getAbsis()), 2) + Math.pow((titikAkhir.getOrdinat() - titikAwal.getAbsis()), 2));
    }

    public float getGradien(){
        return (float) (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis());
    }

    public Garis getRefleksiY(){
        float refleksiAwalAbsis = -(this.titikAwal.getAbsis());
        float refleksiAkhirAbsis = -(this.titikAkhir.getAbsis());
        
        Titik refleksiAwal = new Titik(refleksiAwalAbsis, this.titikAwal.getOrdinat());
        Titik refleksiAkhir = new Titik(refleksiAkhirAbsis, this.titikAkhir.getOrdinat());
        
        return new Garis(refleksiAwal, refleksiAkhir);
    }

    public boolean isTegakLurus(Garis G){
        // Menghitung gradien garis this
        float gradien = this.getGradien();

        // Menghitung gradien garis G
        float gradienG = G.getGradien();

        // Kondisi garis this vertikal (gradien tidak terdefinisi)
        if(Float.isInfinite(gradien)){
            return Math.abs(gradienG) < 1e-6;
        }
        
        // Kondisi garis G vertikal (gradien tidak terdefinisi)
        if(Float.isInfinite(gradienG)){
            return Math.abs(gradien) < 1e-6;
        }

        return Math.abs(gradien * gradienG + 1) < 1e-6;
    }
}

