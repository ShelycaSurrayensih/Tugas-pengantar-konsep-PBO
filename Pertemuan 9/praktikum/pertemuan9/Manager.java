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
public class Manager extends Karyawan{
    private double tunjangan;
    private String bagian;
    private Staff st[];
    
public void setTunjangan(double tunjangan)
{
    this.tunjangan=tunjangan;
}
public double getTunjangan()
{
    return tunjangan;
}
public void setbagian(String bagian)
{
    this.bagian=bagian;
}
public String getBagian()
{
    return bagian;
}
public void setStaff (Staff st[])
{
    this.st=st;
}
public void viewStaff()
{
int i;
System.out.println("---------------");
for(i=0;i<st.length;i++)
{
    st[i].lihatInfo();
}
    System.out.println("---------------");
}
public void lihatInfo()
{
    System.out.println("Manager :"+this.getBagian());
    System.out.println("NIP :"+this.getNip());
    System.out.println("Nama :"+this.getNama());
    System.out.println("Golongan :"+this.getgolongan());
    System.out.println("Tunjangan :%.Of\n"+this.getgaji());
    System.out.println("Gaji :%.Of\n"+this.getgaji());
    System.out.println("Bagian :"+this.getBagian());
    this.viewStaff();
}
public double getGaji()
{
    return super.getgaji()+tunjangan;
}
}
