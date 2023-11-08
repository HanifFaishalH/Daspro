package Jobsheet11;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai N : ");
        int N = input.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 0; i <= N; i++) {
                System.out.print("*");
            }
        System.out.println();
        }
        input.close();
    }
}