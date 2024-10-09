/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan10tugas_1;

/**
 *
 * @author intan
 */
public class Aritmatika3 {
    public int pengurangan(int a, int b) {
    return a - b;
    }

    //methode untuk perkalian
    public int perkalian(int a, int b) {
        return a * b ;
        }
    
    //methode untuk pembagian
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException ("Pembagi tidak boleh nol.");
        }
        return (double) a / b; 
    }
            
            //methode untuk pangkat
            public double pangkat(int a, int b) {
                return Math.pow(a, b);
            }
}
