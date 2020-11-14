# LAPORAN JOBSHEET 11 – INTERFACE DALAM OOP JAVA
## Output Percobaan 2
<br><img src = "Output P1.JPG">
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
<br>Berikut gambar letak perubahan di class interface ICumlaude : <br><img src = "M1.JPG">
<br>Berikut gambar letak perubahan di class Rektor : <br><img src = "M2.JPG">
<br>Berikut gambar Output Modifikasi: <br><img src = "Modifikasi P1.JPG">

## Output Percobaan 2
<br><br><img src = "Output P2.JPG">
## Jawaban Pertanyaan Percobaan 2
1. Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar dibawah ini : <br>Dari perubahan script diatas, apa yang terjadi ? serta jelaskan alasannya (capture hasilnya)
<br>Jawaban : Terjadi eror karena aturan dalam struktur penulisan interface, modifier method yang diperbolehkan hanya public saja. Berikut hasil capturenya :<br><img src = "pertanyaan1_p2.JPG">

2. Perhatikan script code dibawah ini :<br>Jelaskan menurut anda, mengapa hasil dari script code tersebut error ? 
<br>Jawaban : karena classnya IBerprestasi adalah class interface jadi tidak bisa di instansisasi sama seperti class abstract.

3. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude. 
<br>Jawaban : Pada class Sarjana ditambahkan interface baru IBerprestasi dibelakang kata kunci implements. Lalu dengan cara yang sama seperti sebelumnya, kliklah ikon lampu peringatan untuk meng-generate semua method abstract dari interface IBerprestasi pada class Sarjana. Lakukan langkahnya sama seperti class PascaSarjana.
<br>Berikut gambar modifikasinya : <br><img src = "pertanyaan3_p2.JPG">


##  UML Class Diagram Tugas 
Berikut hasil UML dari deskripsi permasalahan pada tugas <br><br><img src = "UMLTugas.jpg">

## Laporan Tugas 
Output Program Tugas 
Berikut hasil output : <br><br><img src = "Output Tugas.JPG">







