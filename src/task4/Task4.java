/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4;
import java.util.Scanner;
/**
 *
 * @author 2277120
 */
public class Task4 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter the initial balance: $");
        double balanceDigit = input.nextDouble();
        
        System.out.print("Please enter the annual interest rate (2 for 2%): ");
        double rateDigit = input.nextDouble();
        
        System.out.print("Please enter the number of years the client wants to save the money in the bank: ");
        double yearsDigit = input.nextDouble();
        
        double afterYearsDigit = balanceDigit*Math.pow (1+(rateDigit/100), yearsDigit);

        System.out.printf("\n%-25s:%10.2f\n%-25s:%9.2f%%\n%-25s:%10.0f\n", "Initial Amount", balanceDigit, "Annual Interest Rate",rateDigit, "Saving years", yearsDigit);
        System.out.print("-----------------------------------");
        System.out.printf("\n%s %.0f %-9s:%10.2f\n", "Balance After", yearsDigit, "Years", afterYearsDigit);


    }
    
}
