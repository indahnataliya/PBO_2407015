package latihan_pbo.latihan3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bd = null;

        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Pilih: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan sisi: ");
                bd = new Persegi(input.nextDouble());
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();
                bd = new PersegiPanjang(p, l);
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                bd = new Segitiga(a, t);
                break;

            case 4:
                System.out.print("Masukkan jari-jari: ");
                bd = new Lingkaran(input.nextDouble());
                break;

            default:
                System.out.println("Pilihan tidak ada.");
        }

        if (bd != null) {
            bd.hitung();
            System.out.println("Luas = " + bd.getLuas());
            System.out.println("Keliling = " + bd.getKeliling());
        }

        input.close();
    }
}