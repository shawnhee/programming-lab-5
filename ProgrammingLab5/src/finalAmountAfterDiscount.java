import java.util.Scanner;
public class finalAmountAfterDiscount {
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Input your amount: ");
		double amount = input.nextDouble();
		double discount=0;
		if (amount >= 600) 
			discount= 0.15;
		else if (amount >= 150)
			discount= 0.1;
		else if (amount >0) 
			discount=0.05;
		else {  
			System.out.println("Error!");
			System.exit(0);
		}

		double finalAmount=(amount-(amount*discount));
		System.out.printf("Your final amount is: RM%.2f", finalAmount);
	}
}
