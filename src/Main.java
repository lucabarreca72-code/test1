import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // PREZZI
        double hamburger = 12.99;
        double fries = 4.99;
        double soda = 2.99;
        double total;

        //QUANTITÁ
        int quantity1 = 0;
        int quantity2 = 0;
        int quantity3 = 0;

        //OPZIONI
        boolean fries1;
        boolean soda1;
        int code;
        code = random.nextInt(1, 99);

        System.out.println("Hello and welcome to the Krusty Krab, here's the menu:\nHamburger: 12.99 \nFries: 4.99 \nSoda: 2.99 ");

        Scanner scanner = new Scanner(System.in);

        System.out.print("So how many hamburgers would you like? (if none enter 0): ");
        quantity1 = scanner.nextInt();

        System.out.print("Would you like some fries with it? (true/false): ");
        fries1 = scanner.nextBoolean();

        if(fries1) {
            System.out.print("and how many?: ");
            quantity2 = scanner.nextInt();
        } else {
            System.out.println("ok");
        }

        System.out.print("would you like a soda? (ture/false): ");
        soda1 = scanner.nextBoolean();
        if (soda1){
            System.out.print("how many? ");
            quantity3 = scanner.nextInt();
        }
        else {
            System.out.println("Perfect, thank you for your order your number is: " + code) ;
        }

        scanner.close();

        //TOTALE QUANTITÁ
        double hamburgerTotal = hamburger * quantity1;
        double friesTotal = fries * quantity2;
        double sodaTotal = soda * quantity3;

        total = hamburgerTotal + friesTotal + sodaTotal;

        System.out.println("\nYour total is: " + total + " and your number is: " + code);

    }
}