/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment13;
import java.util.Scanner;
/**
 *
 * @author 2277120
 */
public class Assignment13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner input = new Scanner (System.in);
        System.out.print("Please enter a 4-digit Octal number: ");
        String octalDigit = input.nextLine();
        char position1 = octalDigit.charAt(0);
        int number1 = ((int) position1 - (int)'0');
        
        char position2 = octalDigit.charAt(1);
        int number2 = ((int) position2 - (int)'0');
        
        char position3 = octalDigit.charAt(2);
        int number3 = ((int) position3 - (int)'0');
        
        char position4 = octalDigit.charAt(3);
        int number4 = ((int) position4 - (int)'0');
        
        double integer11 = Math.pow(8,0) * number4;
        double integer12 = Math.pow(8,1) * number3;
        double integer13 = Math.pow(8,2) * number2;
        double integer14 = Math.pow(8,3) * number1;
        double integer = integer11 + integer12 + integer13 + integer14;
        System.out.printf("\n%-20s:%5s\n%-20s:%5.0f\n", "Octal Number", octalDigit, "Decimal Number", integer);
        

    }
    
}    
