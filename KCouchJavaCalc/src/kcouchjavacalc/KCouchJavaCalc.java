/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kcouchjavacalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kyle
 */
public class KCouchJavaCalc {

    /**
     * @param args the command line arguments
     */
    //public static Scanner scan = new Scanner(System.in);
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String operation = "";
        double result = 0;
        boolean flag = false;
        while(true)
        {
            System.out.println("Java Calculator\n"
                    +"We can do:\nAddiiton\nSubtraction\n"
                    +"Type quit to exit the program\n"
                    +"What operation would you like to do?");
            try {
                //operation = scan.nextLine();
                operation = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(KCouchJavaCalc.class.getName()).log(Level.SEVERE, null, ex);
            }
            operation = operation.toLowerCase();
            //System.out.println(operation);
            
            switch(operation) {
                case "addition":
                    result = Addition();
                    System.out.println("The result is: "+result);
                    break;
                case "quit":
                    System.out.println("Thank you goodbye");
                    flag = true;
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
            
            
            if(flag)
                break;
        }
    }

    //Addition
    public static double Addition() {
        double num1 = 0;
        double num2 = 0;
        double result = 0;

        System.out.println("You Chose Addition!\n"
                + "Enter the first number");
        try {
            num1 = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(KCouchJavaCalc.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Enter the second number");
        try {
            num2 = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(KCouchJavaCalc.class.getName()).log(Level.SEVERE, null, ex);
        }
        result = num1 + num2;
        return result;
    }

}
