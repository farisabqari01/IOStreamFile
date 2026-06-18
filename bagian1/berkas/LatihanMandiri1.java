package bagian1.berkas;

import java.io.File;

public class LatihanMandiri1 {

    public static void main(String[] args) {

        File berkas = new File("laporan.txt");

        System.out.println("Nama Berkas : " + berkas.getName());
        System.out.println("Apakah Berkas Ada? : " + berkas.exists());

        if (berkas.exists()) {
            System.out.println("Ukuran Berkas : " + berkas.length() + " byte");
        }
    }
}