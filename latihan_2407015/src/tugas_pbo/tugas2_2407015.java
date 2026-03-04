package tugas_pbo;

import java.util.Scanner;

// ...sisa kode tetap sama1

// Kelas abstrak untuk PBO
abstract class BangunDatar {
    protected String nama; // bisa diakses oleh subclass

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    public abstract double hitungLuas();       // method public abstrak
    public abstract double hitungKeliling();   // method public abstrak

    protected void tampilkanDiagram() {        // protected
        System.out.println("\n+----------------+");
        System.out.println("| " + nama + " |");
        System.out.println("+----------------+");
    }
}

// Persegi
class Persegi extends BangunDatar {
    private double sisi;  // private

    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    @Override
    protected void tampilkanDiagram() {
        super.tampilkanDiagram();
        System.out.println("| - sisi: double |");
        System.out.println("| + hitungLuas() |");
        System.out.println("| + hitungKeliling() |");
        System.out.println("+----------------+");
    }
}

// Persegi Panjang
class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;  // private

    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    protected void tampilkanDiagram() {
        super.tampilkanDiagram();
        System.out.println("| - panjang: double |");
        System.out.println("| - lebar: double   |");
        System.out.println("| + hitungLuas()    |");
        System.out.println("| + hitungKeliling()|");
        System.out.println("+----------------+");
    }
}

// Segitiga
class Segitiga extends BangunDatar {
    private double alas, tinggi, sisi1, sisi2, sisi3;

    public Segitiga(double alas, double tinggi, double s1, double s2, double s3) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = s1;
        this.sisi2 = s2;
        this.sisi3 = s3;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    @Override
    protected void tampilkanDiagram() {
        super.tampilkanDiagram();
        System.out.println("| - alas: double   |");
        System.out.println("| - tinggi: double |");
        System.out.println("| - sisi1: double  |");
        System.out.println("| - sisi2: double  |");
        System.out.println("| - sisi3: double  |");
        System.out.println("| + hitungLuas()   |");
        System.out.println("| + hitungKeliling()|");
        System.out.println("+----------------+");
    }
}

// Lingkaran
class Lingkaran extends BangunDatar {
    private double radius;

    public Lingkaran(double radius) {
        super("Lingkaran");
        this.radius = radius;
    }

    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    public double hitungKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    protected void tampilkanDiagram() {
        super.tampilkanDiagram();
        System.out.println("| - radius: double   |");
        System.out.println("| + hitungLuas()     |");
        System.out.println("| + hitungKeliling() |");
        System.out.println("+----------------+");
    }
}

// Kelas utama
public class tugas2_2407015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Kalkulator Bangun Datar PBO ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Pilih bangun datar (1-4): ");
        int pilihan = sc.nextInt();

        BangunDatar bangun = null;

        if (pilihan == 1) {
            System.out.print("Masukkan sisi: ");
            double sisi = sc.nextDouble();
            bangun = new Persegi(sisi);
        } else if (pilihan == 2) {
            System.out.print("Masukkan panjang: ");
            double panjang = sc.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = sc.nextDouble();
            bangun = new PersegiPanjang(panjang, lebar);
        } else if (pilihan == 3) {
            System.out.print("Masukkan alas: ");
            double alas = sc.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = sc.nextDouble();
            System.out.print("Masukkan sisi1: ");
            double s1 = sc.nextDouble();
            System.out.print("Masukkan sisi2: ");
            double s2 = sc.nextDouble();
            System.out.print("Masukkan sisi3: ");
            double s3 = sc.nextDouble();
            bangun = new Segitiga(alas, tinggi, s1, s2, s3);
        } else if (pilihan == 4) {
            System.out.print("Masukkan jari-jari: ");
            double r = sc.nextDouble();
            bangun = new Lingkaran(r);
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        if (bangun != null) {
            System.out.println("Luas = " + bangun.hitungLuas());
            System.out.println("Keliling = " + bangun.hitungKeliling());
            bangun.tampilkanDiagram();
        }

        sc.close();
    }
}