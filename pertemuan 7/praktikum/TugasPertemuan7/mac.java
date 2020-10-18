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
    public class mac extends laptop{
    public String security;

    public mac(){

    }
    public mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security=security;
    }
    public void tampilMac(){
        System.out.println("=================LAPTOP MAC================");
        super.tampilLaptop();
        System.out.println("Security            : "+security);
    }
}

