package pbo1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WIN10
 */
public class lingkaran {
    double PHI;
    double r;
    
    double hitungLuas(){
        return PHI * r * r;
    }
    
    double hitungKeliling() {
        return PHI * (2*r);
    }
}


