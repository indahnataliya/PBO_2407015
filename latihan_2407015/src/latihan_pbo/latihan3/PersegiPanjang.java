package latihan_pbo.latihan3;

public class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void hitung() {
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
    }
}