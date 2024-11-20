import java.util.Scanner;

public class grossPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter skill level (1/2/3): ");
        int skillLevel = input.nextInt();
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = input.nextDouble();
       
        double insuranceDeduction = 0;
        if (skillLevel == 2 || skillLevel == 3) {
            System.out.println("1: Medical Insurance (Weekly cost RM 32.50)");
            System.out.println("2: Dental Insurance (Weekly cost RM 20.00)");
            System.out.println("3: Disability Insurance (Weekly cost RM 10.00)");
            System.out.print("Enter one of the following insurance option above");
            int insuranceOption = input.nextInt();
            switch (insuranceOption) {
                case 1:
                    insuranceDeduction = 32.50;
                    break;
                case 2:
                    insuranceDeduction = 20.00;
                    break;
                case 3:
                    insuranceDeduction = 10.00;
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }

        double retirementDeduction = 0;
        if (skillLevel == 3) {
            System.out.print("Do you want retirement plan? Y/N");
            String retirementOption = input.next();
            if (retirementOption.equals("Y")) {
                retirementDeduction = 0.03;
            }
        }

        double hourlyRate = 0;
        if (skillLevel == 1) {
            hourlyRate = 17.00;
        } 
        else if (skillLevel == 2) {
            hourlyRate = 20.00;
        } 
        else if (skillLevel == 3) {
            hourlyRate = 22.00;
        } 
        else {
            System.out.println("Error!");
        }

        double regularPay = hoursWorked*hourlyRate;
        double overtimePay = 0;
        if (hoursWorked > 40) {
            overtimePay = (hoursWorked-40)*hourlyRate*1.5;
        }

        double grossPay = regularPay + overtimePay;

        double totalDeductions = insuranceDeduction;
        if (skillLevel == 3 && retirementDeduction > 0) {
            totalDeductions = (grossPay * retirementDeduction) + insuranceDeduction;
        }

        if (totalDeductions > grossPay) {
            System.out.println("Error!");
        } else {
            double netPay = grossPay - totalDeductions;

            System.out.println("\n--- Payroll Information ---");
            System.out.printf("Hours Worked: %.2f hours\n", hoursWorked);
            System.out.printf("Hourly Pay Rate: RM %.2f\n", hourlyRate);
            System.out.printf("Regular Pay (40 hours): RM %.2f\n", regularPay);
            System.out.printf("Overtime Pay: RM %.2f\n", overtimePay);
            System.out.printf("Total Deductions: RM %.2f\n", totalDeductions);
            System.out.printf("Net Pay: RM %.2f\n", netPay);
        }
    }
}
