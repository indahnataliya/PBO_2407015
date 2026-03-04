package latihan_pbo.latihan3;

public abstract class BangunDatar {

    protected double luas;
    protected double keliling;

    // method abstract (wajib dioverride oleh anaknya)
    public abstract void hitung();

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}