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
public class Manager extends Pegawai{
    private int tunjangan;
    public Manager(String nama, int gaji,int tunjangan){
        super.nama = nama;
        super.gaji = gaji;
        this.tunjangan = tunjangan;
    }
    public int getGaji(){
        return gaji;
    }
    public int getTunjangan(){
        return tunjangan;
    }
}
