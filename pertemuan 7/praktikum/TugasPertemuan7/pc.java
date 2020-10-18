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
public class pc extends Komputer {
    public int ukuranMonitor;

    public pc(){

    }
    public pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("=================PC================");
        super.tampilData();
        System.out.println("Ukuran monitor      :"+ukuranMonitor);
    }

}

