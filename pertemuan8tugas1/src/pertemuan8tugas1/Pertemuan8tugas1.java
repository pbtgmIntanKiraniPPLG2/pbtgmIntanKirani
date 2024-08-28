/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan8tugas1;
import java.util.Scanner; //Import library class Scanner
/**
 *
 * @author intan
 */
public class Pertemuan8tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputnya= new Scanner(System.in); //membuat a Scanner object
        System.out.print("Nilai Awal ? ");
        String nilai = inputnya.nextLine(); //membaca input dari keyboard
        System.out.println("Nilai Awal : " + nilai);
        
        System.out.print("Nilai Akhir ? ");
        String nilai1 = inputnya.nextLine();
        System.out.println("Nilai Akhir: " + nilai1);
        
        int arr[]={5,10,15,20,25,30,35,40,45,50}; 
 //Printing array using for-each loop 
 for(int i:arr){
 System.out.println(i);
    }
    }
}
