public class AirPort {
    //Atribut
    Airplane airplane;
    String name;

    //Konstruktor
    public AirPort(String name) {
        this.name = name;
    }

    //Method
    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {    //jika objek flyer merupakan instance dr class Airplane
            return "Izin mendarat diberikan";
        } else {
            return "Izin mendarat ditolak";
        }
    }
}
