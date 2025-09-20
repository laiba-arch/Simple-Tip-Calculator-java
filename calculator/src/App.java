import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bill;
        double tip;
        double total;
        double customTip;
        double customTotal;

        System.out.print("Enter bill amount: ");
        bill = sc.nextDouble();

        tip = bill * 0.15;          // 15% tip
        total = bill + tip;

        System.out.println("Tip (15%): " + tip);
        System.out.println("Total: " + total);

        System.out.print("Enter custom tip % (or 0 to skip): ");
        customTip = sc.nextDouble();

        if (customTip > 0) {
            tip = bill * customTip / 100;
            customTotal = bill + tip;
            System.out.println("Tip (" + customTip + "%): " + tip);
            System.out.println("Total: " + customTotal);
        }

        sc.close();
    }
}
