Laporan Tuhas Jobsheet 2

1. nomer1.md

2. package pbo1;
public class peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int bayar;
    public int lamaSewa;
public void hasilPeminjaman(int a, String b, String c, int d, int e){
    id = a;
    namaMember = b;
    namaGame = c;
    harga = d;
    lamaSewa = e;

    System.out.println("Id : " + a);
    System.out.println("Nama Member : " + b);
    System.out.println("Nama Game : " + c);
    System.out.println("Harga : " + d);
    System.out.println("Lama Sewa : " + e + " /jam");
}
public int hargaBayar(int f, int g){
    lamaSewa = f;
    harga = g;
    bayar = lamaSewa * harga;

    System.out.println("Lama sewa : " + f + " /jam");
    System.out.println("Harga : " + harga);
    System.out.println();
    System.out.println("Harga yang harus dibayar : " + bayar);
    return bayar;
}
}

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
output:gambar2.md

3.
package pbo1;

public class lingkaran {
    double PHI;
    double r;
    
    double hitungLuas(){
        return PHI * r * r;
    }
    
    double hitungKeliling() {
        return PHI * (2*r);
    }
}


package pbo1;
import java.util.Scanner;
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
 output:gambar1.md

 4.
 package pbo1;
public class Barang {
    String kode;
    String namaBarang;
    int hargaDasar;
    float diskon;
    
    int hitungHargaJual() {
        int hargaDiskon = hargaDasar;
        diskon /= 100;
        hargaDiskon *= diskon;
        return hargaDasar - hargaDiskon;
    }
    void tampilData() {
        System.out.println("Data Barang");
        System.out.println("--------------------------------------");
        System.out.println("Kode Barang \t: " + kode);
        System.out.println("Nama Barang \t: " + namaBarang);
        System.out.println("Harga Dasar \t: Rp " + hargaDasar);
        System.out.println("Diskon \t\t: " + diskon + "%");
        System.out.println("Harga Jual \t: Rp " + hitungHargaJual());
        System.out.println("--------------------------------------");
    }
}


package pbo1;

public class BarangMain {

    public static void main(String[] args) {
        Barang b1 = new Barang();
        Barang b2 = new Barang();
        
        b1.kode = "304";
        b1.namaBarang = "Sepeda Motor";
        b1.hargaDasar = 5000000;
        b1.diskon = 10;
        b1.tampilData();
        
        b2.kode = "102";
        b2.namaBarang = "Mobil";
        b2.hargaDasar =25000000 ;
        b2.diskon = 35;
        b2.tampilData();
    }
}
output:gambar3.md
