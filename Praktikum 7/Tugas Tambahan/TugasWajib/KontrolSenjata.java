/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasWajib;

/**
 *
 * @author auraarfannisa
 */
public class KontrolSenjata extends Senjata {
    // Atribut
    private Senjata senjata;

    // Konstruktor
    public KontrolSenjata(Senjata s) {
        super(s.getBunyi());
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(jumPeluru); 
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

public void menembak(int jumlah) {
    System.out.println(">> Siap menembak " + jumlah + " kali");
    if (isAdaPeluru()) {
        for (int i = 0; i < jumlah; i++) {
            if (senjata.getPeluru() > 0) { 
                System.out.println(senjata.getBunyi() + " ");
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, peluru habis");
//                break; // Menghentikan loop jika peluru habis
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    } else {
        System.out.println("Peluru habis");
    }
}


    public void menusuk() {
        senjata.setMenusuk();
        System.out.println("Jleb!");
    }

    public void pasangBayonet() {
        senjata.setMenusuk();
        System.out.println("Bayonet Terpasang");
    }
}

