/* Tipe Data Primitif: adalah tipe data dasar yang digunakan untuk menyimpan nilai sederhana.
byte: Tipe data untuk menyimpan nilai bilangan bulat 8-bit, rentangnya dari -128 hingga 127.
short: Tipe data untuk menyimpan nilai bilangan bulat 16-bit, rentangnya dari -32,768 hingga 32,767.
int: Tipe data untuk menyimpan nilai bilangan bulat 32-bit, rentangnya dari -2^31 hingga 2^31 - 1.
long: Tipe data untuk menyimpan nilai bilangan bulat 64-bit, rentangnya dari -2^63 hingga 2^63 - 1.
float: Tipe data untuk menyimpan nilai bilangan pecahan 32-bit.
double: Tipe data untuk menyimpan nilai bilangan pecahan 64-bit.
char: Tipe data untuk menyimpan satu karakter Unicode 16-bit.
boolean: Tipe data untuk menyimpan nilai kebenaran, yaitu true atau false.

contoh
int angka = 10;
double nilaiPecahan = 3.14;
char karakter = 'A';
boolean benar = true; */

public class ContohTipeData {
    public static void main(String[] args) {
        int angka = 10;
        double nilaiPecahan = 3.14;
        char karakter = 'A';
        boolean benar = true;

        System.out.println("Angka: " + angka);
        System.out.println("Nilai Pecahan: " + nilaiPecahan);
        System.out.println("Karakter: " + karakter);
        System.out.println("Benar: " + benar);
    }
}

/*
Tipe Data Objek: digunakan untuk menyimpan objek (instansiasi dari kelas). 
String: Tipe data untuk menyimpan teks.
Array: Tipe data untuk menyimpan sejumlah nilai dalam satu variabel.
Class: Tipe data untuk membuat objek dari suatu kelas.

contoh
String nama = "John";
int[] arrayAngka = {1, 2, 3, 4, 5};
Object objek = new Object();  // objek dari kelas Object */

public class ContohProgram {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        String nama = "John";
        
        // Deklarasi dan inisialisasi array
        int[] arrayAngka = {1, 2, 3, 4, 5};
        
        // Membuat objek dari kelas Object
        Object objek = new Object();

        // Menampilkan nilai variabel
        System.out.println("Nama: " + nama);

        // Menampilkan nilai array
        System.out.print("Array Angka: ");
        for (int angka : arrayAngka) {
            System.out.print(angka + " ");
        }
        System.out.println(); // Pindah ke baris baru

        // Menampilkan informasi objek
        System.out.println("Objek: " + objek.toString());
    }
}

