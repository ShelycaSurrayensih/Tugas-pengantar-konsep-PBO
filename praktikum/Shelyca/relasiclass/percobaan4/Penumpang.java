/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shelyca.relasiclass.percobaan4;

/**
 *
 * @author WIN10
 */
public class Penumpang {
    private String ktp;
    private String nama;
    
    Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }
    
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    
    public String getKtp() {
        return ktp;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
   public String info() {
       String info = "";
       info += "KTP : " + ktp + "\n";
       info += "Nama : " + nama + "\n";
       return info;
   }
   
}
