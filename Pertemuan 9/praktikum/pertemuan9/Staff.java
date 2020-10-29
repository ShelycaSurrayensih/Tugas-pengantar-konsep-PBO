/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author WIN10
 */
public class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;
    
public void setLembur(int lembur)
{
    this.lembur=lembur;
}
public int getlembur()
{
return lembur;
}
public void setGajiLembur(double gajiLembur)
{
    this.gajiLembur=gajiLembur;
}
public double getGajiLembur()
{
    return gajiLembur;
}
public double getGaji(int lembur,double gajiLembur)
{
    return super.getgaji()+lembur*gajiLembur;
}
public double getGaji()
{
    return super.getgaji()+lembur*gajiLembur;
}
public void lihatInfo()
{
    System.out.println("NIP :"+this.getNip());
    System.out.println("NAMA :"+this.getNama());
    System.out.println("Golongan :"+this.getgolongan());
    System.out.println("Jml Lembur :"+this.getlembur());
    System.out.println("Gaji Lembur :%.Of\n"+this.getGajiLembur());
    System.out.println("Gaji :%.Of\n"+this.getGaji());
    }
}