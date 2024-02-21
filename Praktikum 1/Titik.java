public class Titik{
    //Atribut
    float absis;
    float ordinat;
    static float counterTitik;

    //Konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // Overloading konstruktor Titik
    Titik(float a, float o){
        this.absis = a;
        this.ordinat = o;
        counterTitik++;
    }

    void setAbsis(float a){
        absis = a;
    }

    void setOrdinat(float o){
        ordinat = o;
    }

    float getAbsis(){
        return absis;
    }

    float getOrdinat(){
        return ordinat;
    }

    static float getCounterTitik(){
        return counterTitik;
    }
}