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
public class Dosen extends Pegawai{
 
    public int jumlahSKS;
    public int TARIF_SKS = 150000;
    
    Dosen(){
        
    }
    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    public void setSKS(int SKS){
        this.jumlahSKS = SKS;
    }
    public int getGaji(){
        int total_gaji = jumlahSKS*TARIF_SKS;
        return total_gaji+super.getGaji();
    }
    
}
