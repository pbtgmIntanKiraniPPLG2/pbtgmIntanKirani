/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan7tugas2;
import java.util.Scanner; //Import library class Scanner
/**
 *
 * @author intan
 */
public class Pertemuan7tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputnya= new Scanner(System.in); //membuat a Scanner object
        System.out.print("Masukan Nim Anda : ");
        String nim = inputnya.nextLine(); //membaca input dari keyboard
        System.out.println("Nim : " + nim);
        
        System.out.print("Masukan Nama Anda : ");
        String nama = inputnya.nextLine();
        System.out.println("Nama : " + nama);
        
        System.out.print("Masukan Tahun : ");
        String tahun = inputnya.nextLine();
        System.out.println("Tahun : " + tahun);
        
        System.out.print("Masukan Pilihan Peminatan : ");
        String peminatan = inputnya.nextLine();
        System.out.println("Pilihan Peminatan : " + peminatan);
        
        int pilihan;
        char Peminatan = 'M';
       
 switch(Peminatan) {
     case 1:
         System.out.println("Bahasa Inggris, Matematika, Sain");
         break;
     case 2:
         System.out.println("Algoritma, Logika Informatika");
         break;
     case 'M':
        System.out.println("Pemrogaman Mobile, Pemrograman Java 2");
         break;

    }
    } 
}
