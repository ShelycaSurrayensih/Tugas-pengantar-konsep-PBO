# LAPORAN JOBSHEET 11 – INTERFACE DALAM OOP JAVA
## <blockquote>HASIL OUTPUT PERCOBAAN 1</blockquote>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2011/img/Output%20P1.PNG" width=500px>
## Jawaban Pertanyaan Percobaan 1
1. Pada langkah ke 9, pada baris program ke 3 terdapat warning pada script tersebut. Jelaskan penyebab terjadinya hal tersebut ? 
<br>Jawaban : karena class interface ICumlaude yang berada pada satu package

2. Pada langkah ke 9, pada baris program ke 3. Apa yang terjadi jika script tersebut dihilangkan? Jelaskan menurut pemahaman anda. 
<br>Jawaban : Ketika baris program ke 3 dihilangkan, maka tidak terjadi eror dan output tetap seperti semula, hal tersebut terjadi karena baris kode yang dihilangkan adalah kode program yang unused sehingga meskipun dihilangkan tidak terjadi eror ataupun perubahan pada output program.

3. Mengapa pada langkah nomor 9 terjadi error? Jelaskan! 
<br>Jawaban : Terjadi eror karena objek mhsBiasa yang diinstansiasi dari class Mahasiswa belum di-implements pada class interface ICumlaude.

4. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian? 
<br>Jawaban :  Bisa karena class Sarjana merupakan class turunan dari class Mahasiswa jadi method yang ada didalamnya dapat digunakan oleh class Sarjana.

5. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?
<br>Jawaban : tidak bisa, Karena class Rektor bukan merupakan class turunan dari class Mahasiswa.

6. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini:
<br>Jawaban : Pada class interface ICumlaude ditambahi method public abstract void kuliahDiKampus(); kemudian pada class Rektor di method beriSertifikatCumlaude() ditambahi baris program mahasiswa.kuliahDiKampus();
<br>Berikut gambar letak perubahan di class interface ICumlaude : <br><img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2011/img/M1.JPG" width=500px>
<br>Berikut gambar letak perubahan di class Rektor : <br><img src="hhttps://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2011/img/M2.JPG" width=500px>
<br>Berikut gambar Output Modifikasi: <br><img src = <br><img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2011/img/Modifikasi%20P1.PNG" width=500px> 

## <blockquote>HASIL OUTPUT PERCOBAAN 2</blockquote>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2011/img/Output%20P2.PNG" width=500px>
## Jawaban Pertanyaan Percobaan 2
1. Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar dibawah ini : <br>Dari perubahan script diatas, apa yang terjadi ? serta jelaskan alasannya (capture hasilnya)
<br>Jawaban : Terjadi eror karena aturan dalam struktur penulisan interface, modifier method yang diperbolehkan hanya public saja. 

2. Perhatikan script code dibawah ini :<br>Jelaskan menurut anda, mengapa hasil dari script code tersebut error ? 
<br>Jawaban : karena classnya IBerprestasi adalah class interface jadi tidak bisa di instansisasi sama seperti class abstract.

3. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude. 
<br>Jawaban : Pada class Sarjana ditambahkan interface baru IBerprestasi dibelakang kata kunci implements. Lalu dengan cara yang sama seperti sebelumnya, kliklah ikon lampu peringatan untuk meng-generate semua method abstract dari interface IBerprestasi pada class Sarjana. Lakukan langkahnya sama seperti class PascaSarjana.
<br>Berikut gambar modifikasinya : 
<br><img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2011/img/pertanyaan3_p2.JPG" width=500px>


##  UML Class Diagram Tugas 
Berikut hasil UML dari deskripsi permasalahan pada tugas <br>
<br><img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2011/img/UMLTugas.jpg" width=500px>

## Laporan Tugas 
Output Program Tugas 
Berikut hasil output : <br><br><img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2011/img/Output%20Tugas.PNG" width=500px>







