/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veri;

/**
 *
 * @author mhtkarakose
 */
public class Kisi {
     private String isim;
     private String sifre;
    
    public Kisi(){ // constructor
        System.out.println("kişi objesi oluşturuldu");
    }
    
    public boolean sifreKontrol(){
        DBKatmani dbk = new DBKatmani();
        return dbk.kullaniciKontrol(isim, sifre);
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the sifre
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
}
