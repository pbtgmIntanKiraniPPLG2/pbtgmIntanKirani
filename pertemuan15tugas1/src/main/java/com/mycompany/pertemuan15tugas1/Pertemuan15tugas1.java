package com.mycompany.pertemuan15tugas1;

/**
 * Class utama untuk menjalankan kalkulator
 */
public class Pertemuan15tugas1 {

    public static void main(String args[]) {
        kalkulator obj = new kalkulator();

        // Contoh pemanggilan metode pertambahan
        System.out.println("Pertambahan: " + obj.pertambahan(10, 20));

        // Contoh pemanggilan metode pengurangan
        System.out.println("Pengurangan: " + obj.pengurangan(20, 10));

        // Contoh pemanggilan metode pembagian
        System.out.println("Pembagian: " + obj.pembagian(20f, 5f));

        // Contoh pemanggilan metode perkalian
        System.out.println("Perkalian: " + obj.perkalian(10f, 5f));
    }
}
