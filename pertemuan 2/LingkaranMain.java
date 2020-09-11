package pbo1;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WIN10
 */
public class LingkaranMain {
    public static void main(String[] args) {
        lingkaran l1 = new lingkaran();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menghitung Luas dan Keliling Lingkaran");
        System.out.print("Masukkan nilai jari-jari = ");
        l1.r = sc.nextDouble();
        l1.PHI = 3.14;
        System.out.printf("Luas lingkaran = %.2f", l1.hitungLuas());
        System.out.println();
        System.out.printf("Keliling lingkaran = %.2f", l1.hitungKeliling());
        System.out.println();
    }
    
}


