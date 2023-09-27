//Kode untuk pembayaran barang
import java.util.Scanner;
//Buat Class
public class HargaBayar13 {
    public static void main(String[] args){
        
        //Deklarasi Variabel
        Scanner input = new Scanner(System.in);
        int harga, jumlah;
        double total, bayar, jmlDis, diskon;

        //Input harga barang
        System.out.println("Masukkan Harga Barang : ");
        harga = input.nextInt();

        //Input Jumlah Barang
        System.out.println("Masukkan jumlah barang yang dibeli : ");
        jumlah = input.nextInt();

        //Input diskon (Pakai double karena pakai desimal)
        System.out.println("Masukkan jumlah diskon");
        diskon = input.nextDouble();
        
        //membuat rumus untuk Bayar
        total = harga*jumlah;
        jmlDis = total*diskon;
        bayar = total-jmlDis;

        //Print bayar
        System.out.println("Diskon yang anda dapatkan adalah : " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah : " + bayar);

    }
}