package Jobsheet5;
import java.util.Scanner;

public class PemilihanPercobaan113Ternary {

    public static void main(String[] args) {
        
        Scanner input13 = new Scanner(System.in);

        System.out.println("Masukkan Angka : ");
        int angka = input13.nextInt();

        String result = (angka % 2 == 0) ? "Bilangan genap" : "Bilangan Ganjil";
        System.out.println(result);
    }
}