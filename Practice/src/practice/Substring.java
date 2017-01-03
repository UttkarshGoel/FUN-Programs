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
public class Substring {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = s.next();
		String[] arr = new String[str.length()];
		System.out.println("Str-->"+str.substring(0, 1));
        int flag = 0 ;
		for(int i = 0; i < str.length(); i++){
			for(int j = 0; j < str.length(); j++){
				System.out.println(Arrays.toString(arr) + " : " + str.substring(j, j+1));
				useLoop(arr, str.substring(j, j+1), flag);
				if(flag == 1){
					System.out.println("Going inside");
				}
				else{
					arr[i] = str.substring(i, i);
				}
			}
        } 
		System.out.println(Arrays.toString(arr));
	}
	public static boolean useLoop(String[] arr, String targetValue, int flag) {
    for(String s: arr){
        if(s.equals(targetValue)){
			flag = 1;
            return true;
		}
    }
    return false;
}
}
