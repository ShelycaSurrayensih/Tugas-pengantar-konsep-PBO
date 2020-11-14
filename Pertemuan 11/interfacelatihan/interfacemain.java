/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacelatihan;

import interfacelatihan.ICumlaude;
import  interfacelatihan.Mahasiswa;
import interfacelatihan.pascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;


public class interfacemain {
    public static void main (String[] args){
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana SarjanaCumlaude = new Sarjana("Dini");
        pascaSarjana masterCumlaude = new pascaSarjana("Elok");
        
        pakrektor.beriSertifikatCumlaude(SarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);                                                              
    }
}
