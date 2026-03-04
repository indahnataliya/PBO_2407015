package latihan_pbo.latihan3;

public class Segitiga extends BangunDatar {

    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitung() {
        luas = 0.5 * alas * tinggi;
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        keliling = alas + tinggi + sisiMiring;
    }
}