/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shelyca.relasiclass.tugas;

/**
 *
 * @author WIN10
 */
public class MainTugas {
    public static void main (String []args){
     Barang b = new Barang();
        b.setNama("Jaket");
        b.setMerk("Denim");
        b.setHarga(200000);
        System.out.println("********************* BARANG *********************");
        System.out.println(b.info());
        
        Supplier s = new Supplier();
        s.setNama("Onfact Store");
        s.setAlamat("Surakarta, Jawa Tengah");
        s.setBiaya(43000);
        System.out.println("******************* SUPPLIER *********************");
        System.out.println(s.info());
        
        Pelayan pelayan = new Pelayan("Ayu Indah", 18905, "Jalan Sumatra, Magetan");
        System.out.println("******************** PELAYAN *********************");
        System.out.println(pelayan.info());
        
        Order order = new Order(1109803, "20 Juli 2020", "Lunas", 0);
        System.out.println("********************* ORDER **********************");
        System.out.println(order.info());
        
        Pelanggan p = new Pelanggan();
        p.setNama("Jihan Andini");
        p.setid(19805);
        p.setAlamat("Jalan Sudirman Madiun");
        p.setBarang(b);
        p.setSupplier(s);
        p.setJumlah(10);
        System.out.println("******************* PELANGGAN ********************");
        System.out.println(p.info());
        
        System.out.println("******************* HARGA TOTAL *******************");
        System.out.println("Harga Total = " + p.hitungHargaTotal());
        System.out.println(p.getBarang().getMerk());
        
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>> SELESAI >>>>>>>>>>>>>>>>>>>>>>>");       
    }  
}
