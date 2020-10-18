LAPORAN JOBSHEET 7
A. <blockquote>HASIL OUTPUT PERCOBAAN 1</blockquote>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/pertemuan%207/laporan/outputPercobaan1.PNG" width=500px>

Output yang dihasilkan berupa data Manager dan data Staff dengan menggunkan objek manager dan staff pada class main, yang mana kedua objek tersebut berasal dari class yang merupakan turunan dari class Karyawan sehingga class Menager dan Staff di extends pada class karyawan. Pada class Manager terdapat tambahan data tunjangan, sedangkan pada class Staff terdapat tambahan data lembur dan potongan. Untuk selebihnya datanya sama dengan data di class Karyawan.

B. JAWABAN PERTANYAAN PERCOBAAN 1
1.Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!
Jawaban : Class Karyawan merupakan super class dari Class Manager dan Staff, sedangkan class Manager dan Staff merupakan sub class dari class Karyawan

2.Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?
Jawaban : Di dalam Java untuk mendeklarasikan suatu class sebagai subclass dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi nama class, kemudian diikuti dengan nama parent class-­­nya. Kata kunci extends tersebut memberitahu kompiler Java bahwa kita ingin melakukan perluasan class. Berikut contoh penerapannya : public class B extends A {........}

3.Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!
Jawaban :
a. Atribut yang dimiliki oleh class Manager : tunjangan
b. Atribut yang diwarisi dari class Karyawan : nama, alamat, jk, umur, gaji

4.Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager!
Jawaban : Kata kunci super tersebut digunakan untuk memanggil atribut gaji pada super class (Karyawan)

5.Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya!
Jawaban : Termasuk inheritance Hierarchical karena sebuah class memiliki lebih dari satu class turunan (subclass) atau dengan kata lain, lebih dari satu sub class memiliki kelas induk yang sama. Dapat dilihat bahwa class Karyawan memiliki 2 subclass, yaitu Manager dan Staff. Dengan demikian, class Manager dan Staff memiliki superclass yang sama yaitu class Karyawan, dan ada kemungkinan kedua class subclass tersebut memiliki atribut dan behaviour yang sama dari class Karyawan.

C. <blockquote>HASIL OUTPUT PERCOBAAN 2</blockquote>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/pertemuan%207/laporan/outputPercobaan2.PNG" width=500px>

Output yang dihasilkan berupa data Staff Tetap dan Staff Harian dengan menggunakan objek StaffTetap dan StaffHarian pada class main, yang mana kedua class tersebut berasal dari class yang merupakan turunan dari class Staff sehingga class StaffTatap dan StaffHarian di-extends pada class Staff. Pada class StaffTetap terdapat tambahan atribut golongan dan asuransi, sedangkan di class StaffHarian terdapat atribut tambahan jmlJamKerja. Untuk selebihnya datanya sama dengan data di class Staff yang di-extends pada class Karyawan sehingga data pada clas Karyawan juga termasuk.

D. JAWABAN PERTANYAAN PERCOBAAN 2
1.single inheritance manager , multilevel inheritance staf karena class staf awalnya subclass mempunyai subsclass lagi yaitu staf harian dan staf tetap sehingga class staf menjadi superclass dari staf tetap dan staf harian.
2.yang diwarisi oleh staf adalah nama,alamat,jk,umur,gaji,lembur,potongan dan untuk atribut sendiri staftetap mempunyai atribut golongan dan asuransi sedangkan staf harian mempunyai atribut jmljamkerja.
3.untuk memanggil konstruktor pada staf.
4.untuk merujuk method tampildatastaff pada class staf.
5.karena pada konstruktor staftetap sudah merujuk konstruktor staff dengan extends maka jika sudah rujuk menggunakan super maka class tersebut bisa meakses atribut yang sudah terextends maupun super.
E. TUGAS
<blockquote>HASIL OUTPUT Tugas</blockquote>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/pertemuan%207/laporan/outputTugas.PNG" width=500px>

Output yang dihasilkan ada 3 data yaitu data Laptop Mac, Laptop Windows, dan PC dengan menggunakan objek pada main class. class mac dan Windows merupakan turunan dari class laptop dengan menggunakan extends sehingga sebagian datanya diambil dari data laptop. Dikarenakan class Laptop juga turunan dari class Komputer dengan menggunakan extends, maka datanya juga diambil dari class computer. Untuk class Pc merupakan turunan dari class Komputer, maka untuk datanya juga diambil dari class Komputer.
