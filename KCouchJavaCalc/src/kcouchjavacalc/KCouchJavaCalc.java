/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcouchjavacalc;

import java.util.Scanner;

/**
 *
 * @author Kyle
 */
public class KCouchJavaCalc {

    /**
     * @param args the command line arguments
     */
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        double result = 0;
        boolean flag = false;
        System.out.println("Java Calculator\nWe can do:\nAddiiton\nSubtraction");
        System.out.println("What operation you like to do?");
        // Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();
        //System.out.println(operation);
        if(operation.equals("addition"))
        {
            result = Addition();
        }
        else
        {
            flag = true;
        }
        if(flag)
        {
            System.out.println("Invalid Operation");
        }
        else
        {
            System.out.println("The result is: "+result); 
        }
        
    }
    
    //Addition
    public static double Addition()
    {
        double num1 = 0;
        double num2 = 0;
        double result = 0;
        
        System.out.println("You Chose Addition!\n"
                + "Enter the first number");
        num1 = scan.nextInt();
        System.out.println("Enter the second number");
        num2 = scan.nextInt();
        result = num1+num2;
        return result;
    }

}
