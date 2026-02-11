package latihan_pbo.latihan1;

class cafe {
    String nama;
    String alamat;

    // constructor
    cafe( String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("nama Cafenya adalah :" + nama);
        System.out.println("alamatnya di : " + alamat);
        System.out.println( "===========");
}
//method
    void buka(){
        System.out.println("=================");
         System.out.println("cafe sudah buka");

    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

}
public class Main {
    public static void main(String[] args) {

        cafe cafe1 = new cafe("Kenangan", "imkot");
        // cafe1.nama = "Kopi Kenangan";
        // cafe1.alamat = "Indramayu";
        // System.out.println("Nama Cafe :" + cafe1.nama);
        // System.out.println("Nama Cafe :" + cafe1.alamat);

        // System.out.println("=====================");

         cafe cafe2 = new cafe("janji jiwa", "cirebon");
        // cafe2.nama = "Tomoro";
        // cafe2.alamat = "Indramayu";
        // System.out.println("Nama Cafe :" + cafe2.nama);
        // System.out.println("Nama Cafe :" + cafe2.alamat);
        
        // System.out.println("=====================");

        cafe cafe3 = new cafe("seven", "indramayu");
        // cafe3.nama = "seven";
        // cafe3.alamat = "Indramayu";
        // System.out.println("Nama Cafe :" + cafe3.nama);
        // System.out.println("Nama Cafe :" + cafe3.alamat);

        
        
    }
}
