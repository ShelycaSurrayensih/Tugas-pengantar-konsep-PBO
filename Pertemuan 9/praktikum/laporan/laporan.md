## PERCOBAAN

### Percobaan 1

<blockquote>HASIL OUTPUT PERCOBAAN </blockquote>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%209/praktikum/img/outputPercobaan.PNG" width=500px>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%209/praktikum/img/outputPercobaan9.PNG" width=500px>


### Latihan
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%209/praktikum/img/latian1.PNG" width=500px>

1. Dari source coding diatas terletak dimanakah overloading?

   Jawab : Overloading terletak pada method perkalian dengan jumlah parameter yang berbeda.

2. Jika terdapat overloading ada berapa jumlah parameter yang berbeda?

   Jawab : Pada method pertama berparameter 2 sedangkan method kedua berparameter 3

<br>

<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%209/praktikum/img/latian2.PNG" width=500px>

1. Dari source coding diatas terletak dimanakah overloading?

   Jawab : Overloading terletak pada method perkalian dengan tipe parameter yang berbeda.

2. Jika terdapat overloading ada berapa tipe parameter yang berbeda?

   Jawab : Pada method pertama parameter bertipe int sedangkan method kedua parameter bertipe double

<br>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%209/praktikum/img/latian3.PNG" width=500px>

1. Dari source coding diatas terletak dimanakah overriding?

   Jawab : Overriding terletak pada method swim didalam class Piranha. Dimana method tersebut sama dengan method yang ada pada parent class nya yaitu Ikan.

2. Jabarkanlah apabila sourcoding diatas jika terdapat overriding?

   Jawab : Pada method swim didalam class Piranha mempunyai modifier dan tipe method yang sama dengan method swim yang ada didalam class Ikan, maka dari itu dinamakan overriding.

## Nomer 1
<blockquote>HASIL TUGAS OVERLOADING </blockquote>
## Code Program

> class Segitiga

```
package tugasPertemuan9;

/**
 *
 * @author WIN10
 */
public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        this.sudut = 180 - sudutA;
        return this.sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        this.sudut = 180 - (sudutA + sudutB);
        return this.sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA * sisiB * sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2)) + Math.sqrt(Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        System.out.println("Total Sudut dengan 1 parameter : " + segitiga.totalSudut(15));
        System.out.println("Total Sudut dengan 2 parameter : " + segitiga.totalSudut(15, 20));
        System.out.println("Keliling dengan 2 parameter : " + segitiga.keliling(10, 12));
        System.out.println("Keliling dengan 3 parameter : " + segitiga.keliling(4, 5, 6));
    }
}


> Output Program
<br>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%209/praktikum/img/tugas%20Overloading.PNG" width=500px>

### Nomor 2
<blockquote>HASIL TUGAS Overriding </blockquote>

## Code Program

> Class Manusia

```
package tugasPertemuan9;

/**
 *
 * @author Master
 */
public class Manusia {
    public void bernafas(){
        System.out.println("Manusia bernafas");
    }

    public void makan(){
        System.out.println("Manusia makan");
    }
}
```

> Class Dosen

```
package tugasPertemuan9;

/**
 *
 * @author Master
 */
public class Dosen extends Manusia{
    public void makan(){
        System.out.println("Dosen makan");
    }

    public void lembur(){
        System.out.println("Dosen lembur");
    }
}
```

> Class Mahasiswa

```
package tugasPertemuan9;

/**
 *
 * @author Master
 */
public class Mahasiswa extends Manusia{
    public void makan(){
        System.out.println("Mahasiswa makan");
    }

    public void tidur(){
        System.out.println("Mahasiswa tidur");
    }
}
```

> Class DemoManusia

```
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPertemuan9;

/**
 *
 * @author Master
 */
public class DemoManusia {
    public static void main(String[] args) {
        // Method dynamic dispatch
        Manusia manusia;

        manusia = new Manusia();
        manusia.makan();

        manusia = new Dosen();
        manusia.makan();

        manusia = new Mahasiswa();
        manusia.makan();

        System.out.println("======================");

        Manusia m = new Manusia();
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        infoManusia(m);
        infoDosen(dsn);
        infoMahasiswa(mhs);
    }

    public static void infoManusia(Manusia manusia){
        manusia.bernafas();
        manusia.makan();
    }

    public static void infoDosen(Dosen dosen){
        dosen.makan();
        dosen.lembur();
    }

    public static void infoMahasiswa(Mahasiswa mahasiswa){
        mahasiswa.makan();
        mahasiswa.tidur();
    }
}
```

> Output Program
<br>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%209/praktikum/img/tugas%20Overrinding.PNG" width=500px>
