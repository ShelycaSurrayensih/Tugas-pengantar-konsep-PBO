package Pertemuan3;
import java.util.Scanner;
public class modifTestKoperasi {
    public static void main(String[] args){
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getlimitPinjaman());
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
        System.out.println ("\n===== PILIHAN MENU =====");
        System.out.println ("1. Meminjam Uang");
        System.out.println ("2. Membayar Angsuran");
        System.out.println ("3. Keluar");
        System.out.print ("Masukkan menu anda --> ");
        pilih =sc.nextInt();
        switch(pilih) {
            case 1 :
                System.out.print("Masukkan nominal : ");
                int pinjam = sc.nextInt();
                System.out.println("\nMeminjam uang "+ pinjam);
                donny.pinjam(pinjam);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getjumlahPinjaman());
            break;
            case 2 :
                System.out.print("Masukkan nominal : ");
                int angsur = sc.nextInt();
                System.out.println("\nMembayar angsuran "+ angsur);
                donny.angsur(angsur);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getjumlahPinjaman());
            break;
            case 3 :
                System.out.println("Program Telah Selesai");
            break;
            default :
                System.out.println("Maaf, pilihan yang Anda masukkan salah!");
        }
        }while (pilih < 3);
    }
}
