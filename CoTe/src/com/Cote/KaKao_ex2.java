package com.Cote;

import java.util.ArrayList;
import java.util.List;

public class KaKao_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {7,4,-2,4,-2,-9};
		int answer = 0;
		List<Integer> Slist = new ArrayList<Integer>();
		int ex1 = 0;
		int ex2 = 0;
		int ex3 = 0;
		int ex4 = 0;
		
		int i = 0;
		int j = 0;
		

		
		for (i=0; i < A.length; i++) {

			ex1 = 0;
			if(i< A.length-2) {	
				while(A[i] != A[i+2]) {
					
						if(A[i+1] == A[i+3]) {
							ex1 = ex1+2;
						}else {
							ex1 = ex1 +1;
						}
					
						
						
						

					Slist.add(ex1);
					System.out.println("같은 부분:" + A[i]);
					
					i++;
				}
			}
		}
		
		System.out.println("list:"+Slist);
		
		
		
		System.out.println("ex1:"+ex1);
		System.out.println("ex3:"+ex3);
		System.out.println("ex2:"+ex2);
	    System.out.println(answer);


	}

}
