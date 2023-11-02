package PRAK301_2210817210005_MFithraSiroja;

import java.util.LinkedList;
import java.util.Scanner;

public class Main1Soal {
    public static void main(String[] args) {
        LinkedList<Dadu> DaduList = new LinkedList<>();
        int TotalNilai = 0;
        Scanner input = new Scanner(System.in);
        int InputDadu = input.nextInt();
        for (int i = 0; i < InputDadu; i++) {
            Dadu dadu = new Dadu();
            DaduList.add(dadu);
        }
        int urutan = 1;
        for (Dadu dadu : DaduList) {
            System.out.print("Dadu ke-"+urutan+" bernilai ");
            int NilaiDadu = dadu.getNilai();
            TotalNilai += NilaiDadu;
            System.out.print(NilaiDadu + " \n ");
            urutan++;
        }

        System.out.println("Total nilai dadu keseluruhan " + TotalNilai);
    }
}
