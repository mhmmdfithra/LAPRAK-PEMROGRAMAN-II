package MODUL2;

import java.util.Scanner;

public class PRAK102_2210817210005_MFithraSiroja {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Deret = Input.nextInt();
        int Baris= 0, i = 0;

        while ( i <=10){
            if (Deret % 5 ==0){
                Baris = Deret/5 -1;
            }
            else {
                Baris = Deret;
            }
            i++;
            Deret++;
            System.out.print(Baris);
            if (i<=11-1){
                System.out.print(",");
            }
        }
    }
}
