package Jobsheet11;

import java.util.Scanner;

public class nestedLoop_NIM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double nim[][] = new Double[5][7];

        for (int i = 0; i < nim.length; i++) {
            System.out.println("Kota ke- " + i + " ");
            for (int j = 0; j < nim.length; j++) {
                System.out.println("Hari ke- " + (i+1) +" : ");
                nim[i][j] = input.nextDouble();
            }
            System.out.println();
        }
        for (int i = 0; i < nim.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": "); 
            for (int j = 0; j < nim[0].length; j++) { 
                System.out.print(nim[i][j] + " "); 
            }
            System.out.println();
        }
    }
}
