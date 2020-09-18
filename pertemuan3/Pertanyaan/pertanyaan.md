JAWABAN PERTANYAAN JOBSHEET 3

PERTANYAAN PERCOBAAN 2
1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?
Karena kontak belum dinyalakan sehingga kontakOn masih bernilai false
2. Mengapa atribut kecepatan dan kontakOn diset private?
Agar pengguna class diluar class Motor tidak dapat mengubah nilai atribut dalam class Motor
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!
<img src="PERCOBAAN3.md">

PERTANYAAN PERCOBAAN 3 DAN 4

1. Apa yang dimaksud getter dan setter?
a. Getter ialah sebuah method yang digunakan untuk mengambil sebuah nilai/value dari suatu variable atau object.
b. Setter ialah sebuah method yang digunakan untuk memasukkan nilai/value ke dalam suatu variable/object.

2. Apa kegunaan dari method getSimpanan()?
Untuk mendapatkan nilai dari variable simpanan

3. Method apa yang digunakan untk menambah saldo?
Setor (float uang)

4. Apa yand dimaksud konstruktor?
Konstruktor adalah method khusus yang di eksekusi saat instansiasi sebuah objek

5. Sebutkan aturan dalam membuat konstruktor?
Aturan dalam membuat konstruktor :
a. Suatu konstruktor dapat di overload.
b. Default konstruktor diberikan oleh compiler java.
c. Default konstruktor tidak akan diberikan oleh compiler jika pada class tersebut sudah ada konstruktor.
d. Hanya compiler yang membuat default konstruktor.
e. Suatu konstruktor tidak dapat diwariskan(inherited).
f. Suatu konstruktor bisa memiliki acces modifer private.
g. Konstruktor default akan memiliki acces modifer yang sama dengan class-nya.\
h. Konstruktor default dari superclass akan dipanggil oleh konstruktor subclass-nya.
i. super() atau this() adalah pernyataan pertama yang harus dipanggil dalam konstruktor.

6. Apakah boleh konstruktor bertipe private?
Tidak boleh, karena akan membuat konstruktor tidak dapat di eksekusi pada saat instansiasi objek.

7. Kapan menggunakan parameter dengan passsing parameter?
a.	Pass by Value: Ketika membutuhkan pemberian Salinan nilai variable ke sebuah method
b.	Pass by reference: digunakan pasa saat pemberian alamat memori stack sebuah variable ke sebuah method

8. Apa perbedaan atribut class dan instansiasi atribut?
Atribut class adalah variable yang ada di dalam class, diluar method dan bertipe static, sedangkan instansiasi atribut adalah atribut yang ada di dalam kelas akan tetapi diluar method

9. Apa perbedaan class method dan instansiasi method?
Method class adalah kumpukan statement untuk melakukan proses tertentu dan bertipe static sedangkan instansiasi method adalah objek dari class yang harus diinstansiasi untuk mengakses method.

