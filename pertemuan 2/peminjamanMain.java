package pbo1;
import java.util.Scanner;
public class peminjamanMain {
public static void main(String[] args) {
        peminjaman pinjam = new peminjaman();
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
            
        System.out.print("Masukkan id : ");
        pinjam.id = sc.nextInt();
        System.out.print("Masukkan nama member : ");
        pinjam.namaMember = s.nextLine();
        System.out.print("Masukkan nama game : ");
        pinjam.namaGame = s.nextLine();
        System.out.print("Masukkan harga : ");
        pinjam.harga = sc.nextInt();      
        System.out.print("Berapa lama sewa : ");
        pinjam.lamaSewa = sc.nextInt();
                
        System.out.println();
        System.out.println("HASIL PEMINJAMAN");
        pinjam.hasilPeminjaman(pinjam.id, pinjam.namaGame, 
                    pinjam.namaGame, pinjam.harga, pinjam.lamaSewa);
        
        System.out.println();
        System.out.println("HARGA YANG HARUS DI BAYAR");
        pinjam.hargaBayar(pinjam.lamaSewa, pinjam.harga);        
    }
}