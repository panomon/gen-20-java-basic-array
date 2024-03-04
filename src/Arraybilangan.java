import java.util.Scanner;

public class Arraybilangan {
    // Menghitung total bilangan pada array
    public static int totalarray (int[][] array) {
        int total = 0;
        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                total++;
            }
        }
        return total;
    }

    // Membuat array baru dari penjumlahan array pada dimensi ke 2
    public static int[] jumlaharray2dimensi (int[][] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int jumlah = 0;
            for (int j = 0; j < array[i].length; j++) {
                jumlah += array[i][j];
            }
            array1[i] = jumlah;
        }
        return array1;
    }

    // Membalik susunan bilangan pada array
    public static void balikarray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length / 2; j++) {
                int balik = array[i][j];
                array[i][j] = array[i][array.length - j - 1];
                array[i][array[i].length - j - 1] = balik;
            }
        }
    }

    public static void main (String[] args) {
        // Contoh Array
        int[] contoh = {1,2,3};
        for (int c : contoh) {
            System.out.println(c);
        }

        // Menginput array 2 dimensi
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan baris array: ");
        int baris = scan.nextInt();
        System.out.print("Masukkan kolom array: ");
        int kolom = scan.nextInt();
        int[][] array = new int[baris][kolom];

        // Menginput bilangan setiap array
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan bilangan ["+i+"]["+j+"]: ");
                array[i][j] = scan.nextInt();
            }
        }

        // Menampilkan total bilangan pada array
        System.out.println("Total bilangan array: " + totalarray(array));

        // Menampilkan array baru dari penjumlahan bilangan array pada dimensi ke 2
        int[] array1 = jumlaharray2dimensi(array);
        System.out.print("Array baru dari penjumlahan bilangan array pada dimensi ke 2: [ ");
        for (int j : array1) {
            System.out.print(j + " ");
        }
        System.out.print("]");
        System.out.println();

        // Menampilkan array susunan bilangan yang dibalik
        System.out.println("Array dengan susunan bilangan yang dibalik: ");
        balikarray(array);
        for (int i = 0; i < baris; i++) {
            System.out.print("[ ");
            for (int j = 0; j < kolom; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("]");
        }

    }
}
