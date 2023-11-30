import java.util.Scanner;
public class Tugas3_3 {

    static boolean cekPrimaRekursif(int n, int i) {
        // Base case: jika n kurang dari atau sama dengan 2, maka bilangan prima
        if (n <= 2) {
            return (n == 2);
        }
        
        // Base case: jika n habis dibagi oleh i, maka bukan bilangan prima
        if (n % i == 0) {
            return false;
        }

        // Base case: jika i mencapai akar kuadrat dari n, maka bilangan prima
        if (i * i > n) {
            return true;
        }

        // Rekursif: cek faktor-faktor selanjutnya
        return cekPrimaRekursif(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();

        boolean hasilCekPrima = cekPrimaRekursif(n, 2);

        if (hasilCekPrima) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}