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
public class Palindrome {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = s.nextInt();
        int r, temp, sum = 0;
        
        temp = number;
        while(number>0){
            r = number%10;
            sum = sum*10 + r;
            number = number/10;
        }
        if(temp == sum){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }
}
