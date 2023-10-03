package MODUL2;

import java.util.Scanner;

public class PRAK103_2210817210005_MFithraSiroja {
    public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    int N = Input.nextInt();
    int BilAwal = Input.nextInt();

        if (BilAwal%2==0){
        BilAwal+=1;
        }
        do {
        if (N==1){
            System.out.println(BilAwal);
            break;
        }
        System.out.print(BilAwal + ",");
        N--;BilAwal+=2;
        }
        while (N>0);
    }
}


