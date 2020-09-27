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
public class Laptop {
    private String merk;
    private Processor proc;
    
Laptop() {  
}

    Laptop(String merk, Processor p) {
     this.merk = merk;
     this.proc = p;
    }
public void setMerk(String merk) {
    this.merk = merk;
}
public void setProc(Processor p) {
        this.proc = p;
}
public void info() {
    System.out.println("Merk Laptop = " + merk);
    proc.info();
}
}


