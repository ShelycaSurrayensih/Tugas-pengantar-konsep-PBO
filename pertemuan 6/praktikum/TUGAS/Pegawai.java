/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author WIN10
 */
public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    
    Pegawai(){
        
    }
 
    Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getGaji(){        
        return 2500000;
    }
}
