public class Superman extends Kryptonian implements IFlyer {
    //Atribut
    private String name;
    
    //Konstruktor
    public Superman(String name) {
        this.name = name;
    }

    //Method
    //implementasi IFlyer
    public void takeOff() {
        System.out.println("Superman is taking off");
    }

    public void land() {
        System.out.println("Superman is landing");
    }

    public void fly() {
        System.out.println("Superman is flying");
    }

    //method tambahan
    public void leapBuilding() {
        System.out.println("Superman is leaping building");
    }

    public void stopBullet() {
        System.out.println("Superman is stopping bullet");
    }

    //implementasi Kryptonian
    public void eat() {
        System.out.println("Nasi Goreng");
    }

    public String getName() {   //method tambahan untuk mengembalilkan nama Superman
        return name;
    }
}