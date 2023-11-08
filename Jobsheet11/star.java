package Jobsheet11;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai N : ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("*");
        }
        input.close();
    }
}
