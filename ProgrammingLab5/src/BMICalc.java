import java.util.Scanner;
public class BMICalc {
	public static void main(String[]args) {
		System.out.println("BMI information:");
		System.out.println(
				"BMI (18.5-24.9) : Normal \n"
				+ "BMI (25-29.9) : Over Weight\n"
				+ "BMI (30-34.9) : Obese\n"
				+ "BMI (35-39.9) : Severely Obese\n"
				+ "BMI (>=40) : Morbidly Obese\n"
				+ "**********************\n"
				);
		
		Scanner input=new Scanner (System.in);
		System.out.print("Input your name: ");
		String name = input.nextLine();
		System.out.print("Input your height in metres: ");
		double height = input.nextDouble();
		System.out.print("Input your weight in kg: ");
		double weight = input.nextDouble();
		double BMI=(weight/(height*height));
		String BMIStatus="Default";
		if (BMI>=40)
			BMIStatus="Morbidly Obese!";
		else if (BMI>=35)
			BMIStatus="Severely Obese!";
		else if (BMI>=30)
			BMIStatus="Obese";
		else if (BMI>=25)
			BMIStatus="Overweight";
		else if (BMI>=18.5)
			BMIStatus="Normal";
		else if (BMI>0)
			BMIStatus="Underweight";
		System.out.printf("%s, your BMI is %.2f, so that means you are %s\n", name, BMI, BMIStatus);
	}
}
