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
public class Armstrong {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = s.nextInt();
        int len = String.valueOf(num).length();
        int temp = num;
		int[] arr = new int[len];
		int i = 0, sum =0;
		
		
		while(num > 0){
			arr[len-i-1] = num%10;
			num = num/10;
			i++;
		}
		for(i = 0; i < arr.length; i++){
			sum = sum + power(arr[i], len);
		}
		if(temp == sum){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not a armstrong number");
		}
    }
	public static int power(int x, int y){
		int p = 1;
		for(int i = 0; i < y; i++){
			p = p*x;
		}
		return p;
	}
}
