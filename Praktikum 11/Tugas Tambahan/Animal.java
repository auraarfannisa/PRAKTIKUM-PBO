public abstract class Animal {
    //Atribut
    public abstract void eat(); //abstract makan

    //Method
    public String toString() {  //mengambalikan nama class sebagai string
        return this.getClass().getSimpleName();
    }
}