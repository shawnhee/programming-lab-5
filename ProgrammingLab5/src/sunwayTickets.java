/*
 Author's Name: Shawn Song-Yang Hee
 Matric Number: 227845
 Lab No: 5
 */
import java.util.Scanner;

public class sunwayTickets {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Set QUACKXPRESSPRICE as constant value 90
        final double QUACKXPRESSPRICE = 90;
        // Initialize quackXpressFinalPrice as 0
        double quackXpressFinalPrice = 0;
        // Initialize ticketPrice = 0
        int ticketPrice = 0;
        
        // Prompt age and user input their age
        System.out.print("Enter your age: ");
        int Age = keyboard.nextInt();
        
        // Prompt category and user input their category
        System.out.print("Enter your type of category (1, 2 or 3): ");
        int Category = keyboard.nextInt();
        
        // Prompt number of tickets and user input number of tickets
        System.out.print("Enter your number of tickets to purchase: ");
        int noTickets = keyboard.nextInt();
        
        System.out.print("Purchase Quack Xpress of RM90 to skip the regular queues at selected rides and attractions? (Type Y or N): ");
        // User input whether they need QuackXpress by inputting character Y or N. Error if other values input.
        char QuackOrNot = keyboard.next().charAt(0);
        
        // If need QuackXpress, prompt number of QuackExpress and calculate final price of QuackXpress
        if (QuackOrNot == 'y' || QuackOrNot == 'Y') {
            System.out.print("Number of Quack Xpress: ");
            int noQuacks = keyboard.nextInt();
            quackXpressFinalPrice = noQuacks * QUACKXPRESSPRICE;
        }
        
        // If no need QuackXpress, set QuackXpress price to 0
        if (QuackOrNot == 'N' || QuackOrNot == 'n') {
            quackXpressFinalPrice = 0;
        }
        
        // If other values input other than N, n, Y and y: Display error
        if (QuackOrNot != 'N' && QuackOrNot != 'n' && QuackOrNot != 'y' && QuackOrNot != 'Y') {
            System.out.println("Invalid input");
        }
        
        // Set ticket price according to age and category
        if (Age >= 60) {
            if (Category == 1) {
                ticketPrice = 135;
            } else if (Category == 2) {
                ticketPrice = 190;
            } else if (Category == 3) {
                ticketPrice = 63;
            } else {
                System.out.println("Invalid input");
            }
        } else if ((Age >= 13 && Age < 60)) {
            if (Category == 1) {
                ticketPrice = 160;
            } else if (Category == 2) {
                ticketPrice = 225;
            } else if (Category == 3) {
                ticketPrice = 75;
            } else {
                System.out.println("Invalid input");
            }
        } else if ((Age < 13 && Age > 0)) {
            if (Category == 1) {
                ticketPrice = 135;
            } else if (Category == 2) {
                ticketPrice = 190;
            } else if (Category == 3) {
                ticketPrice = 63;
            } else {
                System.out.println("Invalid input");
            }
        } else {
            System.out.println("Invalid input");
        }

        // Calculate final price by multiplying number of tickets to ticket price and add on Quack express if needed
        double finalPrice = noTickets * ticketPrice + quackXpressFinalPrice;
        
        // Final output
        System.out.printf("Your final price is: RM %.2f", finalPrice);
        
        // Close scanner to avoid resource leak
        keyboard.close();
    }
}
