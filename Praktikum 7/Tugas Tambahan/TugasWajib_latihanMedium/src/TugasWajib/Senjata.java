/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasWajib;

/**
 *
 * @author auraarfannisa
 */
public class Senjata {
    //Atribut
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    //Konstruktor
    public Senjata (String bunyi){
        this.bunyi = bunyi;
    }
    
    //Method    
    public String getBunyi(){
        return this.bunyi;
    }
    
    public int getPeluru(){
        return this.peluru;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(){
        this.menusuk = true;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }   
}

