/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

/**
 *
 * @author WIN10
 */
    public class TanpaTC {
    public static void main(String[] args) {
        System.out.println("awal prgram");
        
        int x = 10;
        try{
            x = x / 0;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("eror karena pembagian nol");
            System.out.println(x);
            System.out.println("akhir prgram");
        }
    }
}

