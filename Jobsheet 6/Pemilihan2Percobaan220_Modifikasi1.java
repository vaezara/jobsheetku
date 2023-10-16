import java.util.Scanner;

public class Pemilihan2Percobaan220_Modifikasi1 {
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
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
               System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }
            else if (sudut1 == sudut2 || sudut1 == sudut2 || sudut2 == sudut3) {
                System.out.println("Segitiga sama sisi");
            }
            else if (sudut1 == sudut2 && sudut1 != sudut3 || sudut1 == sudut2 && sudut2 != sudut3) {
                System.out.println("Segitiga sama kaki");
            }
            else if (sudut1 != sudut2 && sudut1 != sudut3 && sudut2 != sudut3) {
                System.out.println("Segitiga sembarang");
            }              
         } else
            System.out.println("Bukan segitiga");
        }
    } 