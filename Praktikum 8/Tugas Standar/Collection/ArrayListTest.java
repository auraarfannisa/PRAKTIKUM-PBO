//File : ArrayListTest.java
//Deskripsi : program penggunaan objek ArrayList sebagai Collection class

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        
        //menambah element
        strings.add("Praktikum");
        strings.add("Collection");
        strings.add("dan Generics");
        
        //menghapus elemen
        strings.remove("Praktikum");
        
        //iterasi pada keseluruhan ArrayList
        for(String s: strings){
            System.out.print(s + " ");
        }
    }
}

//nampilin key sama keysetnya sekaligus bisa pake entry.getKey dan getValue cari di ggl 
