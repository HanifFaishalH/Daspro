import java.util.Scanner;
// program menghitung keliling dan luas lingkaran

public class Lingkaran13 { 
    public static void main(String[] args){

        //deklarasi
        Scanner input = new Scanner(System.in);

        //Isi variabel
        
        //int : range; 
        //double : keliling, luas;
        //phi <- 3,14
        int range;
        double keliling, luas;

        //read (range); {diinput user}
        System.out.println("Masukkan nilai range : ");
        range = input.nextInt();

        //keliling <- 2*ranger*3.14;
        //luas <- 3.14*range*range;

        keliling = 2*range*3.14;
        luas = 3.14*range*range;

        //write (keliling, luas)
        System.out.println("Keliling adalah : " + keliling);
        System.out.println("Luas adalah : " + luas);
    }
}