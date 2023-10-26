import java.util.Scanner;
public class Tugas3Jobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jmlEl = sc.nextInt();

        int[] arrayInt = new int[jmlEl];
        System.out.print("Masukkan " + jmlEl + " bilangan bulat: ");
        for (int i = 0; i < jmlEl; i++) {
            arrayInt[i] = sc.nextInt();
        }

        int max = arrayInt[0];
        int min = arrayInt[0];
        int rataRata = arrayInt[0];

        for (int i = 1; i < jmlEl; i++) {
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
            rataRata += arrayInt[i];
        }

        double average = (double) rataRata / jmlEl;

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + average);
    }
}