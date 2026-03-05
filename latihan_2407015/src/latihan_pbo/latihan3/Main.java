package latihan_pbo.latihan3;

public class Main {
    
    public static void main(String[] args) {
        Persegi p = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Segitiga ppp = new Segitiga();
        Lingkaran pppp = new Lingkaran();

        p.setSisi(5);
        pp.setPanjang(7);
        pp.setLebar(6);
        ppp.setAlas(3);
        ppp.setTinggi(8);
        pppp.setJari(8);
        System.out.println("Luas Persegi=" + p.LuasPersegi());
        System.out.println("Keliling Persegi=" + p.KelilingPersegi());
        System.out.println("Luas Persegi Panjang=" + pp.LuasPersegiPanjang());
        System.out.println("Keliling Persegi Panjang=" + pp.KelilingPersegiPanjang());
        System.out.println("Luas Segitiga=" + ppp.Luassegitiga());
        System.out.println("Keliling Segitiga=" + ppp.KelilingSegitiga());
        System.out.println("Luas Lingkaran=" + pppp.LuasLingkaran());
        System.out.println("Keliling Lingkaran=" + pppp.KelilingLingkaran());
    }
}