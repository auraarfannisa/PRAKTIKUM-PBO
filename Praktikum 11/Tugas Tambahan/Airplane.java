public abstract class Airplane extends Vehicle implements IFlyer {
    //Atribut
    double maxLoad;

    //Konstruktor
    public Airplane(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    //Method
    public void takeOff() {
        System.out.println("Airplane is taking off");
    }
    public void land() {
        System.out.println("Airplane is landing");
    }
    public void fly() {
        System.out.println("Airplane is flying");
    }
}