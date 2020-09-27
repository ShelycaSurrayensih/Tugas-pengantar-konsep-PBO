/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shelyca.relasiclass.percobaan1;

/**
 *
 * @author WIN10
 */
public class Processor {
     private String merk;
    private double cache;
    
    Processor() {
    }

    Processor(String merk, int cache) {
        this.merk = merk;
        this.cache = cache;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setCache(Double cache) {
        this.cache = cache;
    }
    public String getMerk() {
        return merk;
    }
    public double getCache() {
        return cache;
    }
    public void info() {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
     }
}
