public class Manajer extends Pegawai{
    private int tunjangan = 5000000;

    public Manajer(String nama){
        setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
    
}
