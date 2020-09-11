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
  public class Mobil {
  private int harga,TahunProduksi;
  private String merek,warna,NoPlat;

  public void setHarga(int newValue) {
    harga = newValue;
  }

  public void setTahun(int newValue) {
    TahunProduksi = newValue;
  }

  public void setMerek(String newValue) {
    merek = newValue;
  }
  

  public void setwarna(String newValue) {
    warna= newValue;
  }


  public void setNomor(String newValue) {
    NoPlat =newValue;
  }
  public void info() {
    System.out.println("\n---------------------------------------");
    System.out.println("Nomor Mobil\t\t: " + NoPlat);
    System.out.println("warna Mobil\t\t: Rp." + warna);
    System.out.println("Tahun Produksi Mobil \t: " + TahunProduksi );
    System.out.println("Harga Mobil\t\t: " + harga );
    System.out.println("Merek Mobil\t\t: " + merek );
    System.out.println("---------------------------------------");
  }
}

