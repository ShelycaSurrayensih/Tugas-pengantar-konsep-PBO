/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_praktikum;

/**
 *
 * @author WIN10
 */
  public class highheels extends Alaskaki {
  private String JenisHak;
  private int tinggiHak;
  
  public void setJenis(String newValue){
   JenisHak= newValue;
  }
  public int settinggi(int newValue){
    tinggiHak = newValue;
    return tinggiHak;
  }
  public void info() {
    super.info();
    System.out.println("jenis hak\t\t: " + JenisHak);
    System.out.println("TinggiHak\t\t: " + tinggiHak);
    
  }
}

