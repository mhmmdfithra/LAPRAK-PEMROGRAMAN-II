package soal1;

import java.util.Scanner;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nama hewan peliharaan adalah : ");
        this.nama = input.nextLine();
        System.out.print("Ras : ");
        this.ras = input.nextLine();
    }

    void display(){
        System.out.println("\nDetail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : "+ nama);
        System.out.println("Dengan ras : "+ ras);
        }
    }
