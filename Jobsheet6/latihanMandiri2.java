package Jobsheet6;

import java.util.Scanner;;

public class latihanMandiri2 {
    public static void main(String[] args) {
        
        String buku, kamus, novel;
        int jumlahBuku;
        float Diskon;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jenis buku : ");
        buku = input.nextLine();
        System.out.println("Masukkan jumlah buku : ");
        jumlahBuku = input.nextInt();

        if (buku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2)
                System.out.println("Dapat diskon 10% + 2%");
            else
                System.out.println("Dapat diskon 10%");    
        }
        else if (buku.equalsIgnoreCase("novel"))
            if (jumlahBuku > 3) {
                System.out.println("Dapat diskon 7% + 2%");
            } else {
                System.out.println("Dapat diskon 7% + 1%");
            }
        else {
            if (jumlahBuku > 3) {
                System.out.println("Dapat diskon 5%");
            } else {
                System.out.println("Nggak dapat diskon hiya");
            }
        }
    }
}
