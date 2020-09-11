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
public class Alaskaki {
  private String Merek;
  private int Harga,Jumlah;

  public void setMerek(String newValue) {
    Merek = newValue;
  }
  public void setJumlah(int newValue) {
    Jumlah = newValue;
  }
  public void setHarga(int newValue) {
    Harga = newValue;
  }
  public void info() {
    System.out.println("\n---------------------------------------");
    System.out.println("Merek\t\t\t: " + Merek);
    System.out.println("Jumlah Barang\t\t: " + Jumlah);
    System.out.println("Harga Barang\t\t: " + Harga);
     }
}

