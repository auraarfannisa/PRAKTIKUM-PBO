public abstract class Vehicle {
    public abstract double calcFuelEfficiency();    //abstrak untuk menghitung efisiensi bahan bakar

    public abstract double calcTripDistance();      //abstrak untuk menghitung jarak perjalanan

    public String toString() {
        return this.getClass().getSimpleName();
    }
}