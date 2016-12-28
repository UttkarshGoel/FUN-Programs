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
public class PrimeNumber {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = s.nextInt();
	int flag = 0;
    	for(int i = 2; i < number/2; i++){
	    if(number%i==0){
		flag = 1;
	    }
	}
	if(flag==1){
	    System.out.println("Not a prime number");
	}
	else{
	    System.out.println("Prime Number");
	}
    }
}
