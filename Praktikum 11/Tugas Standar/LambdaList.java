//File  : LambdaList.java
//Deskripsi: Implementasi lambda pada List, digunakan sebagai parameter pada method
//Nama  : Aura Arfannisa Az Zahra
//NIM   : 24060122130097

import java.util.ArrayList;

public class LambdaList{
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Rara");
        mahasiswaList.add("Aura");
        mahasiswaList.add("Arfannisa");
        mahasiswaList.add("Az");
        mahasiswaList.add("Zahra");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}