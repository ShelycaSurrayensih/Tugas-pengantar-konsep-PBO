### LAPORAN PRAKTIKUM JOBSHEET 10 – ABSTRACT CLASS

## pertanyaan diskusi
Bolehkah apabila sebuah class yang meng-extend suatu abstract class tidak mengimplementasikan method abstract yang ada di class induknya? Buktikan!
Jawaban : Tidak boleh karena jika tidak mengimplementasikan method abstract yang ada di class induknya maka akan terjadi eror. Berikut buktinya :
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2010/Praktikum/laporan/output%20diskusi.PNG
" width=500px>

## Pertanyaan percobaan
1. Berikan penjelasan terkait tentang jalannya program diatas

Jawab : Program diatas menggunakan metode abstract class, dimana pada class Hewan terdapat method yang tidak ada isi nya atau method yang kosong yang hanya ada nama method nya saja. akan tetapi method abstract tersebut berfungsi sebagai deklarasi method umum yang nantinya akan digunakan pada class turunannya. Didalam class turunannya, method abstract tersebut akan diperjelas lagi mengenai isi dari method tersebut yang menggambarkan lebih spesifik dari objek class tersebut.

2. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika method bergerak() diubah menjadi method abstract!

Jawab :<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2010/Praktikum/laporan/1.PNG" width=500px>

3.Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika tidak dilakukan overriding terhadap method bergerak()

Jawab :<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2010/Praktikum/laporan/2.PNG" width=500px>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2010/Praktikum/laporan/3.PNG" width=500px>

#output program
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2010/Praktikum/laporan/4.PNG" width=500px>

Program akan error ketika dijalankan, karena jika class parent sudah dideklarasikan sebagai abstract class maka class turunannya harus memiliki method abstract yang sudah dideklrasikan di class parent atau di-override.

4. Tunjukkan hasil kompilasi program dan berikan penjelasan singkat jika abstract method bergerak() yang dideklarasikan dalam Class Ikan

Jawab :

Pada class Ikan akan ditambahkan method abstract bergerak();
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2010/Praktikum/laporan/5.PNG" width=500px>

Akan tetapi pada class Program terjadi notif error dikarenakan untuk class Abstract tidak dapat diinstansiasi .

<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2010/Praktikum/laporan/6.PNG" width=500px>


