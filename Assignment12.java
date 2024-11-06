/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment12;
import java.util.Scanner;
/**
 *
 * @author 2277120
 */
public class Assignment12 {
    
    public static void main(String[] args) {
  
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the item price: ");
        double price = input.nextDouble();
        
        System.out.print("Please enter the discount ratio (5 for 5%): ");
        double discount = input.nextDouble();
        
        double discountAmount = (discount * 0.01) * price;
        double priceBeforeTax = price - discountAmount; 
        double federalTax = priceBeforeTax * 0.05;
        double provincialTax = priceBeforeTax * 0.0975;
        double finalPrice = priceBeforeTax + federalTax + provincialTax;
        System.out.printf("\n%-20s:%.2f \n%-20s:%.2f%% \n%-20s:%.2f\n", "Original Price", price, "Discount Price", discount, "Price Before Tax", priceBeforeTax);
        System.out.print("------------------------------");
        System.out.printf("\n%-20s:%.2f \n%-20s:%.2f \n%-20s:%.2f\n", "Federal Tax", federalTax, "Provincial Tax", provincialTax, "Final Price", finalPrice );
        
    }
    
    
}    
