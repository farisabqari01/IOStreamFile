package bagian3.kontak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class NewBukuKontak {

    private ArrayList<NewKontak> daftar = new ArrayList<>();
    private String namaBerkas;

    public NewBukuKontak(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahKontak(NewKontak kontak) {
        daftar.add(kontak);
    }

    public void tampilkanSemua() {

        System.out.println("== Daftar Kontak ==");

        for (int i = 0; i < daftar.size(); i++) {
            System.out.println((i + 1) + ". " + daftar.get(i).info());
        }
    }

    public void cariKontak(String nama) {

        boolean ditemukan = false;

        for (NewKontak k : daftar) {

            if (k.getNama().equalsIgnoreCase(nama)) {

                System.out.println("Kontak ditemukan:");
                System.out.println(k.info());

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kontak tidak ditemukan.");
        }
    }

    public void hapusKontak(String nama) {

        boolean ditemukan = false;

        for (int i = 0; i < daftar.size(); i++) {

            if (daftar.get(i).getNama().equalsIgnoreCase(nama)) {

                daftar.remove(i);

                System.out.println("Kontak " + nama + " berhasil dihapus.");

                simpanKeBerkas();

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kontak tidak ditemukan.");
        }
    }

    public void simpanKeBerkas() {

        try (PrintWriter penulis =
                new PrintWriter(new FileWriter(namaBerkas))) {

            for (NewKontak k : daftar) {
                penulis.println(k.keBaris());
            }

            System.out.println("Data berhasil disimpan.");

        } catch (IOException e) {

            System.out.println("Gagal menyimpan: " + e.getMessage());

        }
    }

    public void muatDariBerkas() {

        daftar.clear();

        try (BufferedReader pembaca =
                new BufferedReader(new FileReader(namaBerkas))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {

                String[] bagian = baris.split(";");

                if (bagian.length == 3) {

                    daftar.add(
                            new NewKontak(
                                    bagian[0],
                                    bagian[1],
                                    bagian[2]
                            )
                    );
                }
            }

            System.out.println("Data berhasil dimuat.");

        } catch (IOException e) {

            System.out.println("Gagal memuat: " + e.getMessage());

        }
    }

    public int jumlahKontak() {
        return daftar.size();
    }
}