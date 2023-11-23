import java.util.Scanner;
public class Kubus20 {
    static int hitungVolume (int sisi) {
        int volume= sisi*sisi*sisi;
        return volume;
    }
    static int hitungLuasPermukaan (int sisi) {
        int luasPermukaan=6*sisi*sisi;
        return luasPermukaan;
    }
    public static void main(String[] args) {

        int sisi, vol, Lp;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi: ");
        sisi = input.nextInt();

        vol=hitungVolume(sisi);
        System.out.println("Volume kubus adalah " +vol);

        Lp=hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah " +Lp);
    }
}

