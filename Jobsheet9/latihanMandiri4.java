package Jobsheet9;

import java.util.Scanner;

public class latihanMandiri4 {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int[] angka = new int[8];
    double total = 0, average;

    for (int i = 0; i < angka.length; i++) {
        System.out.println("Masukkan angka ke -" + (i+1) + " = " );
        angka[i] = input.nextInt();
    }
    for (int i = 0; i < angka.length; i++) {
        total += angka[i];
    }
    average = total/angka.length;
    System.out.println("rata-rata bilangan = " + average);
    }
}
