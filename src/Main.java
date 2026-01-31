import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // PRICES
        double hamburgerPrice = 12.99;
        double friesPrice = 4.99;
        double sodaPrice = 2.99;

        // QUANTITY
        int friesQuantity = 0;
        int sodaQuantity = 0;

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

        if (wantsFries){
            System.out.print("How many? ");
            friesQuantity = scanner.nextInt();
        }
        else {
            System.out.println("Ok");
        }

        System.out.print("would you like a soda? (true/false): ");
        boolean wantsSoda = scanner.nextBoolean();

        if (wantsSoda){
            System.out.print("How many? ");
            sodaQuantity = scanner.nextInt();
        }
        else {
            System.out.println("ok");
        }

        //QUANTITY TOTAL
         double total = hamburgerQuantity * hamburgerPrice +
                friesQuantity * friesPrice +
                sodaQuantity * sodaPrice;

        if (total > 20.99){
            total *= (1- 0.15);
            System.out.println("\nWow so lucky, you got a 15% discount!");
        }

        System.out.printf("Total: %.2f€ \nOrder number: %d",
                total,
                code);

        scanner.close();

    }
}

// TROVARE SOLUZIONE A "ENTER 0 PLS", rinunciato al ternary operator e optato a if else statements.