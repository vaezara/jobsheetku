import java.util.Scanner;

public class LatihanIndividu120 {
    public static void main(String[] args) {
        
        int jarak;

        Scanner input20 = new Scanner(System.in);
        System.out.println("Jarak tembakan: ");
        jarak = input20.nextInt();

        if (jarak >=1 && jarak <=5) {
            System.out.println("Jenis weapon ialah Melee weapon");
        }
        else if (jarak >5 && jarak <=1000) {
            System.out.println("Jenis weapon ialah Ranged Weapon");
        }
        else 
            System.out.println("Jenis weapon tidak sesuai");
    }
}