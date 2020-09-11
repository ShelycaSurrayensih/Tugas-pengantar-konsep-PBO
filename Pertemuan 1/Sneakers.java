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
   public class Sneakers extends Alaskaki {
  private String T_kelunturan,jenis_sol;

  public void setKelunturan(String newValue) {
    T_kelunturan= newValue;
  }

  public void setSol(String newValue) {
    jenis_sol = newValue;
  }
 public void info(){
        super.info();
        System.out.println("Tingkat kelunturan Sepatu :" + T_kelunturan);
        System.out.println("Jenis Sol Sepatu :" + jenis_sol);
       }
}
