/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.*;

/**
 *
 * @author auraarfannisa
 */
public class MySQLUtility {
    private static Connection koneksi; //deklarasi variabel koneksi bertipe Connection
    
    public static Connection getConnection(){
        if(koneksi == null){ 
            try{
                Class.forName("com.mysql.cj.jdbc.Driver"); //memuat driver MySQL
                String url = "jdbc:mysql://localhost:3307/pbo2";    //URL koneksi ke database
                String user = "root";   //username untuk koneksi ke database
                String password = "Aura@MySQL333887";   //password untuk koneksi ke database
                koneksi = DriverManager.getConnection(url, user, password); //membuat koneksi ke database
                
            } catch (ClassNotFoundException cne){   //exception jika driver tidak ditemukan
                System.out.println("Gagal load driver : " + cne.getMessage());  
            } catch (SQLException sqle){    //exception jika terjadi kesalahan koneksi
                System.out.println("Gagal koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
