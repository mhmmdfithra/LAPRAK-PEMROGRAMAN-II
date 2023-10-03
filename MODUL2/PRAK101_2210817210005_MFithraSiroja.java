package MODUL2;

import java.util.Scanner;

public class PRAK101_2210817210005_MFithraSiroja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String Nama = input.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String TempatLahir = input.nextLine();
        System.out.print("Masukkan Masukkan Tanggal Lahir: ");
        int TanggalLahir=input.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int BulanLahir= input.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int TahunLahir=input.nextInt();
        System.out.print("Masukkan Tinggi badan: ");
        int TBadan=input.nextInt();
        System.out.print("Masukkan Berat Badan: ");
        float BBadan = input.nextFloat();

        String NamaBulan = "";
        switch (BulanLahir){
            case 1:
                NamaBulan = "Januari";
            case 2:
                NamaBulan = "Februari";
            case 3:
                NamaBulan = "Maret";
            case 4:
                NamaBulan = "April";
            case 5:
                NamaBulan = "Mei";
            case 6:
                NamaBulan ="Juni";
            case 7:
                NamaBulan ="Juli";
            case 8:
                NamaBulan ="Agustus";
            case 9:
                NamaBulan ="September";
            case 10:
                NamaBulan ="Oktober";
            case 11:
                NamaBulan ="November";
            case 12:
                NamaBulan ="Desember" ;
        }
        System.out.print("Nama Lengkap "+(Nama)+ " Lahir di "+(TempatLahir)+ " pada Tanggal "+ (TanggalLahir) +" "+ (NamaBulan)+" "
                + (TahunLahir) + " Tinggi Badan "+ (TBadan) + " cm " + " Dan Berat Badan "+ (BBadan) + " Kilogram");
    }
}
