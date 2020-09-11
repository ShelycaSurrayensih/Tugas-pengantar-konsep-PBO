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
