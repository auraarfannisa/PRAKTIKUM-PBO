/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author auraarfannisa
 */
public class Senjata {
    // Atribut
    private String bunyi;
    private int peluru;
    
    // Konstruktor
    public Senjata (String bunyi){
        this.bunyi = bunyi;
    }
    
    // Method
    public String getBunyi(){
        return this.bunyi;
    }
    
    public int getPeluru(){
        return this.peluru;
    }
    
public void menembak() {
    if (peluru > 0) {
        System.out.println(bunyi);
        peluru--; 
    } else {
        System.out.println("Peluru habis");
    }
    System.out.println("Sisa peluru: " + peluru);
}

    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}