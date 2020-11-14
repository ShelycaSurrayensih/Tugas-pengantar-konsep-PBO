/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

/**
 *
 * @author WIN10
 */
public class pascaSarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
        public pascaSarjana(String nama){
            super(nama);
        }
        @Override
        public void lulus(){
        System.out.println("Aku mahasiswa,Namaku Elok");
        System.out.println("Aku berkuliah di Kampus");
        System.out.println("Aku sudah menyelesaikan TESIS");
        }
        @Override
        public void meraihIPKTinggi(){
            System.out.println("IPK-ku lebih dari 3,71");
        }
          @Override
            public void menjuaraiKompetisi() {
            System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
        }
            @Override
            public void membuatPublikasiIlmiah() {
            System.out.println("Saya Menerbitkan artikel di jurnal INTERNASIONAL");
            }
}
