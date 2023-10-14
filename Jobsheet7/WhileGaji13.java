package Jobsheet7;

import java.util.Scanner;

public class WhileGaji13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur = 0, totalGajiLembur = 0; 
        String jabatan;

        System.out.println("Masukkan jumlah karyawan : ");
        jumlahKaryawan = scanner.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + " : ");
            jabatan = scanner.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = scanner.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue;    
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }

            totalGajiLembur += gajiLembur;
        
        System.out.println("Total gaji lembur : " + totalGajiLembur);
        }
    }
}