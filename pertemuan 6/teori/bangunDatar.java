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
public class bangunDatar {
    
 public float luaspersegiPanjang(float p,float l){
     return p*l;
 }

 public float luassegiTiga(float a,float t){
        return (a*t)/2;
    }
 public float luaslingkaran(float r){
        return (float)3.14*r*r;
    }
 public float kelilingpersegiPanjang(float p,float l){
     return 2*(p+l);
 }

 public float kelilingsegiTiga(float a){
        return a+a+a;
    }
 public float kelilinglingkaran(float r){
        return (float)(2*3.14*r);
    }
}