/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6Teori;

/**
 *
 * @author WIN10
 */
public class MainBangunDatar {
    public static void main(String[] args) {
        persegiPanjang pp = new persegiPanjang();
        segiTiga st = new segiTiga();
        lingkaran lk = new lingkaran();
        
        System.out.println("----------persegi panjang----------");
        pp.p = 7;
        pp.l=6;
        System.out.println("luas persegi panjang:"+pp.luaspersegiPanjang(pp.p, pp.l));
        System.out.println("keliling persegi panjang "+pp.kelilingpersegiPanjang(pp.p,pp.l));
        System.out.println("");

        System.out.println("----------Segitiga----------");
        st.a = 12;
        st.t=9;
        System.out.println("luas segitiga:"+st.luassegiTiga(st.a, st.t));
        System.out.println("keliling segitig :"+st.kelilingsegiTiga(st.a));
        System.out.println("");
        
        System.out.println("----------lingkaran----------");
        System.out.println("");
        lk.r=15;
        System.out.println("luas lingkaran:"+lk.luaslingkaran(lk.r));
        System.out.println("keliling lingkarang: "+lk.kelilinglingkaran(lk.r));
        System.out.println("");
    }
}
