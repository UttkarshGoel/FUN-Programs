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
public class timeConversion {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String time = s.next(); //format-> "12:45:54PM";
		int hour = Integer.parseInt(time.substring(0,2));
		String hourStr = "";
		String timeStr = time.substring(2, time.length()-2);
		if(time.substring(time.length()-2, time.length()).equals("PM")){
			if(hour == 12){
				hour += 0;
				if(hour == 24){
					hourStr = "00";
				}
				else{
					hourStr = String.valueOf(hour);
				}
			}
			else{
				hour += 12;
				if(hour == 24){
					hourStr = "00";
				}
				else{
					hourStr = String.valueOf(hour);
				}
			}
			
			
		}
		else{
			if(hour == 12){
				hourStr = "00";
			}
			else{
				hourStr = String.valueOf(hour);
				hourStr = "0" + hourStr; 
			}
		}
		System.out.println(hourStr + timeStr);
		}
}
