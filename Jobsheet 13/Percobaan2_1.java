import java.util.Scanner;
public class Percobaan2_1 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    static void cetakPangkat(int x, int y) {
        for (int i = 1; i <= y; i++) {
            System.out.print(x);
            if (i < y) {
                System.out.print("x");
            }
        }
        System.out.print(" = " + hitungPangkat(x, y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        cetakPangkat(bilangan, pangkat);
    }
}
