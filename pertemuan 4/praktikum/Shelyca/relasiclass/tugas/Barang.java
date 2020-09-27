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
public class Barang {
    private String nama;
    private String merk;
    private int harga;
    
    Barang() {
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public String getNama() {
        return nama;
    }
    public String getMerk() {
        return merk;
    }
    public int harga() {
        return harga;
    }
    public int hitungHargaBarang(int jumlah) {
        return harga*jumlah;
    }
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Merk: " + this.merk + "\n";
        info += "Harga: " + this.harga + "\n";
        return info;
    }
}

