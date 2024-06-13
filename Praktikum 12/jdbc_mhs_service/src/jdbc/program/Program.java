/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.util.*;
import jdbc.model.*;
import jdbc.service.MySQLMahasiswaService;

/**
 *
 * @author auraarfannisa
 */
public class Program {
    static MySQLMahasiswaService service = new MySQLMahasiswaService();

    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // insert
        System.out.println("===insert===");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        Mahasiswa mhsAdd2 = new Mahasiswa(4, "Happy");
        service.add(mhsAdd);
        service.add(mhsAdd2);
        System.out.println("Berhasil insert: " + mhsAdd);
        System.out.println("Berhasil insert: " + mhsAdd2);
        displayAll();

        // update
        System.out.println("===update===");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();

        // delete
        System.out.println("===delete===");
        System.out.println("Akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    public static void displayAll() {
        List<Mahasiswa> listmhs = service.getAll();
        System.out.println("===displayAll===");
        for (Mahasiswa mhs : listmhs) {
            System.out.println(mhs);
        }
    }
}
