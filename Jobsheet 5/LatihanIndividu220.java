import java.util.Scanner;

public class LatihanIndividu220 {
    public static void main(String[] args) {
        
        String username = "admin", password = "pwadmin";

        Scanner input20 = new Scanner(System.in);
        System.out.println("Masukkan username: ");
        username = input20.nextLine();
        System.out.println("Masukkan password: ");
        password = input20.nextLine();

        if (username.equals("admin") && password.equals("pwadmin")) {
            System.out.println("Log in berhasil");
        } else {
            System.out.println("Username dan password salah");
        }
    }
}