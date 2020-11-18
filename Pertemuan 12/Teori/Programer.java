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
public class Programer extends Pegawai{
    private int bonus;
    public Programer( String nama,int gaji,int bonus){
        super.nama = nama;
        super.gaji = gaji;
        this.bonus = bonus;
    }
    public int getGaji(){
        return gaji;
    }
    public int getBonus (){
        return bonus;
    }
}
