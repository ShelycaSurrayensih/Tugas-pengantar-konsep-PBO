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
public class MultipleInterfaceMain {
    public static void main(String[] args) {
    Rektor pakRektor = new Rektor();
    
    Sarjana sarjanaCum = new Sarjana("Dini");
    pascaSarjana masterCum = new pascaSarjana("Elok");
    
    pakRektor.beriSertifikatMawapres(sarjanaCum);
    pakRektor.beriSertifikatMawapres(masterCum);
    }
}


