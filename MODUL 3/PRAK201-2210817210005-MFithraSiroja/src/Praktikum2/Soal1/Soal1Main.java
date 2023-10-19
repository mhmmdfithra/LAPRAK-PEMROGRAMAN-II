package Praktikum2.Soal1;

public class Soal1Main {
    public static void main(String[] args) {
        Buah Apel = new Buah("Apel" , 0.4, 7000, 40, 700000);
        Buah Mangga = new Buah("mangga", 0.2, 3500, 15, 262500);
        Buah Alpukat = new Buah("Alpukat", 0.25, 10000,12, 4800000);

        Apel.GetBuah();
        Mangga.GetBuah();
        Alpukat.GetBuah();
    }
}
