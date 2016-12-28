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
public class bubbleSort {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the list size : ");
		int size = s.nextInt();
		System.out.println("Enter the elements in the list");
		int[] arr = new int[size];
		int temp;
		for(int i = 0; i < size; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("Entered list is : " + Arrays.toString(arr));
		for(int i = 1; i <= size; i++){
			for(int j = 0; j < size-i; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("After Interation " + i + " : " + Arrays.toString(arr));
		}
	}
}
