import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // PRICES
        double hamburgerPrice = 12.99;
        double friesPrice = 4.99;
        double sodaPrice = 2.99;
        double total = 0;

        //QUANTITY
        int hamburgerQuantity = 0;
        int friesQuantity = 0;
        int sodaQuantity = 0;

        //OPTIONS
        boolean ifFries;
        boolean ifSoda;
        int code;
        code = random.nextInt(1, 99);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome to the Krusty Krab, here's the menu:\nHamburger: 12.99 \nFries: 4.99 \nSoda: 2.99 ");

        System.out.print("So how many hamburgers would you like? (if none enter 0): ");
        hamburgerQuantity = scanner.nextInt();

        System.out.print("Would you like some fries with it? (true/false): ");
        ifFries = scanner.nextBoolean();

        if(ifFries) {
            System.out.print("and how many?: ");
            friesQuantity = scanner.nextInt();
        }
        else {
            System.out.print("ok ");
        }

        System.out.print("would you like a soda? (ture/false): ");
        ifSoda = scanner.nextBoolean();
        if(ifSoda){
            System.out.print("how many? ");
            sodaQuantity = scanner.nextInt();
        }
        else {
            System.out.println();
        }

        scanner.close();

        //QUANTITY TOTAL
        double hamburgerTotal = hamburgerPrice * hamburgerQuantity;
        double friesTotal = friesPrice * friesQuantity;
        double sodaTotal = sodaPrice * sodaQuantity;
        total = hamburgerTotal + friesTotal + sodaTotal;

        if (total > 20.99){
            System.out.printf("Wow so lucky, you got a 15% discount, \nyour total is: %.2f€ \nand this is your order number: %d",total, code);
            total *= 0.15;
        }
        else {
            System.out.printf("Great thank's for your order,\nthe total is: %.2f€ \nand this is your order number: %d", total, code);
        }

        //riga 62, capire come mettere % e farlo riconoscere come carattere normale

    }
}