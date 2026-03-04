package tugas_pbo;
import java.util.Scanner;

public class tugas1_2407015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama minuman (matcha/cappucino): ");
        String minuman = input.nextLine().toLowerCase();

        if (minuman.equals("Bahan matcha")) {
            System.out.println("Latte:");
            System.out.println("- Steamed Milk");
            System.out.println("- Sedikit Foam");
        } else if (minuman.equals("macchiato")) {
            System.out.println("Bahan cappucino");
            System.out.println("- Espresso");
            System.out.println("- Sedikit Milk Foam");
        } else {
            System.out.println("Minuman tidak tersedia.");
        }

        input.close();
    }
}
