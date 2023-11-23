import java.util.Scanner;
public class NilaiMahasiswa20 {

    // input data nilai mahasiswa
    public static void inputNilaiMahasiswa(String[][] nilaiMahasiswa) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i][0] = scanner.next();

            for (int j = 1; j < nilaiMahasiswa[i].length; j++) {
                System.out.print("Masukkan nilai " + nilaiMahasiswa[i][0] + " pada minggu ke-" + j + ": ");
                nilaiMahasiswa[i][j] = String.valueOf(scanner.nextInt());
            }
        }
    }

    // menampilkan seluruh nilai mahasiswa
    public static void tampilkanNilaiMahasiswa(String[][] nilaiMahasiswa) {
        System.out.println("\nNilai Mahasiswa:");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print(nilaiMahasiswa[i][0] + ": ");
            for (int j = 1; j < nilaiMahasiswa[i].length; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }

    // hari nilai tertinggi dari keseluruhan mahasiswa
    public static int cariHariNilaiTertinggi(String[][] nilaiMahasiswa) {
        int hariTertinggi = -1;
        int nilaiTertinggi = -1;

        for (int j = 1; j < nilaiMahasiswa[0].length; j++) {
            int totalNilaiHari = 0;

            for (int i = 0; i < nilaiMahasiswa.length; i++) {
                totalNilaiHari += Integer.parseInt(nilaiMahasiswa[i][j]);
            }

            if (totalNilaiHari > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHari;
                hariTertinggi = j;
            }
        }

        return hariTertinggi;
    }

    //  menampilkan mahasiswa yang memiliki nilai tertinggi
    public static void tampilkanMahasiswaNilaiTertinggi(String[][] nilaiMahasiswa, int hariTertinggi) {
        System.out.println("\nMahasiswa dengan nilai tertinggi pada hari ke-" + hariTertinggi + ":");
        int nilaiTertinggi = -1;
        String mahasiswaTertinggi = "";

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            int nilaiHari = Integer.parseInt(nilaiMahasiswa[i][hariTertinggi]);
            if (nilaiHari > nilaiTertinggi) {
                nilaiTertinggi = nilaiHari;
                mahasiswaTertinggi = nilaiMahasiswa[i][0];
            }
        }

        System.out.println(mahasiswaTertinggi + " dengan nilai " + nilaiTertinggi + " pada minggu ke-" + hariTertinggi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menentukan jumlah mahasiswa dan jumlah minggu
        int jumlahMahasiswa = 5;
        int jumlahMinggu = 7;

        // Membuat array untuk menyimpan nilai mahasiswa
        String[][] nilaiMahasiswa = new String[jumlahMahasiswa][jumlahMinggu + 1];

        // Memasukkan data nilai mahasiswa
        inputNilaiMahasiswa(nilaiMahasiswa);

        // Menampilkan seluruh nilai mahasiswa
        tampilkanNilaiMahasiswa(nilaiMahasiswa);

        // Mencari hari keberapakah terdapat nilai tertinggi dari keseluruhan mahasiswa
        int hariTertinggi = cariHariNilaiTertinggi(nilaiMahasiswa);
        System.out.println("\nHari ke-" + hariTertinggi + " memiliki nilai tertinggi dari keseluruhan mahasiswa");

        // Menampilkan mahasiswa yang memiliki nilai tertinggi
        tampilkanMahasiswaNilaiTertinggi(nilaiMahasiswa, hariTertinggi);
    }
}