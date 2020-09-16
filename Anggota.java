/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author WIN10
 */
public class Anggota {
    private String nama;
    private String alamat;
    private float Simpanan;
    
    Anggota(String nama,String alamat){
        this.nama = nama;
        this.alamat=alamat;
        this.Simpanan=0;
      }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public float getSimpanan(){
        return Simpanan;  
    }
    public void setor(float uang){
        Simpanan +=uang;
    }
    public void pinjam(float uang){
        Simpanan -=uang;
    }
}
