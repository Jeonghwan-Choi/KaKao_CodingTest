package com.Cote;

import java.util.Arrays;

public class Card_String_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "one4seveneight";
		int answer = 0;
		String numbers[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

		
		for(int i=0; i<numbers.length; i++) {
			 
			if(s.contains(numbers[i])) {
				s= s.replace(numbers[i], String.valueOf(Arrays.binarySearch(numbers, numbers[i])));

	        }
		}
		answer = Integer.parseInt(s);
		System.out.println(answer);
		
		

	}

}
