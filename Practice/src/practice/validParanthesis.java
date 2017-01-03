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
public class validParanthesis {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int rS = 0 , rE = 0, cS = 0, cE = 0, sS = 0, sE = 0;
		String temp = "";
        for(int i = 0; i < str.length(); i++){
			switch (str.charAt(i)) {
				case '(':
					rS++;
					break;
				case ')':
					rE++;
					break;
				case '{':
					cS++;
					break;
				case '}':
					cE++;
					break;
				case '[':
					sS++;
					break;
				case ']':
					sE++;
					break;
				default:
					break;
			}
		}
		if((rS==rE) && (cS==cE) && (sS==sE)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Unequal");
		}
	}
}
