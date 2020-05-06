/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4parkirmotor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Yusuf
 */
public class koneksi {
    public static Connection getKoneksi (String host, String port, String username, String password, String db){
         String konString = "jdbc:mysql://" + host + ":" + port + "/" + db;
         Connection koneksi = null;
         Statement stat;
         try{
             Class.forName("com.mysql.jdbc.Driver");
             
             koneksi = DriverManager.getConnection(konString,username, password); 
             stat = koneksi.createStatement();
             System.out.println("Koneksi Berhasil");
         }catch (Exception ex){
             
             ex.printStackTrace();
             
             JOptionPane.showMessageDialog(null, "Koneksi Database ERROR!!!");
             koneksi = null;
         }
         return koneksi;
         
     }
}
