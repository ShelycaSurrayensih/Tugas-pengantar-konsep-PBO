/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shelyca.relasiclass.tugas;

/**
 *
 * @author WIN10
 */
public class Supplier {
    private String nama;
    private String alamat;
    private int biaya;
    
    Supplier() {
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public int getBiaya() {
        return biaya;
    }
    public int hitungBiayaSupplier(int jarak) {
        return biaya*jarak;
    }
     public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Alamat: " + this.alamat + "\n";
        info += "Biaya: " + this.biaya + "\n";
        return info;
     }
}
