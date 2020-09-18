/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author WIN10
 */
public class TestKoperasi {
    public static void main(String[] args) {
        
        Anggota donny = new Anggota ("111333444","Donny",5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getlimitPinjaman());
        
        System.out.println("\nMeminjam uang 10.0000.000..");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: "+ donny.getjumlahPinjaman());
        
        System.out.println("\nMeminjam uang 4.0000.000..");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: "+ donny.getjumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(100000);
        System.out.println("Jumlah pinjaman saat ini: "+ donny.getjumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 3.0000.000..");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: "+ donny.getjumlahPinjaman());
    }
}