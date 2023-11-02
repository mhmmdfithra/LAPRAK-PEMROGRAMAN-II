package PRAK301_2210817210005_MFithraSiroja;

import java.util.Random;

public class Dadu {
    private int Nilai;
     Dadu() {
        acakNilai();
    }

    public void acakNilai() {
        Random rand = new Random();
        Nilai = rand.nextInt(6) + 1;
    }
    public int getNilai(){
         return Nilai;
    }
}
