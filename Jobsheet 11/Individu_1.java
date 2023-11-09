import java.util.Scanner;

public class Individu_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
        } else {
            for (int i = 1; i <= N; i++) {
                // Perulangan pertama untuk spasi
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" "); 
                }

                // Perulangan kedua untuk angka
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }

                System.out.println(); // Pindah ke baris berikutnya
            }
        }
    }
}
