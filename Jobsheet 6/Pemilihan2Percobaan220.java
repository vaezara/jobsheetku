import java.util.Scanner;
public class Pemilihan2Percobaan220 {
    public static void main(String[] args) {

         int sudut1, sudut2, sudut3, totalSudut;

         Scanner input20 = new Scanner(System.in);
         System.out.println("Masukkan sudut pertama : ");
         sudut1 = input20.nextInt();
         System.out.println("Masukkan sudut kedua : ");
         sudut2 = input20.nextInt();
         System.out.println("Masukkan sudut ketiga : ");
         sudut3 = input20.nextInt();

         totalSudut = sudut1 + sudut2 + sudut3;
         
         if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
                
         } else
            System.out.println("Bukan segitiga");
    } 
}