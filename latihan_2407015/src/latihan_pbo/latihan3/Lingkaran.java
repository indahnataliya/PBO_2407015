package latihan_pbo.latihan3;

public class Lingkaran extends BangunDatar {

    private double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    public void hitung() {
        luas = Math.PI * jari * jari;
        keliling = 2 * Math.PI * jari;
    }
}