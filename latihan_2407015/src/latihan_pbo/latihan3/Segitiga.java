package latihan_pbo.latihan3;

public class segitiga extends BangunDatar{
    public double Luassegitiga(){
        return 0.5* getAlas() * getTinggi();
    }
    public double KelilingSegitiga(){
        return 3 * getSisi();
    }
}