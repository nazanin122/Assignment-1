/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1.pkg1;
import java.util.Scanner;
/**
 *
 * @author 2277120
 */
public class Assignment11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


 Scanner scan = new Scanner(System.in);
    
    System.out.print("Please enter your name: ");
    String yourName = scan.nextLine();
    
    System.out.print("Please enter your age: ");
    int yourAge = scan.nextInt();
    
    System.out.print("Please enter your gender: ");
    String yourGender = scan.next();
    
    System.out.print("Please enter your department: ");
    String yourDepartment = scan.next();
    
    System.out.print("Please enter the value of pi (3.1415926): ");
    double pi = scan.nextDouble();
    
    System.out.printf("\n %-14s:%s\n %-14s:%d\n %-14s:%s\n %-14s:%s\n %-14s:%.2f","Name", yourName, "Age", yourAge, "Gender", yourGender, "Department", yourDepartment, "PI", pi);
    }
    
}    
    

