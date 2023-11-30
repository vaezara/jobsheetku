public class Tugas3_4 {

    // Fungsi rekursif Fibonacci untuk menghitung jumlah pasangan marmut
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Bulan ke-12
        int bulan = 12;

        // Jumlah pasangan marmut pada akhir bulan ke-12
        int jumlahPasangan = fibonacci(bulan);

        // Tampilkan hasil
        System.out.println("Pada akhir bulan ke-" + bulan + ", jumlah pasangan marmut adalah: " + jumlahPasangan);
    }
}