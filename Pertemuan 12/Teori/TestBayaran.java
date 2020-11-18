/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu12;

/**
 *
 * @author WIN10
 */
public class TestBayaran {
    public static void main(String[] args) {
        Manager man = new Manager("Agus",800, 50);
        Programer prog = new Programer("Budi",600,30);
        Bayaran hr = new Bayaran();
        System.out.println("Bayaran untuk manager: "+ hr.hitungBayaran(man));
        System.out.println("Bayaran untuk programer: " + hr.hitungBayaran(prog));
    }
}
