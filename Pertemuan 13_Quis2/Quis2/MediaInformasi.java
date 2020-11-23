/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quis2;

/**
 *
 * @author WIN10
 */
public class MediaInformasi implements Penerbit {
 public int jmlHalaman;
    private int tahunSekarang;
    
    public int getTahunSekarang(int tahun){
        return tahunSekarang = tahun;
    }
    
    public void setJMLHalaman(int jml){
        this.jmlHalaman = jml;
    }
    
    @Override
    public void reputasi(){
        System.out.println("Penerbit Media Informasi ini bereputasi!");
    }

    @Override
    public void alamatPenerbit(String alamat) {
        System.out.println("Alamat penerbit : " + alamat);
    }

    @Override
    public void tahunBerdiri(int tahun) {
        System.out.println("Penerbit ini berdiri pada tahun : " + tahun + 
                            ", sehingga penerbit ini sekarang berusia : " 
                            + (tahunSekarang - tahun) + " tahun");
    }
}