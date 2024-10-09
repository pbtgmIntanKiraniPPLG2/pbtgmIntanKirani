package com.mycompany.pertemuan15tugas1;

/**
 * Class kalkulator untuk operasi aritmatika
 */
public class kalkulator {

    // Method untuk pertambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk pembagian
    public float pembagian(float a, float b) {
        // Pastikan tidak ada pembagian dengan 0
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
        return a / b;
    }

    // Method untuk perkalian
    public float perkalian(float a, float b) {
        return a * b;
    }
}
