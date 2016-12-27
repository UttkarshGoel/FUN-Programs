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
public class fibonacci {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number upto which fibonacci wali be display : ");
        int number = s.nextInt();
        int[] fiboArr = new int[number + 2];
        fiboArr[0] = 0;
        fiboArr[1] = 1;
        for(int i = 0 ; i < number; i++){
            fiboArr[i+2] = fiboArr[i+1] + fiboArr[i];
        }
        System.out.print("Fibonacci series :" + Arrays.toString(fiboArr));
    }
}
