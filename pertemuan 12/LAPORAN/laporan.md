# LAPORAN JOBSHEET 12 – POLIMORFISME
## Pertanyaan percobaan 1

1. Class apa sajakah yang merupakan turunan dari class Employee?
<br>Jawaban :Class InternshipEmployee dan Class PermanentEmployee.

2. Class apa sajakah yang implements ke interface Payable?
<br>Jawaban :class PermanentEmployee dan class ElectricityBill

3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi dengan objek pEmp (merupakan objek dari class PermanentEmployee)
dan objek iEmp (merupakan objek dari class InternshipEmploye) ?
<br>Jawaban :Karena kedua class tersebut merupakan class turunan dari class Employee.

4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi dengan objek pEmp (merupakan objek dari class
PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill) ?
<br>Jawaban :Karena kedua class tersebut menggimplemen dari class Payable.

5. Coba tambahkan sintaks:
p = iEmp;
e = eBill;
pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang menyebabkan error?
<br>Jawaban :

6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme!
<br>Jawaban :

## <blockquote>HASIL OUTPUT PERCOBAAN 2</blockquote>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2012/img/Output%20T2.PNG" width=500px>

## Jawaban Pertanyaan Percobaan 2
1. Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo() pada baris 10 menghasilkan hasil sama?
<br>Jawaban :

2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method invication), sedangkan
pEmp.getEmployeeInfo() tidak?
<br>Jawaban :

3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual?
<br>Jawaban :


## Jawaban Pertanyaan Percobaan 3
1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objekobjek dengan tipe yang berbeda, yaitu objek pEmp (objek dari
PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee) ?
<br>Jawaban :

2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek dengan tipe yang berbeda, yaitu objek pEmp (objek dari
PermanentEmployee) dan objek eBill (objek dari ElectricityBilling) ?
<br>Jawaban :

3. Perhatikan baris ke-10, mengapa terjadi error?
<br>Jawaban :


## <blockquote>HASIL OUTPUT PERCOBAAN 4</blockquote>
<img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2012/img/Output%20T4.PNG" width=500px>

## Jawaban Pertanyaan Percobaan 4
1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) bisa dilakukan,
padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter bertipe Payable?
Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill dan pEmp merupakan objek dari PermanentEmployee?
<br>Jawaban :

2. Jadi apakah tujuan membuat argument bertipe Payable pada method
pay() yang ada di dalam class Owner?
<br>Jawaban :

3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp);
Mengapa terjadi error?
<br>Jawaban :

4. Perhatikan class Owner, diperlukan untuk apakah sintaks p instanceof ElectricityBill pada baris ke-6 ?
<br>Jawaban :

5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana (ElectricityBill eb = (ElectricityBill) p)
diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke dalam objek eb yang bertipe ElectricityBill ?
<br>Jawaban :

## Laporan Tugas 
Output Program Tugas 
Berikut hasil output : <br><br><img src="https://github.com/ShelycaSurrayensih/Tugas-pengantar-konsep-PBO/blob/master/Pertemuan%2012/img/Output%20Tugas.PNG" width=500px>

