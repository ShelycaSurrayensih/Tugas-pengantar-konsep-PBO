/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan7;

import java.util.Scanner;
 import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class Inheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        System.out.println("=================Program Tampil Spek Komputer================");
        System.out.println("1. Laptop Mac");
        System.out.println("2. Laptop Windows");
        System.out.println("3. Pc");
        System.out.println("4. Exit");
        System.out.print("pilih : ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                mac m = new mac();
                System.out.print("Masukan Merk : ");
                m.merk=input.next();
                System.out.print("Masukan Prosessor " + m.merk + " : ");
                m.kecProsesor = input.nextInt();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
        pc pc = new pc("ASUS", 3, 6, "Inter core i5", 15);
        pc.tampilPc();

        mac mac = new mac("MacBook", 4, 8, "Quad-core i7", "Polimer", "Private internet access");
        mac.tampilMac();

        windows windows = new windows("HP", 3, 6, "Intel core i7", "Li-ion", "Ai");
        windows.tampilWindows();
    }
}

