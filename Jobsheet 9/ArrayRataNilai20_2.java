import java.util.Scanner;
public class ArrayRataNilai20_2 {
    public static void main(String[] args) {
        Scanner sc20 = new Scanner(System.in);

        int[] nilaiMhs = new int[5];
        double total = 0;
        int lulus = 0;
        int jumlah;
        double rataLulus = 0;
        double rataTdkLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = sc20.nextInt();
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc20.nextInt();
            if (nilaiMhs[i] > 70) {
                lulus++;
                rataLulus += nilaiMhs[i];
            } else {
                rataTdkLulus += nilaiMhs[i];
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        System.out.println("Rata-rata nilai lulus = " +(rataLulus/lulus)); 
        System.out.println("Rata-rata nilai tidak lulus = "+(rataTdkLulus/(nilaiMhs.length - lulus)));
    }
}