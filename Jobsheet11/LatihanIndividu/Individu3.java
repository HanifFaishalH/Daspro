package Jobsheet11.LatihanIndividu;

import java.util.Scanner;

public class Individu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Loop for rows
        for (int i = 1; i <= size; i++) {
            // Loop for columns
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("5");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close(); 
    }
}