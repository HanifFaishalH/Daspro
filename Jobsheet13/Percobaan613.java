package Jobsheet13;

import java.util.Scanner;

public class Percobaan613 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,a,v;

        System.out.println("Masukkan panjang: ");
        p = input.nextInt();
        System.out.println("Masukkan Lebar: ");
        l = input.nextInt();
        System.out.println("Masukkan tinggi: ");
        t = input.nextInt();
        input.close();

        a = hitungLuas(p, l);
        System.out.println("Luas persegi : "+a);

        v = hitungVolume(t, p, l);
        System.out.println("Volume balok : " + v);
    }
    static int hitungLuas (int p, int l){
        int a = p*l;
        return a;
    }
    static int hitungVolume (int t, int p, int l){
        int v = hitungLuas(p, l)*t;
        return v;
    }
}
