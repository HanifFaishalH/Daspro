package Jobsheet11.LatihanIndividu;

import java.util.Scanner;

public class Individu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi segitiga: ");
        int panjangSisi = scanner.nextInt();

        // Loop untuk baris
        for (int i = panjangSisi; i >= 1; i--) {
            // Loop untuk kolom
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Pindah ke baris berikutnya setelah setiap baris
        }

        scanner.close();
    }
}
