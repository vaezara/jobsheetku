public class Individu_4 {
        public static void main(String[] args) {
            // Inisialisasi array 2 dimensi untuk menyimpan nama atlet
            String[][] atletPerCabang = {
                {"Nova", "Lelyta", "Dhiya", "Annisa", "Salsa"},
                {"Vanesa", "Yefta", "Hikmah", "Fajar", "Erik"},
                {"Diyaz", "Heru", "Billy", "Tora", "Gilang"},
                {"Gege", "Haqi", "Aziz", "Rocky", "Wahib"}
            };
    
            // Mengurutkan dan menampilkan nama atlet secara ascending per cabang
            for (int i = 0; i < atletPerCabang.length; i++) {
                // Mengurutkan nama atlet per cabang olahraga
                for (int j = 0; j < atletPerCabang[i].length - 1; j++) {
                    for (int k = j + 1; k < atletPerCabang[i].length; k++) {
                        if (atletPerCabang[i][j].compareTo(atletPerCabang[i][k]) > 0) {
                            String temp = atletPerCabang[i][j];
                            atletPerCabang[i][j] = atletPerCabang[i][k];
                            atletPerCabang[i][k] = temp;
                        }
                    }
                }
    
                // Menampilkan nama atlet yang telah diurutkan
                System.out.println("Nama Atlet Cabang ke-" + (i + 1) + " (ascending):");
                for (int j = 0; j < atletPerCabang[i].length; j++) {
                    System.out.println(atletPerCabang[i][j]);
                }
                System.out.println();
            }
        }
    }
