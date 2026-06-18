package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LatihanMandiri3 {

    public static void main(String[] args) {

        int jumlahBaris = 0;

        try (BufferedReader pembaca =
                     new BufferedReader(new FileReader("hari.txt"))) {

            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }

            System.out.println("Jumlah baris dalam file: "
                    + jumlahBaris);

        } catch (IOException e) {

            System.out.println("Gagal membaca: "
                    + e.getMessage());

        }
    }
}