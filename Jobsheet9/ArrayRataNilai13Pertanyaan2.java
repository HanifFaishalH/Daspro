package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai13Pertanyaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0, rata2, lls = 0, tdklls = 0, rata2lulus, rata2tdklulus;
        int llsCount = 0, tdkllsCount = 0;

        System.out.println("Masukkan jumlah mahasiswa = ");
        int jumMhs = input.nextInt();

        int[] nilaiMhs = new int[jumMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                llsCount++;
                lls += nilaiMhs[i];
            } else {
                tdkllsCount++;
                tdklls += nilaiMhs [i];
            }
        }
        rata2lulus = lls/llsCount;
        rata2tdklulus = tdklls/tdkllsCount;

        System.out.println("Rata-rata lulus = " + rata2lulus);
        System.out.println("Rata-rata tidak lulus = " + rata2tdklulus);
        
        input.close();
    }
}
