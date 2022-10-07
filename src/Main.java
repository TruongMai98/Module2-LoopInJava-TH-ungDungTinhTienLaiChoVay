import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double intersestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter investment amount: ");
        money = input.nextDouble();
        System.out.println("enter number of months: ");
        month = input.nextInt();
        System.out.println("enter annual interest rate in percentage: ");
        intersestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (intersestRate/100)/12 * month;
        }
        System.out.println("total interest: " + totalInterest);
    }
}