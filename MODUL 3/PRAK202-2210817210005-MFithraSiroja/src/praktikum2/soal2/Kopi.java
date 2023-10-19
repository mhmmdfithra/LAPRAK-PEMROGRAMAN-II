package praktikum2.soal2;

public class Kopi {
    String namaKopi, ukuran, pembeli; //deklarasi Variabel
    double harga, pajak;

    public void setPembeli(String pembeli ){
        this.pembeli = pembeli;
    }
    String getPembeli(){
        return this.pembeli;
    }

    double getPajak(){
        pajak = harga * 0.11;
        return pajak;
    }
    void info(){
        System.out.println("Nama Kopi : "+ namaKopi);
        System.out.println("Ukuran :"+ ukuran);
        System.out.println("Harga : Rp. " +harga);
    }
}
