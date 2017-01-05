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
public class diagonalDiff {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = s.nextInt();
		int[][] a = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print("a["+i+"]["+j+"] : ");
				a[i][j] = s.nextInt();
			}
		}
		System.out.println(Arrays.toString(a));
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(i == j){
					sum1 += a[i][j];
					sum2 += a[i][n-j-1];
				}
			}
		}
		System.out.println(Math.abs(sum1-sum2));
	}
}
