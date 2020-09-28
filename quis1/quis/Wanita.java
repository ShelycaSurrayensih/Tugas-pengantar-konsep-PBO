/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quis;

/**
 *
 * @author ASUS
 */
public class Wanita extends Manusia{
    private Pria Suami;
    private Manusia Anak;

    public Wanita() {
        
    }
    
    public Wanita(Pria namaSuami, Manusia namaAnak, int umur, String nama, boolean dewasa) {
        super(umur, nama, dewasa);
        this.Suami = namaSuami;
        this.Anak = namaAnak;
    }

    public Pria getNamaSuami() {
        return Suami;
    }

    public Manusia getNamaAnak() {
        return Anak;
    }

    public void setNamaSuami(Pria namaSuami) {
        this.Suami = namaSuami;
    }

    public void setNamaAnak(Manusia namaAnak) {
        this.Anak = namaAnak;
    }
    
    public void aturanUmur() {
        if (umur >= 20) {
            setDewasa(true);
            System.out.println("Dewasa : " + Dewasa());
            System.out.println("Dewasa dan memiliki Suami dan Anak");
            System.out.println("Nama Suami : " + Suami.getNama());
            System.out.println("Nama Anak : " + Anak.getNama());
        }
        else {
            setDewasa(false);
            System.out.println("Dewasa : " + Dewasa());
            System.out.println("Wanita ini masih kuliah");
        }
    }
    public void info() {
        super.info(); 
        aturanUmur();
        System.out.println("============================");
    }
}
