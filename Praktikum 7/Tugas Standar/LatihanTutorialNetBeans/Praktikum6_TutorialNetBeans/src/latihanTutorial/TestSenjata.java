/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanTutorial;

/**
 *
 * @author auraarfannisa
 */
public class TestSenjata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        
        System.out.println("AK47 Menembak 3x: ");
        ak47.menembak(3);
        
        System.out.println("M16 Menembak 1x: ");
        m16.menembak(1);
        
        //System.out.println("AK47 menusuk: " + ak47.isMenusuk());
        ak47.pasangBayonet();
        //System.out.println("AK47 menusuk: " + ak47.isMenusuk());
    }
    
}

