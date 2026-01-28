import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // PRICES
        double hamburgerPrice = 12.99;
        double friesPrice = 4.99;
        double sodaPrice = 2.99;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int code = random.nextInt(1, 99);

        System.out.println("""
                Hello and welcome to the Krusty Krab!
                Here's the menu:
                Hamburger: 12.99
                Fries: 4.99
                Soda: 2.99""");

        System.out.print("\nSo how many hamburgers would you like? (if none enter 0): ");
        int hamburgerQuantity = scanner.nextInt();

        System.out.print("Would you like some fries with it? (true/false): ");
        boolean wantsFries = scanner.nextBoolean();

        String fries = (wantsFries) ?  "How many? " : "enter 0 pls: ";
        System.out.print(fries);
        int friesQuantity = scanner.nextInt();

        System.out.print("would you like a soda? (true/false): ");
        boolean wantsSoda = scanner.nextBoolean();

        String soda = (wantsSoda) ? "How many? " : "enter 0 pls: ";
        System.out.print(soda);
        int sodaQuantity = scanner.nextInt();

        //QUANTITY TOTAL
         double total = hamburgerQuantity * hamburgerPrice +
                friesQuantity * friesPrice +
                sodaQuantity * sodaPrice;

        if (total > 20.99){
            total *= (1- 0.15);
            System.out.println("Wow so lucky, you got a 15% discount!");
        }

        System.out.printf("Total: %.2f€ \nOrder number: %d",
                total,
                code);

        scanner.close();

    }
}

// TROVARE SOLUZIONE A "ENTER 0 PLS"