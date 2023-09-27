import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String username = "Admin";
        String password = "Admin";

        System.out.println("Masukkan user : ");
        username = input.nextLine();

        System.out.println("Masukkan Password : ");
        password = input.nextLine();

        if (username.equals("Admin") && password.equals("Admin") ) {
            System.out.println("Proses menuju sistem");
        } else {
            System.out.println("Peringatan! Username atau Password anda salah!");
        }
    }
}
