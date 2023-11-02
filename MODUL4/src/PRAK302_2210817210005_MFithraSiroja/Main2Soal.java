package PRAK302_2210817210005_MFithraSiroja;

import java.util.LinkedList;
import java.util.Scanner;

public class Main2Soal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int JumlahNegara = input.nextInt();
        input.nextLine();
        LinkedList<Negara> NegaraList = new LinkedList<>();

        for (int i=0; i<JumlahNegara; i++) {
            String Nama = input.nextLine();
            String JenisKepemimpinan = input.nextLine();
            String NamaPemimpin = input.nextLine();
            String TanggalKemerdekaan = "";
            int BulanKemerdekaan = 0;
            int TahunKemerdekaan = 0;

            if (!JenisKepemimpinan.equals("monarki")) {
                TanggalKemerdekaan = input.nextLine();
                BulanKemerdekaan = input.nextInt();
                TahunKemerdekaan = input.nextInt();
                input.nextLine();
            }
            Negara negara = new Negara(Nama, JenisKepemimpinan, NamaPemimpin, TanggalKemerdekaan, BulanKemerdekaan, TahunKemerdekaan);
            NegaraList.add(negara);
        }
        for (Negara negara : NegaraList) {
            System.out.println(negara);
            System.out.println();
        }
    }
}

