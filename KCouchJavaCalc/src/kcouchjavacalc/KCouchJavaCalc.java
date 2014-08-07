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
        double num1 = 0;
        double num2 = 0;
        double result = 0;
        boolean flag = false;
        while (true) {
            System.out.println("Java Calculator\n"
                    + "We can do:\nAddiiton\nSubtraction\n"
                    + "Type quit to exit the program\n"
                    + "What operation would you like to do?");
            try {
                //operation = scan.nextLine();
                operation = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(KCouchJavaCalc.class.getName()).log(Level.SEVERE, null, ex);
            }
            operation = operation.toLowerCase();
            //System.out.println(operation);

            switch (operation) {
                case "addition":
                    num1 = GetNumber();
                    num2 = GetNumber();
                    result = Addition(num1, num2);
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;
                case "subtraction":
                    num1 = GetNumber();
                    num2 = GetNumber();
                    result = Subtraction(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;
                case "division":
                    num1 = GetNumber();
                    num2 = GetNumber();
                    result = Division(num1, num2);
                    System.out.println(num1 + " / " + num2 + " = " + result);
                    break;
                case "quit":
                    System.out.println("Thank you goodbye");
                    flag = true;
                    break;
                default:
                    System.out.println("Invalid Operation");
            }

            if (flag) {
                break;
            }
        }
    }

    //Get Numbers
    public static double GetNumber() {
        double num = 0;
        System.out.println("Enter number");
        try {
            num = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(KCouchJavaCalc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return num;
    }

    //Addition
    public static double Addition(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double Subtraction(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double Division(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}
