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
    public static void main(String[] args) {
        System.out.println("Java Calculator\nWe can do:\nAddiiton\nSubtraction");
        System.out.println("What operation you like to do?");
        Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();
        System.out.println(operation);
        
    }

}
