package pbo1;
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