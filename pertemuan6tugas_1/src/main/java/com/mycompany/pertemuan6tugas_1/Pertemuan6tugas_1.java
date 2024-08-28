/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan6tugas_1;
 import java.util.Scanner; //Import library class Scanner
/**
 *
 * @author intan
 */
public class Pertemuan6tugas_1 {
    public static void main(String[] args) {
        Scanner inputnya= new Scanner(System.in); //membuat a Scanner object
        System.out.print("Masukan Nim Anda ? ");
        String nim = inputnya.nextLine(); //membaca input dari keyboard
        System.out.println("Nim ? : " + nim);
         
        System.out.print("Masukan Nama Anda: ");
        String nama = inputnya.nextLine();
        System.out.println("Nama: " + nama);

        System.out.print("Masukan Nilai Anda: ");
        
    /**
     *
     */
        /**
 * @param args the command line arguments
 */
 // TODO code application logic here
        int Nilai = 80;
        if(Nilai<50){ 
 System.out.println("Tidak Lulus "); 
 } 
 else if(Nilai>=50 && Nilai<60){ 
 System.out.println("grade D "); 
 } 
 else if(Nilai>=60 && Nilai<70){ 
 System.out.println("grade C "); 
 } 
 else if(Nilai>=70 && Nilai<80){ 
 System.out.println("grade B "); 
 } 
 else if(Nilai>=80 && Nilai<90){ 
System.out.println("grade A "); 
 }else if(Nilai>=90 && Nilai<100){ 
 System.out.println("grade A+"); 
    }
}
}


    
    