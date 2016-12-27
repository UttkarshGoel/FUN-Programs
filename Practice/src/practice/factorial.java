/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Uttkarsh
 */
public class factorial {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();
        int fact = 1;
        
        while(num > 0){
            fact = fact * num;
            num = num - 1;
        }
        System.out.println("Factorial of the number : " + fact);
    }
}
