package tugas;

public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
                "Makanan",
                "Minuman",
                "Elektronik"
        };

        System.out.println("=== DAFTAR KATEGORI ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        // Membuat gudang
        Gudang gudang =
                new Gudang("barang.txt");

        // Menambah minimal 5 barang
        gudang.tambahBarang(
                new Barang("Indomie", 3500, 100));

        gudang.tambahBarang(
                new Barang("Teh Botol", 5000, 50));

        gudang.tambahBarang(
                new Barang("Mouse", 75000, 10));

        gudang.tambahBarang(
                new Barang("Keyboard", 150000, 8));

        gudang.tambahBarang(
                new Barang("Headset", 250000, 5));

        System.out.println("=== DATA AWAL ===");

        gudang.tampilkanSemua();

        System.out.println();

        gudang.simpanKeBerkas();

        System.out.println();

        // Membaca kembali dari file
        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        System.out.println();

        System.out.println("=== DATA HASIL BACA FILE ===");

        gudangBaru.tampilkanSemua();

        System.out.println();

        System.out.println(
                "Total Nilai Persediaan : Rp"
                + gudangBaru.totalNilai());
    }
}