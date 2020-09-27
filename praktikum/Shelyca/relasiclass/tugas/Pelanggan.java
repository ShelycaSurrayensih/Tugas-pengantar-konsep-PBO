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
public class Pelanggan {
    private String nama;
    private int id;
    private String alamat;
    private Barang barang;
    private Supplier supplier;
    private int jumlah;
    
    Pelanggan() {       
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setid(int id) {
        this.id = id;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setBarang(Barang barang) {
        this.barang = barang;
    }
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
}
     public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public String getNama() {
        return nama;
    }
    public int getId() {
        return id;
    }
    public String getAlamat() {
        return alamat;
    }
    public Barang getBarang() {
        return barang;
    }
    public Supplier getSupplier() {
        return supplier;
    }
    public int getJumlah() {
        return jumlah;
    }
    public int hitungHargaTotal() {
        return barang.hitungHargaBarang(jumlah) + supplier.hitungBiayaSupplier(jumlah);
    }
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Id: " + this.id + "\n";
        info += "Alamat: " + this.alamat + "\n";
        return info;
    }
}

    
    

    

