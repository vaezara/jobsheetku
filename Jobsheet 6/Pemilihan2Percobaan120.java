import java.util.Scanner;
public class Pemilihan2Percobaan120 {
    public static void main(String[] args) {

        int tahun;

        Scanner input20 = new Scanner(System.in);
        System.out.println("Masukkan Tahun: ");
        tahun = input20.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400) == 0) {
                System.out.println("Tahun Kabisat");

                }else
                    System.out.println("Bukan Tahun Kabisat");
            }else
                System.out.println("Tahun Kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat"); 
    

    }
}