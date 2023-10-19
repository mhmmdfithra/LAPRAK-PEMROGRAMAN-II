package Praktikum2.Soal1;

public class Buah {
    String Nama;
    double Berat, Harga, JumlahBeli,HargaSebelumDiskon,TotalDiskon,HargaSetelahDiskon;

    public Buah(String Nama, double Berat, double Harga,  double JumlahBeli, double HargaSebelumDiskon){
        this.Nama = Nama;
        this.Berat = Berat;
        this.Harga = Harga;
        this.JumlahBeli = JumlahBeli;
        this.HargaSebelumDiskon = HargaSebelumDiskon;
    }

    public void GetBuah() {
        TotalDiskon = ((int) (JumlahBeli / 4) * 0.02 * Harga * 4);
        HargaSetelahDiskon = HargaSebelumDiskon - TotalDiskon;

        System.out.println("Nama Buah : " + Nama);
        System.out.println("Berat : " + Berat + "Kg");
        System.out.println("Harga : " + Harga);
        System.out.println("Jumlah Beli : " + JumlahBeli);
        System.out.printf("Harga Sebelum Diskon  : %.2f  \n" , HargaSebelumDiskon);
        System.out.printf("Total Diskon : %.2f \n",  TotalDiskon);
        System.out.printf("Harga Setelah Diskon : %.2f", HargaSetelahDiskon);
        System.out.println("\n");
    }
}
