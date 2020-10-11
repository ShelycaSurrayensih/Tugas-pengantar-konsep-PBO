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
public class daftarGaji {
    public Pegawai[] listPegawai;
    public int jumlahPegawai = 0;
    
    public daftarGaji(int nPegawai){
        listPegawai = new Pegawai[nPegawai];
    }
    
    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawai] = p;
        jumlahPegawai++;
    }
    
    public void printSemuaGaji(){
        System.out.println("========== Daftar Gaji ==========");
        for (int i=0;i<jumlahPegawai;i++){
            System.out.print(listPegawai[i].getNama()+" = Rp ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}


