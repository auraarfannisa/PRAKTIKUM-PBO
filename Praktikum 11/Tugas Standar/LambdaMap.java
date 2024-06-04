//File  : LambdaMap.java
//Deskripsi: Implementasi lambda pada Map, digunakan sebagai parameter pada method
//Nama  : Aura Arfannisa Az Zahra
//NIM   : 24060122130097

import java.util.*;

public class LambdaMap{
    public static void main(String[] args){
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(220001, "Rara");
        mahasiswaMap.put(220002, "Aura");
        mahasiswaMap.put(220003, "Arfannisa");
        mahasiswaMap.put(220004, "Az Zahra");

        //lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + ":" + nama));

        // for(Integer nim: HashMap.keySet()){
        //     i += key + HashMap.get(nim);
        // }
    }
}