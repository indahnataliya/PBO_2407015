import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama minuman (cappucino/matcha): ");
        String minuman = input.nextLine().toLowerCase();

        if (minuman.equals("matcha")) {
            System.out.println("Bahan matcha:");
            System.out.println("- Bubuk matcha");
            System.out.println("- Steamed Milk");
            System.out.println("- Sedikit Foam");
        } else if (minuman.equals("cappucino")) {
            System.out.println("Bahan cappucino:");
            System.out.println("- Espresso");
            System.out.println("- Milk");
             System.out.println("- Foam");
        } else {
            System.out.println("Minuman tidak tersedia.");
        }

        input.close();
    }
}