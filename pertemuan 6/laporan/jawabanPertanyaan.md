# PERTANYAAN PERCOBAAN 1
1.	Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!
Jawab :
Perbaikan yang dilakukan adalah : menambahkan kata kunci extends pada “ClassB”, sebagai child class.

<img src="p1.png">

2.	Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error! 
Jawab :
Penyebab program pada percobaan 1 ketika dijalankan terdapat error ialah, tidak adanya penggunaan kata kunci “extends” di dalam “ClassB”. Ini sangat mempengaruhi keberhasilan program pada percobaan 1. Sebab, di dalam percobaan 1 ini merupakan gambaran /implementasi “Inheritance” Java, dimana akan ada parent class dan child class yang akan saling berkaitan. Dimana child class(ClassB) akan mewarisi sifat/void yang ada di dalam parent class(ClassA) dan untuk mewarisi sifat/void ini sendiri child class wajib menggunakan kata kunci extends agar proses pewarisan sifat/void dapat terbaca oleh program. Namun, pada percobaan 1 ini “ClassB” tidak menggunakan kata kunci “extends” di dalamnya, hal inilah yang menyebabkan “ClassB” tidak dapat membaca variabel x dan y(merupakan variabel waris dari ClassA), sehingga berpengaruh juga pada “MainClass(Percobaan1)” yang pada akhirnya tidak mampu juga untuk membaca variabel x dan y yang dianggap asing oleh “ClassB”, serta method getNilai()(yang diwarisi dari “ClassA) pada “MainClass” juga tidak mampu terbaca.

#PERTANYAAN PERCOBAAN 2
1.	Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error!
Jawab :
Menghilangkan nilai private pada atribut x dan y, sebab ketika ClassB extends dengan ClassA, akan terjadi error pada method getJumlah(), jika atribut x dan y masih dalam keadaan private. Sebab, modifier private ini hanya akan bisa dibaca ketika ia dioperasikan di dalam class-nya sendiri, jika di dalam class lain tidak akan bisa(contohnya saja di dalam kasus ini).

<img src="p2a.png">
Menambahkan “extends” pada child class(ClassB) untuk membantu proses pewarisan sifat/void dari ClassA terhadap ClassB. Sehingg, dengan proses ini ClassB akan mampu membaca atribut x dan y.
<img src="p2b.png">
Perubahan diatas(dengan menambahkan extends) juga berpengaruh pada MainClass(Percobaan2), yang akhirnya mampu membaca atribut/variabel x dan y, serta method getNilai().
<img src="p2c.png">

2.	Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error! Jawab :
Pada dasarnya yang menjadi kunci permasalahan adalah sama dengna percobaan 1, yaitu tidak adanya penggunaan “extends” pada kelas child, yang menyebabkan kelas “ClassB” dan juga “Percobaan 2” tidak mampu membaca atribut x dan y,  serta method getNilai() pada kelas “Percobaan2”, yang pada dasarnya hasil waris dari parent class “ClassA”. Selain itu, error juga terjadi ketika atribut x dan y diberikan modifier “private” pada “ClassA”, dimana ketika terjadi extends antara “ClassB” dan juga “ClassA”, atribut x dan y tidak dapat diakses oleh “ClassB”, karena modifier-nya yang private ini.

#PERTANYAAN PERCOBAAN 3
1. Jelaskan fungsi “super” pada potongan program berikut di class Tabung!
Jawab :
Fungsi “super” pada potongan program dari “Class Tabung” diatas ialah, untuk merepresentasikan(mewakili) objek (phi dan r) dari parent class yaitu “Bangun”.
2. Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung!
Jawab :
Fungsi “super” dan “this” pada potongan program tabung diatas ialah, untuk membantu	merepresentasikan atau mewakili objek “phi dan r” dari parent class
“Bangun”(super) , sedangkan (this) berfungsi untuk merepresentasikan atau mewakili objek ”t” yang ada pada class “Tabung” itu sendiri.

3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class tersebut dapat mengakses atribut tersebut!
Jawab :
Sebab di dalam class “Tabung” ditemukan kata kunci “extands”, dimana kata kunci ini sendiri akan membantu pewarisan sifat/void/atribut dari parent class “Bangun” ke dalam child class “Tabung”, sehingga dengan begitu child class akan diberikan kebebasan untuk mengakses atribut yang ada di dalam parent class tanpa harus mendeklarasikannya satu-satu.
 

#PERTANYAAN PERCOBAAN 4
1.	Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya!
Jawab :
SuperClass
ClassA Alasan :
Sebab ClassA mewariskan behaviour/method default ke dalam ClassB sebagai child class.

SubClass
ClassB Alasan :
Sebab di dalam ClassB terdapat kata kunci “extends” yang menandakan bahwa ClassB ini mewarisi method default dari ClassA.
Berikut, bukti bahwa ClassB mewarisi behaviour dari ClassA:

ClassC Alasan :
Sebab di dalam ClassC terdapat kata kunci “extends” yang menandakan bahwa ClassC ini akan mewarisi behaviour yang ada di ClassB.
Berikut, bukti bahwa ClassC mewarisi behaviour yang terdapat di ClassB:

Dimana nantinya, secara otomatis ClassC akan mewarisi behaviour dari ClassB sekaligus behaviour ClassA yang sudah diwariskan ke dalam ClassB.

2. Ubahlah isi konstruktor default ClassC seperti berikut:
<img src="p4a.png">
Tambahkan kata super() di baris Pertama dalam konstruktor defaultnya. Coba jalankan kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya!
<img src="p4b.png">
3.	Ublah isi konstruktor default ClassC seperti berikut:
<img src="p4c.png">
Ketika mengubah posisi super() dibaris kedua dalam kontruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang.
Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output seperti berikut pada saat instansiasi objek test dari class ClassC.
<img src="p4d.png">

Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat! Jawab :
Urutan proses jalannya konstruktor saat objek test dibuat ialah :
1.	Konstruktor A diletakkan di dalam ClassA yang menjadi Super Class.
2.	Konstruktor B diletakkan di dalam ClassB yang menjadi child class, kemudian di dalam kelas yang sama yaitu ClassB akan mewarisi behaviour/constructor default dari ClassA dengan menggunakan kata kunci “extends”.
3.	Konstruktor C diletakkan di dalam ClassC yang juga menjadi child class di dalam program ini, selanjutnya di dalam ClassC juga akan ada proses pewarisan behaviour/constructor default A dan B, dengan cara menggunakan kata kunci “extends” untuk membantu mendeklarasikan proses pewarisan. Dimana dalam proses extends akan dilakukan antara ClassC dan ClassB(karena ClassB sendiri sudah menampung behaviour/constructor default A dan juga behaviour/constructor default B sendiri, sehingga dengan Class C extends dengan ClassB akan mempersingkat proses pewarisan tanpa harus mewarisi behaviour/constructor default A dari awal yaitu melalui SuperClass). Sehingga dengan begitu secara otomatis, ClassC akan menampung semua
 
behaviour/constructor default, yaitu behaviour/constructor default A, B, dan juga C sendiri.

4.	Ketika di Main Class yaitu “Percobaan4”, setelah objek test dari ClassC selesai dibuat didalamnya, kemudian Main Class akan dijalankan, maka output yang dikeluarkan akan menampilkan semua isi di masing-masing Class A, B, dan juga C, seperti dibawah ini :
<img src="p4d.png">

5. Apakah fungsi super() pada potongan program dibawah ini di ClassC!
Jawab	:
Fungsi super() pada potongan program diatas ialah, untuk memanggil constructor tanpa argumen dari superclass 
