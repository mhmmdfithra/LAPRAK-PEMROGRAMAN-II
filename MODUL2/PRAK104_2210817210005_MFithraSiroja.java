package MODUL2;

import java.util.Scanner;

public class PRAK104_2210817210005_MFithraSiroja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tangan Abu: ");
        String Abu = input.nextLine().trim();
        System.out.print("Tangan Bagas: ");
        String Bagas = input.nextLine().trim();


        String[] ArrayAbu = Abu.split(" ");
        String[] ArrayBagas = Bagas.split(" ");
        int poinAbu = 0;
        int poinBagas = 0;
        String  RondeAbu, RondeBagas;


        for (int i = 0; i < 3; i++) {
            RondeAbu = ArrayAbu[i];
            RondeBagas = ArrayBagas[i];
            if (RondeAbu.equals(RondeBagas)) {
                continue;
            } else if ((RondeAbu.equals("B") && RondeBagas.equals("G")) ||
                    (RondeAbu.equals("G") && RondeBagas.equals("K")) ||
                    (RondeAbu.equals("K") && RondeBagas.equals("B"))) {
                poinAbu++;
            } else {
                poinBagas++;
            }
        }
        String pemenang = "";
        if (poinAbu > poinBagas) {
            pemenang = "Abu";
        }
        else if (poinAbu < poinBagas) {
            pemenang = "Bagas";
        }
        else {
            pemenang="Seri";
        }
        System.out.println(pemenang);
    }
}
