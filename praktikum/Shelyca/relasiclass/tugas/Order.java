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
public class Order {
    private int id;
    private String tanggal;
    private String status;
    private int sisa_pembayaran;
    
    Order() {
    }
    
    Order(int id, String tanggal, String status, int sisa_pembayaran) {
        this.id = id;
        this.tanggal = tanggal;
        this.status = status;
        this.sisa_pembayaran = sisa_pembayaran;
    }
    public void setId(int id) {
        this.id = id;
    } 
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    public void setStatus(String status) {
        this.status = status;
    }
     public int setSisa_pembayaran(int sisa_pembayaran) {
        return sisa_pembayaran;
     }
    public int getId() {
        return id;
    }
    public int getSisa_pembayaran() {
        return sisa_pembayaran;
    }
    public String getTanggal() {
        return tanggal;
    }
    public String getStatus() {
        return status;
    }
    public String info() {
        String info = "";
        info += "id: " + this.id+ "\n";
        info += "tanggal: " + this.tanggal+ "\n";
        info += "status: " + this.status+ "\n";
        info += "sisa_pembayaran: " + this.tanggal+ "\n";
        return info;
    }
}
