package Jobsheet13;

import java.util.Scanner;

public class ucapanTerimaKasih_13Modif {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        String tambahan = UcapanTambahan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anithing.\n"+ tambahan);
    }
    public static String UcapanTambahan(){
        String tambahan = "You are the best";
        return tambahan;
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
    }
}