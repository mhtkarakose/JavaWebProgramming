/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author mhtkarakose
 */
public class DBKatmani {
    
    private Connection conn;
    String dburl = "jdbc:derby://localhost:1527/abc";
    String user = "abc";
    String pass = "abc";
    
    public Connection baglan(){
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            System.out.println("basarili");
            conn = DriverManager.getConnection(dburl, user, pass);
              
        }catch(Exception e){
            System.out.println("sorun var");
        }
        return conn; 
    }
    
    public void kullaniciListesi(){
        if(conn==null){
            System.err.println("veritabani bagli değil baglaniyorum");
            baglan();
        }
        try{
            Statement stmt= conn.createStatement();
            ResultSet rs =stmt.executeQuery("select * from kullanici");
            System.out.println("kullanici adi \t  sire \t isim \t \telefon ");
            while(rs.next()){
                System.out.println(""+rs.getString(1)+" \t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
                
            }
        }catch(Exception e){
            e.printStackTrace();    
        } 
    }
    
    public boolean kullaniciKontrol(String kullaniciAdi, String sifre){
        if(conn==null){
            System.err.println("veritabani bagli değil baglaniyorum");
            baglan();
        }
        try{
            Statement stmt= conn.createStatement();
            ResultSet rs =stmt.executeQuery("select sifre from kullanici where adi='"+kullaniciAdi+"'");
            rs.next();
            return sifre.equals(rs.getString(1)) ;
            
        }catch(Exception e){
            e.printStackTrace();    
        }
        
        return false;
    }
    
    public static void main(String args[]){
        DBKatmani dbk = new DBKatmani();
        dbk.kullaniciListesi();
    }
    
    
    
    
}
