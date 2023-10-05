package Jobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan213modifikasi {
    public static void main(String[] args) {
        
        Scanner input13 = new Scanner(System.in);

        Float totalsudut;

        System.out.println("Masukkan besar sudut 1 : ");
        Float sudut1 = input13.nextFloat();
        System.out.println("Masukkan besar sudut 2 : ");
        Float sudut2 = input13.nextFloat();
        System.out.println("Masukkan besar sudut 3 : ");
        Float sudut3 = input13.nextFloat();

        totalsudut = sudut1 + sudut2 + sudut3;

        if (totalsudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90)
                System.out.println("Segitiga siku-siku");
            else if (sudut1 >= 90 || sudut2 >= 90 || sudut3 >= 90)
                System.out.println("Segitiga tumpul");
        } else {
            System.out.println("Segitiga lancip");
        }
    }
}