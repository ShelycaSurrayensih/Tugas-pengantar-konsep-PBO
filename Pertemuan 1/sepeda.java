/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author WIN10
 */
class sepeda {
    
    private String merek;
    private int kecepatan;
    private int gear;
    
    public void setMerek(String newValue)
    {
        merek = newValue;
    }
    
    public void gantigear(int newValue)
    {
        gear = newValue;
    }
    public void tambahKecepatan(int increment)
    {
      kecepatan=kecepatan+ increment;  
    }    
    public void cetakStatus()
    {
        System.out.println("merek: " +merek);
        System.out.println("kecepatan: " + kecepatan);
        System.out.println("Gear:" + gear);
    }

}
