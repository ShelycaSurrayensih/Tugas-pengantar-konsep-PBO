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
public class quisMain {
    public static void main(String[] args) {
        Pria p1 = new Pria();
        Pria p2 = new Pria();
        Wanita w1 = new Wanita();
        Wanita w2 = new Wanita();
        
        p1.setNama("Syafiq");
        p1.setUmur(14);
        
        w1.setNama("Shely");
        w1.setUmur(25);
        w1.setNamaSuami(p2);
        w1.setNamaAnak(p1);
        
        p2.setNama("rehan");
        p2.setUmur(28);
        p2.setNamaIstri(w1);
        
        w2.setNama("rahel");
        w2.setUmur(12);
        
        p1.info();
        w1.info();
        p2.info();
        w2.info();
    }
}
