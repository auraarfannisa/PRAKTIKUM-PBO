/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanTutorial;

/**
 *
 * @author auraarfannisa
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    
    public Senjata (String bunyi){
        this.bunyi = bunyi;
    }
    
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    private String getBunyi(){
        return this.bunyi;
    }
    
    private void setMenusuk(){
        this.menusuk = true;
    }
    
    private boolean isMenusuk(){
        return menusuk;
    }
    
    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++){
            System.out.println(bunyi + " ");
        }
    }
    
    public void pasangBayonet(){
        setMenusuk();
        System.out.println("Bayonet Terpasang");
    }
    
    public void menusuk(){
        setMenusuk();
        System.out.println("Jleb!");
    }
}
