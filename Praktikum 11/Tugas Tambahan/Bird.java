public class Bird extends Animal implements IFlyer {
    //implementasi IFlyer
    public void takeOff() {
        System.out.println("Bird is taking off");
    }

    public void land() {
        System.out.println("Bird is landing");
    }
    
    public void fly() {
        System.out.println("Bird is flying");
    }

    //implementasi Animal
    public void eat() {
        System.out.println("Makanan Burung");
    }
}