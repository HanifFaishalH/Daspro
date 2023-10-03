import java.util.Scanner;

public class Pemilihan2Percobaan113pertanyaan {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.println("Masukkan tahun : ");
        int tahun = input13.nextInt();

        if ((tahun % 4) == 0 && (tahun % 100) != 0 || tahun % 400 == 0) {
            System.out.println(tahun + " adalah tahun kabisat");
        } else {
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
}