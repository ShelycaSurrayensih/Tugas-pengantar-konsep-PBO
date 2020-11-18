/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu12;

/**
 *
 * @author WIN10
 */
public class Bayaran {
    public int hitungBayaran(Pegawai pg){
        int uang = pg.getGaji();
        if(pg instanceof Manager){
            uang +=((Manager)pg).getTunjangan();
        }
        else if(pg instanceof Programer){
            uang +=((Programer)pg).getBonus();
        }
        return uang;
    }
            
}
