package com.Cote;

import java.util.*;

public class KaKao_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Marry Jane Watson-Parker
		//<mjwatsonpa@example.com>
		String S = "John Doe,Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker";
		String C = "example";
		List<String> Slist = new ArrayList<String>();
		S = S.replaceAll(", ", ",");
		String[] Ssplit = S.split(",");	
		List<String> list = new ArrayList<String>();
		String answer = "";
		int numA = 0;
		
		for(int i=0; i<Ssplit.length; i++) {
			Slist.add(Ssplit[i]);
		}
		
		System.out.println(Slist);
		for(int i=0; i<Ssplit.length; i++) {
			
			answer = "";
			
			String temp = Ssplit[i].toLowerCase();
			String RAtemp = temp.replaceAll("-", "");
			String[] SPtemp = RAtemp.split(" ");
			
			System.out.println(temp);//소문자
			System.out.println(RAtemp);//하이픈제거
			System.out.println(SPtemp.length);//스플릿 개수

			
			for(int j=0; j<SPtemp.length; j++) {
				if(j == (SPtemp.length - 1) ){
					answer += SPtemp[j];
				}else {
					answer += SPtemp[j].charAt(0);
				}
			}
			if(answer.length()>9) {
				answer = answer.substring(0,10);
			}
			
			if(answer.replaceAll("[^0-9]","") == "") {
				numA = 1;
			}
			
			System.out.println("center A:"+answer);

			if (list.contains(answer)) {
				list.add(answer);
				answer = answer+(numA+1)+"@"+C+".com";
				
			}else {
				list.add(answer);	
				answer = answer +"@"+C+".com";
				
			}
			
			System.out.println(answer);
			
		}
		

		
		
		
		System.out.println(list);
	
		

	}

}
