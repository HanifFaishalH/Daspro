package Jobsheet4;
//pemrograman untuk penggajian
import java.util.Scanner;

public class Gaji13 {
    public static void main(String[] args) {
        
        //Deklarasi
        Scanner input = new Scanner(System.in);

        //Read : jmlMasuk, JmlTdkMasuk, TotGaji, gaji=40000, potGaji=25000
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji=40000, potGaji=25000;

        //Print "Angka Masuk Kerja"
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = input.nextInt();

        //Print "Angka Absen Kerja"
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
        JmlTdkMasuk = input.nextInt();

        //Print Gaji
        TotGaji = (jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);

        //Print : Total gaji yang diterima
        System.out.println("Gaji yang anda terima adalah : " + TotGaji);
    }
}