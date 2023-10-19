package praktikum2.soal3;

public class Pegawai {
//public class Employee { ini salah karena nama class yang seharusnya Pegawai
        public String nama;

        //public char asal;
        //seharusnya menggunakan String bukan char
        public String asal;
        public String jabatan;
        // karena tidak memeiliki value pada int umur maka harus diberi value agar tidak samadengan 0
        public int umur = 17;

        public String getNama() {
            return nama;
        }

        public String getAsal() {
            return asal;
        }

        //public void setJabatan() {
        // tidak memiliki parameter yang seharusnya ada karena terdapat isi parameter di class Soal3main
        public  void setJabatan(String jabatan){
           // this.jabatan = j; //seharusnya jabatan bukan j
            this.jabatan = jabatan;
        }
    }