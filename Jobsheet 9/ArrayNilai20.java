import java.util.Scanner;
public class ArrayNilai20 {

    public static void main(String[] args) {

        Scanner sc20 = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan Nilai Akhir Ke-"+i+" : ");
            nilaiAkhir[i] = sc20.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }
    }
    
}