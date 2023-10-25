package Jobsheet9;

import java.util.Scanner;

public class latihanMandiri3 {
    public static void main(String[] args) {
        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor bulan (1-12): ");
        int nomorBulan = scanner.nextInt();

        if (nomorBulan >= 1 && nomorBulan <= 12) {
            System.out.println("Bulan yang Anda pilih adalah " + bulan[nomorBulan - 1]);
        } else {
            System.out.println("Nomor bulan tidak valid. Harap masukkan angka antara 1 dan 12.");
        }
    }
}
