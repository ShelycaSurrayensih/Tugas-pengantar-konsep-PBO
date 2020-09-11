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
public class SepedaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // buat dua buah objek sepeda
        
        sepeda spd1 = new sepeda();
        sepeda spd2 = new sepeda();
        sepedaGunung spd3 = new sepedaGunung();
        //panggil method didalam objek sepeda
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.cetakStatus();
        
        spd2.setMerek("wiim cycle");
        spd2.tambahKecepatan(10);
        spd2.gantigear(2);
        spd2.tambahKecepatan(10);
        spd2.gantigear(3);
        spd2.cetakStatus();
        
        spd3.setMerek("klinee");
        spd3.tambahKecepatan(5);
        spd3.gantigear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakStatus();
    }
}
    
