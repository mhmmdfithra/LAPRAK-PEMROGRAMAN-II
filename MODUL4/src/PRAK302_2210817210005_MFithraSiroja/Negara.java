package PRAK302_2210817210005_MFithraSiroja;

import java.util.HashMap;

public class Negara {
    private String NamaNegara, JenisKepemimpinan, NamaPemimpin, TanggalKemerdekaan;
    private int BulanKemerdekaan, TahunKemerdekaan;

    Negara(String Nama, String JenisKepempinan, String NamaPemimpin, String TanggalKemerdekaan, int BulanKemerdekaan, int TahunKemerdekaan) {
        this.NamaNegara = Nama;
        this.JenisKepemimpinan = JenisKepempinan;
        this.NamaPemimpin = NamaPemimpin;
        this.TanggalKemerdekaan = TanggalKemerdekaan;
        this.BulanKemerdekaan = BulanKemerdekaan;
        this.TahunKemerdekaan = TahunKemerdekaan;
    }

    public String toString() {
        String result = "Negara " + NamaNegara + " mempunyai ";
        if (JenisKepemimpinan.equals("monarki")) {
            result += "Raja bernama " + NamaPemimpin;
        }
        else if (JenisKepemimpinan.equals("perdana menteri")){
            result += "Perdana Menteri bernama " + NamaPemimpin + "\n";
            result += "Deklarasi Kemerdekaan pada Tanggal " + TanggalKemerdekaan + " "
                    + GetBulan(BulanKemerdekaan) + " " + TahunKemerdekaan;
        }
        else {
            result += "Presiden bernama " + NamaPemimpin + "\n";
            result += "Deklarasi Kemerdekaan pada Tanggal " + TanggalKemerdekaan + " "
                    + GetBulan(BulanKemerdekaan) + " " + TahunKemerdekaan;
        }
        return result;
    }

    private String GetBulan(int bulan) {
        HashMap<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        return namaBulan.get(bulan);
    }
}
