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
public class Pria extends Manusia{
    private Wanita Istri;

    public Pria() {
        
    }
    
    public Pria(Wanita namaIstri, int umur, String nama, boolean dewasa) {
        super(umur, nama, dewasa);
        this.Istri = namaIstri;
    }

    public void setNamaIstri(Wanita namaIstri) {
        this.Istri = namaIstri;
    }

    public Wanita getNamaIstri() {
        return Istri;
    }
    
    public void aturanUmur() {
        if (umur >= 22) {
            setDewasa(true);
            System.out.println("Dewasa : " + Dewasa());
            System.out.println("Dewasa dan memiliki istri");
            System.out.println("Nama Istri : " + Istri.getNama());
        }
        else {
            setDewasa(false);
            System.out.println("Dewasa : " + Dewasa());
            System.out.println("Pria ini masih kuliah");
        }
    }
    public void info() {
        super.info(); 
        aturanUmur();
        System.out.println("============================");
    }
}
