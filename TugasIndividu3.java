import java.util.Scanner;

public class TugasIndividu3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a, b, c;
        double d, x1, x2;

        System.out.println("Masukkan nilai a : ");
        a = input.nextInt();
        System.out.println("Masukkan nilai b : ");
        b = input.nextInt();
        System.out.println("Masukkan nilai c : ");
        c = input.nextInt();

        d = b*b - 4*a*c;

        if (a == 0) {
            System.out.println("Error");
        } else if (a >= 0) {
            x1 = (-b + Math.sqrt(d))/(2*a);
            x2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Nilai x1 = " + x1 + " dan nilai x2 = " + x2);
        } else if (a <= 0){
            System.out.println("Nilai x imajiner ");}
        }
    }


