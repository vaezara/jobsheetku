import java.util.Scanner;

public class DoWhileCuti20_2 {
    public static void main(String[] args) {
        Scanner scan20 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = scan20.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            konfirmasi = scan20.next();

            if (konfirmasi.equalsIgnoreCase("t")) {
                break; // Berhenti jika konfirmasi adalah "t"
            }

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = scan20.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti Anda tidak mencukupi");
                }
            }
        } while (jatahCuti > 0);
    }
}
