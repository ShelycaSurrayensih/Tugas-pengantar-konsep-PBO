/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPertemuan7;

/**
 *
 * @author WIN10
 */
    public class windows extends laptop{
    public String fitur;

    public windows(){

    }
    public windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur=fitur;
    }
    public void tampilWindows(){
        System.out.println("=================LAPTOP WINDOWS================");
        super.tampilLaptop();
        System.out.println("Fitur               : "+fitur);
    }
}

