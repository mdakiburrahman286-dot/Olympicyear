import java.util.Scanner;

public class Olympicyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input prompt
        System.out.print("Enter a year (M): ");
        int year = scanner.nextInt();

        // 1896 is the 1st Olympic year and Olympics occur every 4 years
        if (year >= 1896 && (year - 1896) % 4 == 0) {
            int edition = ((year - 1896) / 4) + 1;
            System.out.println(year + " is an Olympic year.");
            System.out.println("Edition number: " + edition);
        } else {
            System.out.println(year + " is NOT an Olympic year.");
        }

        scanner.close();
    }
}