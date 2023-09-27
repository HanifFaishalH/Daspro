import java.util.Scanner;

public class Bank13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int Jml_Tabungan_Awal, lama_menabung;
        double jml_tabungan_akhir, bunga, prosentase_bunga = 0.02;
        
        System.out.print("Masukkan Nominal Tabungan Awal : ");
        Jml_Tabungan_Awal = sc.nextInt();
        System.out.print("Masukkan Lama Menabung : ");
        lama_menabung = sc.nextInt();

        bunga = lama_menabung*prosentase_bunga*Jml_Tabungan_Awal;

        jml_tabungan_akhir =  bunga + Jml_Tabungan_Awal;

        System.out.println("Bunga adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jml_tabungan_akhir);

    }
}