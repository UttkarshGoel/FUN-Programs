/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Uttkarsh
 */
public class arrayCircularRotation {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Array length : ");
		int len = s.nextInt();
		int[] arr = new int[len];
		for(int i = 0; i< len; i++){
			System.out.print(i + ": ");
			arr[i] = s.nextInt();
		}
		System.out.println("Array : "+Arrays.toString(arr));
		System.out.print("Number of rotations : ");
		int temp;
		int num = s.nextInt();
		for(int i = 0; i < num; i++){		
			for(int j = len-1; j > 0; j--){
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
			}
			System.out.println("Array inside : "+Arrays.toString(arr));
		}
		System.out.println("Array : "+Arrays.toString(arr));
	}
}
