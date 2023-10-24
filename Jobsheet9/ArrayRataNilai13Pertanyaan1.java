package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai13Pertanyaan1 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0, rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();
       
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                System.out.println("Mahasiswa " + (i) + " Lulus");
            } else {
                System.out.println("Mahasiswa " + (i) + " Tidak lulus");
            }
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
    }
}