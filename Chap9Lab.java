/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap9lab;

import java.util.Scanner;

/**
 *
 * @author skirchoff2
 */
public class Chap9Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner keyboard = new Scanner(System.in); 
           
           
        System.out.println("Enter customer information");
 
        
        System.out.println("Enter customer number:");

        int cusNum = keyboard.nextInt();
        
        System.out.println("Enter customer if Customer is subscribing to the mailing list (true/false):");
        
        boolean subYes = keyboard.nextBoolean();
        
        keyboard.nextLine();
        
        System.out.println("Enter customer name:");
        
        String cusName = "";
        
        cusName = keyboard.nextLine();
        
        
        
        System.out.println("Enter customer address:");
        
        String cusAddress = "";
        
        cusAddress = keyboard.nextLine();
        
        System.out.println("Enter customer phone number:");
        
        String cusPhone = ""; 
        
         cusPhone = keyboard.nextLine();     
        
         Customer Cus = new Customer(cusNum,subYes,cusName,cusAddress,cusPhone); 
        
         
        //System.out.print(Cus);
        
        
    }
    
}
