package Jobsheet7;

import java.util.Scanner;

public class doWhileCuti13Pertanyaan4 {
        public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.println("Jatah cuti : ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi =  sc.nextLine();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari : ");
                jumlahHari = sc.nextInt();
                
                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    break;
                }
            } else if (konfirmasi.equalsIgnoreCase("t")){
                System.out.println("terimakasih");
                break;
            }
        } while (jatahCuti > 0);
    }
}