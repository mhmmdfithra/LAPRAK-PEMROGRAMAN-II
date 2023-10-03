package MODUL2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PRAK105_2210817210005_MFithraSiroja{
        public static void main(String[] args) {
            Scanner Input = new Scanner(System.in);
            final double PI = 3.14;
            System.out.print("Masukkan Jari-jari :   ");
            float Jari = Input.nextFloat();
            System.out.print("Masukkan tinggi : ");
            float Tinggi = Input.nextFloat();

            double Vol = PI * Jari * Jari * Tinggi;
            DecimalFormat df = new DecimalFormat("#.###");
            System.out.println("Volume dengan Tabung dengan Jari-Jari " + (Jari) + " cm dan tinggi "
                    + (Tinggi) + " cm adalah " +df.format(Vol) + " m3");

        }
}
