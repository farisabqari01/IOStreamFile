package bagian3.kontak;

public class NewMainKontak {

    public static void main(String[] args) {

        NewBukuKontak buku =
                new NewBukuKontak("newkontak.txt");

        buku.tambahKontak(
                new NewKontak(
                        "Andi",
                        "081111111",
                        "andi@gmail.com"));

        buku.tambahKontak(
                new NewKontak(
                        "Budi",
                        "082222222",
                        "budi@gmail.com"));

        buku.tambahKontak(
                new NewKontak(
                        "Citra",
                        "083333333",
                        "citra@gmail.com"));

        System.out.println("=== DATA AWAL ===");
        buku.tampilkanSemua();

        System.out.println();

        buku.simpanKeBerkas();

        System.out.println();

        System.out.println("=== CARI KONTAK ===");
        buku.cariKontak("Budi");

        System.out.println();

        System.out.println("=== HAPUS KONTAK ===");
        buku.hapusKontak("Andi");

        System.out.println();

        System.out.println("=== DATA SETELAH DIHAPUS ===");
        buku.tampilkanSemua();

        System.out.println();

        NewBukuKontak bukuBaru =
                new NewBukuKontak("newkontak.txt");

        bukuBaru.muatDariBerkas();

        System.out.println();

        System.out.println("=== DATA HASIL BACA FILE ===");
        bukuBaru.tampilkanSemua();

        System.out.println();

        System.out.println(
                "Jumlah Kontak : "
                + bukuBaru.jumlahKontak());
    }
}