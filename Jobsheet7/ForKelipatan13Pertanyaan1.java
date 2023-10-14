package Jobsheet7;

import java.util.Scanner;

public class ForKelipatan13Pertanyaan1 {
    public static void main(String[] args) {
        
        Scanner input13 = new Scanner(System.in);

        double jumlah = 0, total, counter = 0, kelipatan, average;
       
        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input13.nextDouble();
        
        for (int i = 1; i <=50 ; i++) {
            if ( i % kelipatan == 0) {
                jumlah += i;
                counter++;   
            }
        }
        average = jumlah / counter;

        System.out.println("Jumlah bilangan : " + jumlah);
        System.out.println("Banyak bilangan : " + counter);
        System.out.println("Rata-rata = " + average);
    }
}