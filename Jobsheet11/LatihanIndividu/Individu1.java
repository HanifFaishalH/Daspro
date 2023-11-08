package Jobsheet11.LatihanIndividu;

import java.util.Scanner;

public class Individu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        // Loop for rows
        for (int i = 1; i <= height; i++) {
            // Loop for spaces
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Loop for asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println(); // Move to the next line after each row
        }
        scanner.close();
    }
}
