package soal2;

public class HewanPeliharaan {
    private String nama;
    private  String ras;

        public HewanPeliharaan(String r, String n) {
            this.nama = n;
            this.ras = r;
        }
        public void display(){
            System.out.println("Detail Hewan Peliharaan: ");
            System.out.println("Nama hewan peliharaanku : "+nama);
            System.out.println("Dengan ras: "+ras);
        }
    }

