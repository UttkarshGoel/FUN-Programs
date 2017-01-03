/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Uttkarsh
 */
public class hashmap {
	public static void main(String args[]){
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey() + " : " + m.getValue());
		}
	}
}
