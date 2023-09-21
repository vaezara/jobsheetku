import java.util.Scanner;
public class HargaBayar20 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int harga, jumlah, jmlhalaman;
        double dis, total, bayar, jmlDis;
        String merkbuku;
    
        System.out.println("Masukkan merk buku ");
        merkbuku=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku");
        jmlhalaman=input.nextInt();
        System.out.println("Masukkan jumlah diskon ");
        dis=input.nextDouble();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    
    }
}