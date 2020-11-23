/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quis2;

/**
 *
 * @author WIN10
 */
public class Majalah extends MediaInformasi {
@Override
    public void setJMLHalaman(int jml){
        System.out.println("Majalah ini memiliki : " + jml + " halaman");
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman"
                + " dari majalah tersebut : " + (jml + 2));
    }
    
    @Override
    public void reputasi(){
        System.out.println("Penerbit Majalah ini bereputasi!");
    }
}

