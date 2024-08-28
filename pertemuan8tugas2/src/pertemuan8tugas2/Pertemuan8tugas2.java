/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan8tugas2;
import java.util.Scanner; //Import library class Scanner
/**
 *
 * @author intan
 */
public class Pertemuan8tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mengambil input dari pengguna
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = scanner.nextInt();

        System.out.print("Tahun Awal ?: ");
        int tahunAwal = scanner.nextInt();

        // Menampilkan tahun-tahun dari tahun akhir hingga tahun awal
        System.out.println("Hasilnya:");
        for (int tahun = tahunAkhir; tahun >= tahunAwal; tahun--) {
            System.out.println(tahun);
        }
    }
    
}
