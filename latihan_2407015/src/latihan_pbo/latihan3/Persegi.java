package latihan_pbo.latihan3;

public class Persegi extends BangunDatar {

    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitung() {
        luas = sisi * sisi;
        keliling = 4 * sisi;
    }
}