package Jobsheet5;
import java.util.Scanner;

public class PemilihanPercobaan213Huruf {
    public static void main(String[] args) {
        
        Scanner input13 = new Scanner(System.in);

        System.out.println("Nilai UAS   : ");
        float uas = input13.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input13.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = input13.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input13.nextFloat();

        float total = ((uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f));
        
        if (total > 80) {
            System.out.println("Nilai IPK anda adalah : " + total + ". Nilai huruf anda A");}
        else if (total > 73) {
            System.out.println("Nilai IPK anda adalah : " + total + ". Nilai anda B+");}
        else if (total > 65) {
            System.out.println("Nilai IPK anda adalah : " + total + ". Nilai anda B");}
        else if (total > 60) {
            System.out.println("Nilai IPK anda adalah : " + total + ". Nilai anda C+");}
        else if (total > 50) {
            System.out.println("Nilai IPK anda adalah : " + total + ". Nilai anda C");}
        else if (total > 39) {
            System.out.println("Nilai IPK anda adalah : " + total + ". Nilai anda D");}
        else if (total <= 39) {
            System.out.println("Nilai IPK anda adalah : " + total + ". Nilai anda E");}
        }
    }


