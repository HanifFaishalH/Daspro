import java.util.Scanner;

public class PemilihanPercobaanNo113 {

    public static void main(String[] args) {
        
        Scanner input13 = new Scanner(System.in);

        System.out.println("Masukkan Angka : ");
        int angka = input13.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " bilangan genap");
        } else {
            System.out.println("Angka " + angka + " bilangan ganjil");
        } 
    }
}