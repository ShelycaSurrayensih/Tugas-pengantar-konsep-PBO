/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author WIN10
 */
public class SepedaMotor extends Mesin{
   public Mesin mesin;
    private String merekMotor;
    
    SepedaMotor(String merekMotor, String mesin){
        this.merekMotor = merekMotor;
        super.merek = mesin;
    }
    public void setMerekMotor (String merekMotor){
        this.merekMotor = merekMotor;
    }
    public String getMerekMotor(){
        return merekMotor;
    }
    public String getMerekMesin(){
        return super.getMerek();
    }
    public void tambahKecepatanMotor(){
        super.tambahKecepatan();
    }
    public void kurangiKecepatanMotor(){
        super.kurangiKecepatan();
        
    }
    
}