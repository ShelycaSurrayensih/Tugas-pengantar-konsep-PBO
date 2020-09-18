/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author WIN10
 */
public class Anggota {
    private String KTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    
    Anggota (String KTP,String nama,int limitPinjaman){
        this.KTP = KTP;
        this.nama= nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman =0;
    }
    public void setKTP(String KTP){
        this.KTP=KTP;
    }
    public void setNama(String nama){
        this.nama= nama;
    }
    public String getKTP(){
        return KTP;
    }
    public String getNama(){
        return nama;
    }
    public int getlimitPinjaman(){
        return limitPinjaman;
    }
    public int getjumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void pinjam(int uang){
        if(uang<10000000)
            jumlahPinjaman=uang;
 
        else{
            System.out.println("Maaf jumlah pinjaman melebihi limit");
        }
    }
    public void angsur(int uang){
           jumlahPinjaman -=uang;
    }

}
