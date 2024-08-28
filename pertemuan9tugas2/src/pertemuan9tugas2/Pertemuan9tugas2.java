/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan9tugas2;
import java.util.Scanner; //Import library class Scanner
/**
 *
 * @author intan
 */
public class Pertemuan9tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputnya= new Scanner(System.in); //membuat a Scanner object
        System.out.print("Masukan Bilangan Awal : ");
        String bilangan = inputnya.nextLine(); //membaca input dari keyboard
        System.out.println("Bilangan Awal : " + bilangan);
        
        System.out.print(" Masukan Bilangan Akhir ? ");
        String nilai = inputnya.nextLine();
        System.out.println("Masukan Akhir: " + nilai);
        
        int i=3;
do {
    System.out.println(i);
    i += 5;
} while (i < 1);
    
}
}