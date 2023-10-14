package Jobsheet7;

import java.util.Scanner;

public class whileKelipatan13 {
    public static void main(String[] args) {
        
        Scanner input13 = new Scanner(System.in);

        int jumlah = 0, total, counter = 0, kelipatan;

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input13.nextInt();
        
        int i = 0;

        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        i++;
        }
         System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    }
}