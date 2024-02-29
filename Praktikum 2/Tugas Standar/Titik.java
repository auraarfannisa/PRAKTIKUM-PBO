// Nama     : Aura Arfannisa Az Zahra
// NIM      : 24060122130097
// Deskripsi: Representasi class yang berisi program class Titik
// Tanggal  : 28 Februari 2024

public class Titik{
    //Atribut
    private float absis;
    private float ordinat;
    static float counterTitik;

    //Konstruktor
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Overloading konstruktor Titik
    public Titik(float a, float o){
        this.absis = a;
        this.ordinat = o;
        counterTitik++;
    }

    public void setAbsis(float a){
        absis = a;
    }

    public void setOrdinat(float o){
        ordinat = o;
    }

    public float getAbsis(){
        return absis;
    }

    public float getOrdinat(){
        return ordinat;
    }

    public static float getCounterTitik(){
        return counterTitik;
    }

    public float getJarakPusat(){
        return (float) Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public void refleksiX(){
        this.ordinat = this.ordinat * (-1);
    }

    public void refleksiY(){
        this.absis =  this.absis * (-1);
    }

    public Titik getRefleksiX(){
        return new Titik(this.absis, -(this.ordinat));
    }

    public Titik getRefleksiY(){
        Titik t = new Titik(-(this.absis), this.ordinat);
        return t;
    }
}
