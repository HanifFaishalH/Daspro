package Jobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan113pertanyaan2 {
    public static void main(String[] args) {
        
        Scanner input13 = new Scanner(System.in);

        System.out.println("Masukkan tahun : ");
        int tahun = input13.nextInt();

        if ((tahun % 4 ) == 0){
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                    System.out.println("tahun kabisat");
                } else {
                    System.out.println("Bukan tahun kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun kabisat");
        }
    }
}
