import java.util.Scanner;

/**
 * Kelas ini merepresentasikan program untuk membalik kata atau frase yang dimasukkan oleh pengguna.
 */
public class BalikKata {
    public static void main(String[] args) {
        /**
         * Metode main adalah titik masuk utama untuk program Java. Program dimulai di sini.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kata atau frase: ");
        String inputKata = input.nextLine();
        String kataTerbalik = balikKata(inputKata);
        System.out.println("Kata terbalik: " + kataTerbalik);
        /**
         * Membuat objek Scanner yang digunakan untuk menerima input dari pengguna melalui keyboard.
         * Menampilkan pesan untuk meminta pengguna memasukkan kata atau frase.
         * Menampilkan hasil kata yang sudah dibalik pada layar bersama dengan pesan "Kata terbalik".
         */
    }

    /**
     * Metode ini digunakan untuk membalik kata atau frase yang diberikan.
     *
     * @param kata Kata atau frase yang akan dibalik.
     * @return Kata atau frase yang sudah dibalik.
     */
    public static String balikKata(String kata) {
        String kataTerbalik = "";
        for (int i = kata.length() - 1; i >= 0; i--) {
            kataTerbalik += kata.charAt(i);
        }
        /**
         * Perulangan akan berjalan dari indeks paling belakang (panjang kata dikurangi 1) hingga indeks 0.
         */
        return kataTerbalik;
}
}