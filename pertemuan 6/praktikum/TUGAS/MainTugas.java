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
public class MainTugas {
    public static void main(String[] args) {
     
        Dosen d1 = new Dosen();
        d1.setNama("Shelyca");
        d1.setSKS(22);
        
        Pegawai p1 = new Pegawai();
        p1.setNama("surrayensih");
        
        daftarGaji dg = new daftarGaji(5);
        dg.addPegawai(d1);
        dg.addPegawai(p1);
        dg.printSemuaGaji();
    } 
}
