public class Data<T extends Kupu> {
    //generic nya itu di <T> jadi punya parameter
    private T isi;

    public T getIsi(){
        return this.isi;
    }

    public void setIsi(T x){
        this.isi = x;
    }
}