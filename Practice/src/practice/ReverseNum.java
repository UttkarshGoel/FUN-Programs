/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Uttkarsh
 */
public class ReverseNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		int rev = 1563847412;
		int num = reverse(rev);
		System.out.println("reversed num : " + num);
		System.out.println("Value : " + String.valueOf(rev).charAt(0));
    }
	 public static int reverse(int x) {
		int r, sum = 0;
		int len = String.valueOf(x).length();
        if(len>=10 && x>0){
			System.out.println("1st");
            return 0; 
        }
        else if((String.valueOf(x).charAt(0) > '2' || String.valueOf(x).charAt(len-1)>'2') 
				 && String.valueOf(x).length()>10){
			System.out.println("2nd");
            return 0;
        }
        else{
			System.out.println("3rd");
            if(x>0){
                while(x>0){
                    r = x%10;
                    sum = sum*10 + r;
                    x = x/10;
                }
            }
            else if(x<0){
                while(x<0){
                    r = x%10;
                    sum = sum*10 + r;
                    x = x/10;
                }
            }
            return sum;
        }
    }
}
