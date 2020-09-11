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
public class Praktikum_demo {
  public static void main(String[] args) {
    Alaskaki Alaskaki1 = new Alaskaki();
    highheels Alaskaki2 = new highheels();
    Sneakers Alaskaki3 = new Sneakers();
    Mobil Mobil1= new Mobil();
    Tas tas1 = new Tas();

    Alaskaki2.setJenis("Stiletto");
    Alaskaki2.settinggi(12);
    Alaskaki2.setMerek("PARAMEDINA");
    Alaskaki2.setHarga(500000);
    Alaskaki2.setJumlah(3);
    Alaskaki2.info();
    System.out.println("---------------------------------------");

    Alaskaki3.setSol("Rubber");
    Alaskaki2.setMerek("Bata");
    Alaskaki2.setHarga(450000);
    Alaskaki2.setJumlah(7);
    Alaskaki2.info();
    System.out.println("---------------------------------------");

    Mobil1.setMerek("AVANZA");
    Mobil1.setHarga(234000000);
    Mobil1.setwarna("silver");
    Mobil1.setTahun(2019);
    Mobil1.setNomor("B4478IS");
    Mobil1.info();

    tas1.setJenis("Sling bag");
    tas1.setWarna("Hitam");
    tas1.setHarga(2300000);
    tas1.info();
  }
}
