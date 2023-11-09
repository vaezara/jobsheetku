import java.util.Scanner;
import java.util.Random;

public class Quiz{

    public static void main(String[] args) {
        Random random20 = new Random();
        Scanner input20 = new Scanner(System.in);

        char menu;

        do {
            int number = random20.nextInt(10) + 1;
            boolean success = false;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input20.nextInt();

                if (answer < number) {
                    System.out.println("Lebih kecil dari jawaban.");
                } else if (answer > number) {
                    System.out.println("Lebih besar dari jawaban.");
                } else {
                    success = true;
                }
            } while (!success);

            System.out.print("Apakah Anda Ingin Mengulang Permainan (Y/N)? ");
            menu = input20.next().charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}