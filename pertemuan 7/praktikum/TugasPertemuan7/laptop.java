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
public class laptop extends Komputer{
    public String jnsBatrei;

    public laptop(){

    }
    public laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei=jnsBatrei;
    }
    public void tampilLaptop(){
        System.out.println("=================LAPTOP================");
        super.tampilData();
        System.out.println("Jenis baterai       : "+jnsBatrei);
    }
}