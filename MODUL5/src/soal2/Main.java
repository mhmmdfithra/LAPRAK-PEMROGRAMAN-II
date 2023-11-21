package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan: \n1 = Kucing \n2 = Anjing");
        System.out.print("Masukkan Pilihan : ");
        int masukkan = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi newline setelah membaca integer

        if (masukkan == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = scanner.nextLine();

            System.out.print("Ras: ");
            String ras = scanner.nextLine();

            System.out.print("Warna Bulu: ");
            String warnaBulu = scanner.nextLine();
            Kucing kucing = new Kucing(ras, nama, warnaBulu);
            kucing.displayDetailKucing();
        }
        else if (masukkan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = scanner.nextLine();

            System.out.print("Ras: ");
            String ras = scanner.nextLine();

            System.out.print("Warna Bulu: ");
            String warnaBulu = scanner.nextLine();
            System.out.print("kemampuan: ");
            String[] kemampuanArray = scanner.nextLine().split(",");
            // Output data anjing
            Anjing anjing = new Anjing(ras, nama, warnaBulu, kemampuanArray);
            anjing.displayDetailAnjing();
        }

    }
}
