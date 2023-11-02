package PRAK303_2210817210005_MFithraSiroja;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3Soal {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int Menu;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            Menu = input.nextInt();
            input.nextLine();

            switch (Menu) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String Nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String Nim = input.nextLine();
                    Mahasiswa mahasiswa = new Mahasiswa(Nama, Nim);
                    daftarMahasiswa.add(mahasiswa);
                    System.out.println("Mahasiswa " + mahasiswa.getNama() + " ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String NimHapus = input.nextLine();
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNim().equals(NimHapus)) {
                            daftarMahasiswa.remove(mhs);
                            System.out.println("Mahasiswa dengan NIM " + NimHapus + " dihapus.");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                    String nimCari = input.nextLine();
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        if (mhs.getNim().equals(nimCari)) {
                            System.out.println("Mahasiswa ditemukan: " + mhs);
                            break;
                        }
                    }

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mhs : daftarMahasiswa) {
                        System.out.println("NIM :" +mhs.getNim()+ ", Nama : " +mhs.getNama());
                    }
                    break;
            }
        } while (Menu != 0);
        System.out.println("Terimakasih !");
    }
}

